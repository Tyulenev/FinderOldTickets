package ru.tyulenev.FinderOldTicketsApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;

import java.util.List;

@Repository
public class DimVisitDAOImpl implements DimVisitDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<DimVisitEntity> getAllData() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from DimVisitEntity", DimVisitEntity.class);
        List<DimVisitEntity> allVisits = query.getResultList();
        return allVisits;
    }

}
