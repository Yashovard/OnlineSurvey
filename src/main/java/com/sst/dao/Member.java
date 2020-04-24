package com.sst.dao;

import java.util.List;

public interface Member {
	public boolean insert(Member member);

	public boolean update(Member member);

	public List getMember();

	public void getMemberById(int id);

	public Member verifyMember(String emailid, String password);
}
