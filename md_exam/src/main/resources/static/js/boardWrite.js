//ck에디터 가져오기
document.addEventListener('DOMContentLoaded', function () {
    let editorElement = document.querySelector('#editor');

     if (editorElement) {
            ClassicEditor.create(editorElement, {
                    removePlugins: ['Heading', 'SimpleUploadAdapter'],
                    language: "ko"
                })
                .then(editor => {
                // CKEditor 인스턴스가 생성되었을 때의 콜백 함수

                console.log('에디터가 초기화', editor);

                let btn = document.querySelector(".submit");
                let subject = document.querySelector("input[name=subject]");

                btn.addEventListener('click', (e) => {
                    e.preventDefault();
                    let formData = new FormData();
                    let uploadData = document.querySelector("#upload-form input[name='files']").files;

                    for (let i = 0; i < uploadData.length; i++) {
                        formData.append("files", uploadData[i]);
                        console.log('i =', i + 1);
                    }

                    formData.append('qSubject', subject.value);
                    formData.append('qContent', editor.getData());

                    $.ajax({
                        type: "POST",
                        url: "/board/boardWrite",
                        data: formData,
                        contentType: false,
                        processData: false,
                        success: function (result) {

                        }
                    });
                });
            })
            .catch(error => {
                console.error('에디터가 초기화실패', error);
            });
    } else {
        console.error('에디터요소 매칭 실패');
    }
});
