package com.sst.dao;

import java.util.List;

import com.sst.model.Client;

public interface ClientDao {
	public boolean insert(Client client);

	public boolean update(Client client);

	public List getClient();

	public void getClientById(int id);

	public Client verifyClient(String name, String password);

}
