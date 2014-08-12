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
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui-1.4/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui-1.4/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui-1.4/demo/demo.css">
    <script type="text/javascript" src="${ctx}/jquery-easyui-1.4/jquery.min.js"></script>
    <script type="text/javascript" src="${ctx}/jquery-easyui-1.4/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/jquery-easyui-1.4/plugins/jquery.edatagrid.js"></script>
</head>
<body>
    <h2>聚成头马双语国际演讲俱乐部</h2>
    <p><strong>操作提示</strong>：【双击】你想担任的角色框，点击【保存】按钮确认。</p>
    <p style="color: red;"><strong>如果已经有人选择的角色，请不要随意修改，谢谢配合~ ^_^</strong></p>
    
    <table id="dg" title="角色选择表" style="width:1800px;height:300px"
            toolbar="#toolbar" pagination="true" idField="id"
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
        <!--<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:$('#dg').edatagrid('addRow')">新增会议</a>-->
        <!--<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="javascript:$('#dg').edatagrid('destroyRow')">Destroy</a> -->
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
    <p style="color: blue;">
    <strong>JCTM相关信息</strong><br/>
   	新浪微博：http://weibo.com/jctm520<br/>
	腾讯微博：http://t.qq.com/jctm520<br/>
	邮箱：jctm520@qq.com<br/>
	微信号：jctm520<br/>
	地址：深圳福田区八卦路31号 众鑫科技大厦19楼 聚成股份集团商学院<br/>
	时间：每周四 18:00 - 20:00<br/>
    </p>
    <p style="color: grey;padding-top: 10px;">此系统由左婵娟开发，如有疑问和建议请联系电话15818764615~</p>
</body>
</html>