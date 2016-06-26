package com.barmazeto.entity.order;

import java.util.Date;

public class Order {
	private Integer idOrder;
	private Date timeStarted;
	private Date timeFinished;
	private Integer idBarman;
	private Integer idWaiter;

	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	public Date getTimeStarted() {
		return timeStarted;
	}

	public void setTimeStarted(Date timeStarted) {
		this.timeStarted = timeStarted;
	}

	public Date getTimeFinished() {
		return timeFinished;
	}

	public void setTimeFinished(Date timeFinished) {
		this.timeFinished = timeFinished;
	}

	public Integer getIdBarman() {
		return idBarman;
	}

	public void setIdBarman(Integer idBarman) {
		this.idBarman = idBarman;
	}

	public Integer getIdWaiter() {
		return idWaiter;
	}

	public void setIdWaiter(Integer idWaiter) {
		this.idWaiter = idWaiter;
	}
}
