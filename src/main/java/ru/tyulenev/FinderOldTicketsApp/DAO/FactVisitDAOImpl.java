package ru.tyulenev.FinderOldTicketsApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import java.util.List;

@Repository
public class FactVisitDAOImpl implements FactVisitDAO {
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public List<FactVisitTransactionEntity> getAllData() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from FactVisitTransactionEntity",
                FactVisitTransactionEntity.class);
        List<FactVisitTransactionEntity> factVisit = query.getResultList();
        return factVisit;
    }
}
