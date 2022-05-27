package ru.tyulenev.FinderOldTicketsApp.Service;

import ru.tyulenev.FinderOldTicketsApp.RestData.ResponseData;
import ru.tyulenev.FinderOldTicketsApp.entity.DimServiceEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import java.util.List;

public interface ServiceVisits {
    public List<DimVisitEntity> getAllVisits();
    public List<FactVisitTransactionEntity> getFactVisits();
    public List<DimServiceEntity> getDimServices();
    public ResponseData getResponce(String ticketId, Long date);
}
