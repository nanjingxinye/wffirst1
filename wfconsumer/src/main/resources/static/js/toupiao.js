$(function () {
    biaoti();
});


//加载标题信息
function biaoti() {
    $.ajax({
        url:"queryAllSubject",
        type:"post",
        data:{},
        async:false,
        dataType:"json",
        success:function (mes) {
          console.log(mes);
            var str = "";
          $.each(mes,function (i) {
              var m = mes[i];
            str+=` <tr id="tr">
                  <td>${m.id}</td>
                  <td><a href="javascript:;" onclick="xi(${m.id})">${m.title}</a></td>
                  <td>${m.totalVotes+"/"+m.viewTimes}</td>
                  <td>${m.createDate}</td>
                  </tr>`;
          });
          $("#tb").append(str);


        },error:function () {
           alert("queryAllSubject----->queryAllSubject")
        }
    });
}


function xi(sid){

    updatechakan(sid);

}

function updatechakan(id) {

    $.ajax({
        url: "updateSubject",
        type: "post",
        data: {"id":id},
        async: false,
        dataType: "json",
        success: function (mes) {

            window.location="tou.html?sid="+id;

        },error:function () {
            alert("updateSubject---->你的方法出错了")
        }


    });



}