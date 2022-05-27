package ru.tyulenev.FinderOldTicketsApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.tyulenev.FinderOldTicketsApp.DAO.DimServiceDAO;
import ru.tyulenev.FinderOldTicketsApp.DAO.DimVisitDAO;
import ru.tyulenev.FinderOldTicketsApp.DAO.FactVisitDAO;
import ru.tyulenev.FinderOldTicketsApp.RestData.ResponseData;
import ru.tyulenev.FinderOldTicketsApp.entity.DimServiceEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

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
        return listData;
    }

    @Override
    @Transactional
    public List<FactVisitTransactionEntity> getFactVisits() {
        List<FactVisitTransactionEntity> listData = factVisitDAO.getAllData();
        System.out.println("Service meth getFactVisits:\n");
        return listData;
    }

    @Override
    @Transactional
    public List<DimServiceEntity> getDimServices() {
        List<DimServiceEntity> listData = dimServiceDAO.getAllData();
        System.out.println("Service meth getFactVisits:\n");
        return listData;
    }

    @Override
    @Transactional
    public ResponseData getResponce(String ticketId, Long date) {
        ResponseData responseData = new ResponseData();
        List<DimVisitEntity>  listDimVisit = getAllVisits();
        List<FactVisitTransactionEntity> listFactVisit = getFactVisits();
        List<DimServiceEntity> listDimService = getDimServices();
//        Calendar dateInternal = new Calendar(TimeZone. date);
//        System.out.println("Date " + date + ", dateInternal- " + dateInternal);
//        System.out.println("dateInternal.getTime()  " + dateInternal.getTime());

        return responseData;
    }

}
