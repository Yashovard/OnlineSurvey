package com.sst.dao;

import java.util.List;

public interface MemberDao {
	public boolean insert(MemberDao member);

	public boolean update(MemberDao member);

	public List getMember();

	public void getMemberById(int id);

	public MemberDao verifyMember(String emailid, String password);
}
