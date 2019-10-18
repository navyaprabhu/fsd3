package comm.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import comm.example.factory.HibernateUtilFactory;
import comm.example.model.League;

public class LeagueDaoImpl implements LeagueDao {

	private Session session = null;
	private SessionFactory factory = null;

	{
		factory = HibernateUtilFactory.getSessionFactory();
	}

	public void createLeague(League league) {
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			session.persist(league);
			session.getTransaction().commit();

		} finally {
			session.close();
		}
	}

}