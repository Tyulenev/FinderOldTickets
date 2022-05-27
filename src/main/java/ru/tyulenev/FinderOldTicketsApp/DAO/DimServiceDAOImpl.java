package ru.tyulenev.FinderOldTicketsApp.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.tyulenev.FinderOldTicketsApp.entity.DimServiceEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import java.util.List;

@Repository
public class DimServiceDAOImpl implements DimServiceDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<DimServiceEntity> getAllData() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("FROM DimServiceEntity",
                DimServiceEntity.class);
        List<DimServiceEntity> factVisit = query.getResultList();
        return factVisit;
    }
}
