<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="http://${header['host']}${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Cache-Control" content="no-store"></meta>
	<meta http-equiv="Pragma" content="no-cache"></meta>
	<meta http-equiv="Expires" content="0"></meta>
    <title>角色选择表-聚成头马双语国际演讲俱乐部</title>
    <link href="${ctx}/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui-1.4/themes/bootstrap/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui-1.4/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui-1.4/demo/demo.css">
    <script type="text/javascript" src="${ctx}/jquery-easyui-1.4/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/jquery-easyui-1.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/jquery-easyui-1.4/plugins/jquery.edatagrid.js"></script>
</head>
<body>
    <h2><img src="${ctx}/bootstrap/img/1.jpg" class="img-circle" width="80" height="80"/>&nbsp;聚成头马双语国际演讲俱乐部</h2>
    <span class="label label-important">操作提示</span>
    <ul>
	  <li>【双击】你想担任的角色框，点击【保存】按钮确认</li>
	  <li>如果已经有人选择的角色，请不要随意修改，谢谢配合~ ^_^</li>
	</ul>
    
    <table id="dg" title="角色选择表" style="width:1800px;height:360px"
            toolbar="#toolbar" idField="id"
            rownumbers="true" fitColumns="true" singleSelect="true">
        <thead>
            <tr>
            	<th data-options="field:'id',hidden:true">id</th>
                <th field="secNum" width="40" editor="text">期数</th>
                <th field="theme" width="80" editor="text">主题</th>
                <th field="meetingTime" width="50" editor="text">时间</th>
                <th field="host" width="50" editor="text">主持人</th>
                <th field="tableTopicHost" width="50" editor="text">即兴主持人</th>
                <th field="generalE" width="50" editor="text">总点评</th>
                <th field="tableTopicE" width="50" editor="text">即兴点评</th>
                <th field="ahCounter" width="50" editor="text">哼哈官</th>
                <th field="timer" width="50" editor="text">时间官</th>
                <th field="grammer" width="50" editor="text">句法官</th>
                <th field="momentOfTruth" width="50" editor="text">真情时刻</th>
                <th field="opening" width="50" editor="text">开场白</th>
                <th field="ending" width="50" editor="text">总结陈词</th>
                <th field="speech1" width="50" editor="text">演讲1</th>
                <th field="evaluator1" width="50" editor="text">点评人1</th>
                <th field="speech2" width="50" editor="text">演讲2</th>
                <th field="evaluator2" width="50" editor="text">点评人2</th>
                <th field="speech3" width="50" editor="text">演讲3</th>
                <th field="evaluator3" width="50" editor="text">点评人3</th>
            </tr>
        </thead>
    </table>
    <div id="toolbar">
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">新增会议</a>
        <!--<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a>-->
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:$('#dg').edatagrid('saveRow')">保存</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-undo" plain="true" onclick="javascript:$('#dg').edatagrid('cancelRow')">取消</a>
    </div>
    <script type="text/javascript">
        $(function(){
            $('#dg').edatagrid({
                url: '${ctx}/jctm?operateType=get',
                saveUrl: '${ctx}/jctm?operateType=add',
                updateUrl: '${ctx}/jctm?operateType=update'
                //destroyUrl: 'destroy_user.php'
            });
        });
    </script>
    <br/>
    <br/>
    <span class="label label-info">JCTM相关信息</span>
    <p class="text-info">
		邮箱：jctm520@qq.com<br/>
		微信号：jctm520<br/>
		地址：深圳福田区八卦路31号 众鑫科技大厦19楼 聚成股份集团商学院<br/>
		时间：每周四 18:00 - 20:00<br/>
    </p>
    <address>
	  <strong>新浪微博</strong><br>
	  <a href="http://weibo.com/jctm520" target="_blank">http://weibo.com/jctm520</a><br/>
	  <strong>腾讯微博</strong><br>
	  <a href="http://t.qq.com/jctm520" target="_blank">http://t.qq.com/jctm520</a>
	</address>
	<blockquote class="pull-right">
	  <p>The beauty of life is only made by walking, did not wait out brilliant.</p>
	  <small>人生只有走出来的美丽，没有等出来的辉煌。</small>
	</blockquote>
    <script src="${ctx}/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>