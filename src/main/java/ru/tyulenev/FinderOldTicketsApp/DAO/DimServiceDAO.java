package ru.tyulenev.FinderOldTicketsApp.DAO;

import ru.tyulenev.FinderOldTicketsApp.entity.DimServiceEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import java.util.List;

public interface DimServiceDAO {
    public List<DimServiceEntity> getAllData();
}
