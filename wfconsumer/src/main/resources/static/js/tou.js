var url =window.location.search;
var reg = /\d+$/;
var sid = url.match(reg)[0];
$(function () {
  
    tongji(sid);
    piao(sid);

});

function tongji(sid) {
    $.ajax({
        url: "querySubject",
        type: "post",
        data: {"id":sid},
        async: false,
        dataType: "json",
        success: function (mes) {

            var str ="";

                str+=`<td>共有：${mes.totalVotes}投票，</td>
                       <td>${mes.viewTimes}次查看</td>`;

            $("#tdt").html(str);
        },error:function () {
        alert("querySubject------->出错了")
        }
    });
}

function piao(sid) {
    $.ajax({
        url: "queryAllOptions",
        type: "post",
        data: {"id": sid},
        async: false,
        dataType: "json",
        success: function (mes) {

            var str="";
            $.each(mes,function (i) {
                var m = mes[i];
                str += `<td><input type="checkbox" name="text" value="${m.id}" /><span>${m.optContent}</span></td>
               
`
            });
            $("#cb").html(str);

        },error:function () {
        alert("queryAllOptions---->错误！");
        }

    });
}



function tijiao() {
    /*var a=[];
    $("input:checkbox[name='text']:checked").each(function () {
        a.push($(this).val());
    });
     alert(a);
     console.log(a);*/
   
    
}



