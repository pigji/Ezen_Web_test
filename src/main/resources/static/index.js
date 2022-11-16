alert("글쓰기")

// 글쓰기
function bwrite(){

    let data = {
        btitle : document.querySelector('.btitle').value,
        bcontent : document.querySelector('.bcontent').value
    }

    alert("등록버튼 누름")
    $.ajax({
        url: "/bwrite",
        type: "POST",
        data: JSON.stringify(data),
        contentType: "application/json",   // 객체로 전달
        success: function( re ){
                alert( re )
                console.log( re )
        }
    })
}

// 글보기
blist()
function blist(){
    $.ajax({
        url: "/blist",
        type: "GET",
        success: function( blist ){
            console.log( blist )

            let html = '<tr> <th> 번호 </th> <th> 제목 </th> <th> 내용 </th></tr>';
            blist.forEach( (m) => {
                     html +=
                     '<tr> <th>'+m.bno+'</th> <th>'+m.btitle+'</th> <th>'+m.bcontent+'</th> </tr>';
            })
            document.querySelector(".mtable").innerHTML = html;
        }
    })
}


