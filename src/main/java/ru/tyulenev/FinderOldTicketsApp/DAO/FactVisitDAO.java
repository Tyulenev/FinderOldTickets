package ru.tyulenev.FinderOldTicketsApp.DAO;

import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import java.util.List;

public interface FactVisitDAO {
    public List<FactVisitTransactionEntity> getAllData();
}
