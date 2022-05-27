package ru.tyulenev.FinderOldTicketsApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tyulenev.FinderOldTicketsApp.DAO.DimServiceDAO;
import ru.tyulenev.FinderOldTicketsApp.DAO.DimVisitDAO;
import ru.tyulenev.FinderOldTicketsApp.DAO.FactVisitDAO;
import ru.tyulenev.FinderOldTicketsApp.entity.DimServiceEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
public class ServiceVisitsImpl implements ServiceVisits {

    @Autowired
    private DimVisitDAO visitDAO;
    @Autowired
    private FactVisitDAO factVisitDAO;
    @Autowired
    private DimServiceDAO dimServiceDAO;

    @Override
    @Transactional
    public List<DimVisitEntity> getAllVisits() {
        List<DimVisitEntity> listData = visitDAO.getAllData();
        System.out.println("Service meth getAllVisits:\n");
        for (DimVisitEntity dvd: listData) {
            System.out.println(dvd);
        }
        return listData;
    }

    @Override
    @Transactional
    public List<FactVisitTransactionEntity> getFactVisits() {
        List<FactVisitTransactionEntity> listData = factVisitDAO.getAllData();
        System.out.println("Service meth getFactVisits:\n");
        for (FactVisitTransactionEntity dvd: listData) {
            System.out.println(dvd);
        }
        return listData;
    }

    @Override
    @Transactional
    public List<DimServiceEntity> getDimServices() {
        List<DimServiceEntity> listData = dimServiceDAO.getAllData();
        System.out.println("Service meth getFactVisits:\n");
        for (DimServiceEntity dvd: listData) {
            System.out.println(dvd);
        }
        return listData;
    }


}
