package com.sst.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.sst.dao.ClientDao;
import com.sst.model.Client;

public class ClientDaoImpl implements ClientDao {
	@Autowired
	SessionFactory sessionFactory;
	Client client;

	public boolean insert(Client client) {
		Session session = null;
		boolean status = true;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(client);
			transaction.commit();

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return status;
	}

	public boolean update(Client client) {
		Session session = null;
		boolean status = true;
		try {
			session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.saveOrUpdate(client);
			transaction.commit();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (session != null)
				session.close();

		}
		return status;
	}

	public List getClient() {
		Session session = null;
		List<Client> clientList = new ArrayList<Client>();
		try {
			session = sessionFactory.openSession();
			clientList = session.createQuery("from Client").list();
			System.out.println(clientList.size());

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (session != null)
				session.close();
		}

		return clientList;
	}

	public Client getClientById(int id) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.createQuery("From Client where id=:id");
			query.setParameter("id", id);
			client = (Client) query.uniqueResult();
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return client;
	}

	public Client verifyClient(String name, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
