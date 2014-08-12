/**
* @Author christina
* @Date 2014年8月11日 下午2:06:12    
* @Version V4.0
* @Company 聚成华企科技有限公司
*/
package com.jctm;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JctmRoleServlet extends HttpServlet {
	public String operateType = "";
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		operateType = request.getParameter("operateType");
		if(operateType!=null&&!"".equals(operateType)){
			if("get".equals(operateType)){//列表
				PrintWriter out;
				try {
					response.setContentType("text/html");
					response.setCharacterEncoding("utf-8");
					out = response.getWriter();
					String listStr = list();
					out.print(listStr);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}else if("add".equals(operateType)){//添加
				RoleBean roleBean = new RoleBean(request);
				try {
					add(roleBean);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}else if("update".equals(operateType)){//添加
				RoleBean roleBean = new RoleBean(request);
				try {
					update(roleBean);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//列表
	public String list() throws SQLException{
		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql="select * from jctm_role";
			rs = stmt.executeQuery(sql);
			int count = 0;
			String listStr = "";
			String tempStr = "";
			while(rs.next()){
				tempStr = tempStr + ",{\"id\":\""+rs.getInt("id")+"\",\"secNum\":\""+rs.getString("secNum")+"\",\"theme\":\""+rs.getString("theme")+"\",\"meetingTime\":\""+rs.getString("meetingTime")+"\",\"host\":\""+rs.getString("host")+"\",\"tableTopicHost\":\""+rs.getString("tableTopicHost")+"\",\"generalE\":\""+rs.getString("generalE")+"\",\"tableTopicE\":\""+rs.getString("tableTopicE")+"\",\"ahCounter\":\""+rs.getString("ahCounter")+"\",\"timer\":\""+rs.getString("timer")+"\",\"grammer\":\""+rs.getString("grammer")+"\",\"momentOfTruth\":\""+rs.getString("momentOfTruth")+"\",\"opening\":\""+rs.getString("opening")+"\",\"ending\":\""+rs.getString("ending")+"\",\"speech1\":\""+rs.getString("speech1")+"\",\"evaluator1\":\""+rs.getString("evaluator1")+"\",\"speech2\":\""+rs.getString("speech2")+"\",\"evaluator2\":\""+rs.getString("evaluator2")+"\",\"speech3\":\""+rs.getString("speech3")+"\",\"evaluator3\":\""+rs.getString("evaluator3")+"\"}";
				count = count + 1;
			}
			if(!"".equals(tempStr)){
				listStr="{\"total\":\""+count+"\",\"rows\":["+tempStr.substring(1)+"]}";
			}
			return listStr;
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}
		return null;
	}
	
	//添加
	public void add(RoleBean roleBean) throws SQLException{
		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql="insert into jctm_role(secNum,theme,meetingTime,host,tableTopicHost,generalE,tableTopicE,ahCounter,timer,grammer,momentOfTruth,opening,ending,speech1,evaluator1,speech2,evaluator2,speech3,evaluator3) values('"+roleBean.getSecNum()+"','"+roleBean.getTheme()+"','"+roleBean.getMeetingTime()+"','"+roleBean.getHost()+"','"+roleBean.getTableTopicHost()+"','"+roleBean.getGeneralE()+"','"+roleBean.getTableTopicE()+"','"+roleBean.getAhCounter()+"','"+roleBean.getTimer()+"','"+roleBean.getGrammer()+"','"+roleBean.getMomentOfTruth()+"','"+roleBean.getOpening()+"','"+roleBean.getEnding()+"','"+roleBean.getSpeech1()+"','"+roleBean.getEvaluator1()+"','"+roleBean.getSpeech2()+"','"+roleBean.getEvaluator2()+"','"+roleBean.getSpeech3()+"','"+roleBean.getEvaluator3()+"')";
			stmt.executeUpdate(sql);
			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}
	}
	
	//添加
	public void update(RoleBean roleBean) throws SQLException{
		Connection  conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.createStatement();
			String sql="update jctm_role set secNum='"+roleBean.getSecNum()+"',theme='"+roleBean.getTheme()+"',meetingTime='"+roleBean.getMeetingTime()+"',host='"+roleBean.getHost()+"',tableTopicHost='"+roleBean.getTableTopicHost()+"',generalE='"+roleBean.getGeneralE()+"',tableTopicE='"+roleBean.getTableTopicE()+"',ahCounter='"+roleBean.getAhCounter()+"',timer='"+roleBean.getTimer()+"',grammer='"+roleBean.getGrammer()+"',momentOfTruth='"+roleBean.getMomentOfTruth()+"',opening='"+roleBean.getOpening()+"',ending='"+roleBean.getEnding()+"',speech1='"+roleBean.getSpeech1()+"',evaluator1='"+roleBean.getEvaluator1()+"',speech2='"+roleBean.getSpeech2()+"',evaluator2='"+roleBean.getEvaluator2()+"',speech3='"+roleBean.getSpeech3()+"',evaluator3='"+roleBean.getEvaluator3()+"' where id="+roleBean.getId();
			stmt.executeUpdate(sql);
			conn.commit();
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			if(rs!=null){
				rs.close();
			}
			if(stmt!=null){
				stmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		}
	}
}
