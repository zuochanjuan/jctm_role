/**
* @Author christina
* @Date 2014年8月11日 下午2:15:24    
* @Version V4.0
* @Company 聚成华企科技有限公司
*/
package com.jctm;

import javax.servlet.http.HttpServletRequest;

public class RoleBean {

	private int id;
	private String secNum;
	private String theme;
	private String meetingTime;
	private String host;
	private String tableTopicHost;
	private String generalE;
	private String tableTopicE;
	private String ahCounter;
	private String timer;
	private String grammer;
	private String momentOfTruth;
	private String opening;
	private String ending;
	private String speech1;
	private String evaluator1;
	private String speech2;
	private String evaluator2;
	private String speech3;
	private String evaluator3;
	
	public RoleBean(HttpServletRequest request){
		String idStr = request.getParameter("id");
		if(idStr!=null&&!"".equals(idStr)){
			this.id= Integer.parseInt(request.getParameter("id"));
		}
		this.secNum= request.getParameter("secNum");
		this.theme = request.getParameter("theme");
		this.meetingTime = request.getParameter("meetingTime");
		this.host = request.getParameter("host");
		this.tableTopicHost = request.getParameter("tableTopicHost");
		this.generalE = request.getParameter("generalE");
		this.tableTopicE = request.getParameter("tableTopicE");
		this.ahCounter = request.getParameter("ahCounter");
		this.timer = request.getParameter("timer");
		this.grammer = request.getParameter("grammer");
		this.momentOfTruth = request.getParameter("momentOfTruth");
		this.opening = request.getParameter("opening");
		this.ending = request.getParameter("ending");
		this.speech1 = request.getParameter("speech1");
		this.evaluator1 = request.getParameter("evaluator1");
		this.speech2 = request.getParameter("speech2");
		this.evaluator2 = request.getParameter("evaluator2");
		this.speech3 = request.getParameter("speech3");
		this.evaluator3 = request.getParameter("evaluator3");
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the theme
	 */
	public String getTheme() {
		return theme;
	}
	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}
	/**
	 * @return the meetingTime
	 */
	public String getMeetingTime() {
		return meetingTime;
	}
	/**
	 * @param meetingTime the meetingTime to set
	 */
	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}
	/**
	 * @return the tableTopicHost
	 */
	public String getTableTopicHost() {
		return tableTopicHost;
	}
	/**
	 * @param tableTopicHost the tableTopicHost to set
	 */
	public void setTableTopicHost(String tableTopicHost) {
		this.tableTopicHost = tableTopicHost;
	}
	/**
	 * @return the generalE
	 */
	public String getGeneralE() {
		return generalE;
	}
	/**
	 * @param generalE the generalE to set
	 */
	public void setGeneralE(String generalE) {
		this.generalE = generalE;
	}
	/**
	 * @return the tableTopicE
	 */
	public String getTableTopicE() {
		return tableTopicE;
	}
	/**
	 * @param tableTopicE the tableTopicE to set
	 */
	public void setTableTopicE(String tableTopicE) {
		this.tableTopicE = tableTopicE;
	}
	/**
	 * @return the ahCounter
	 */
	public String getAhCounter() {
		return ahCounter;
	}
	/**
	 * @param ahCounter the ahCounter to set
	 */
	public void setAhCounter(String ahCounter) {
		this.ahCounter = ahCounter;
	}
	/**
	 * @return the timer
	 */
	public String getTimer() {
		return timer;
	}
	/**
	 * @param timer the timer to set
	 */
	public void setTimer(String timer) {
		this.timer = timer;
	}
	/**
	 * @return the grammer
	 */
	public String getGrammer() {
		return grammer;
	}
	/**
	 * @param grammer the grammer to set
	 */
	public void setGrammer(String grammer) {
		this.grammer = grammer;
	}
	/**
	 * @return the momentOfTruth
	 */
	public String getMomentOfTruth() {
		return momentOfTruth;
	}
	/**
	 * @param momentOfTruth the momentOfTruth to set
	 */
	public void setMomentOfTruth(String momentOfTruth) {
		this.momentOfTruth = momentOfTruth;
	}
	/**
	 * @return the opening
	 */
	public String getOpening() {
		return opening;
	}
	/**
	 * @param opening the opening to set
	 */
	public void setOpening(String opening) {
		this.opening = opening;
	}
	/**
	 * @return the ending
	 */
	public String getEnding() {
		return ending;
	}
	/**
	 * @param ending the ending to set
	 */
	public void setEnding(String ending) {
		this.ending = ending;
	}
	/**
	 * @return the speech1
	 */
	public String getSpeech1() {
		return speech1;
	}
	/**
	 * @param speech1 the speech1 to set
	 */
	public void setSpeech1(String speech1) {
		this.speech1 = speech1;
	}
	/**
	 * @return the evaluator1
	 */
	public String getEvaluator1() {
		return evaluator1;
	}
	/**
	 * @param evaluator1 the evaluator1 to set
	 */
	public void setEvaluator1(String evaluator1) {
		this.evaluator1 = evaluator1;
	}
	/**
	 * @return the speech2
	 */
	public String getSpeech2() {
		return speech2;
	}
	/**
	 * @param speech2 the speech2 to set
	 */
	public void setSpeech2(String speech2) {
		this.speech2 = speech2;
	}
	/**
	 * @return the evaluator2
	 */
	public String getEvaluator2() {
		return evaluator2;
	}
	/**
	 * @param evaluator2 the evaluator2 to set
	 */
	public void setEvaluator2(String evaluator2) {
		this.evaluator2 = evaluator2;
	}
	/**
	 * @return the speech3
	 */
	public String getSpeech3() {
		return speech3;
	}
	/**
	 * @param speech3 the speech3 to set
	 */
	public void setSpeech3(String speech3) {
		this.speech3 = speech3;
	}
	/**
	 * @return the evaluator3
	 */
	public String getEvaluator3() {
		return evaluator3;
	}
	/**
	 * @param evaluator3 the evaluator3 to set
	 */
	public void setEvaluator3(String evaluator3) {
		this.evaluator3 = evaluator3;
	}

	/**
	 * @return the secNum
	 */
	public String getSecNum() {
		return secNum;
	}

	/**
	 * @param secNum the secNum to set
	 */
	public void setSecNum(String secNum) {
		this.secNum = secNum;
	}
}
