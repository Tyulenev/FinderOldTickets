package ru.tyulenev.FinderOldTicketsApp.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.tyulenev.FinderOldTicketsApp.RestData.ResponseData;
import ru.tyulenev.FinderOldTicketsApp.Service.ServiceVisits;
import ru.tyulenev.FinderOldTicketsApp.entity.DimServiceEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.DimVisitEntity;
import ru.tyulenev.FinderOldTicketsApp.entity.FactVisitTransactionEntity;

import java.util.*;

@RestController
@RequestMapping("/api")
public class RESTController {

    @Autowired
    private ServiceVisits dimVisitService;

    @GetMapping("/all_visits")
    public List<DimVisitEntity> showAllVisits() {
        List<DimVisitEntity> allVisits = dimVisitService.getAllVisits();
        return allVisits;
    }

    @GetMapping("/fact_visits")
    public List<FactVisitTransactionEntity> showfactVisits() {
        List<FactVisitTransactionEntity> factVisits = dimVisitService.getFactVisits();
        return factVisits;
    }

    @GetMapping("/dim_services")
    public List<DimServiceEntity> showDimServices() {
        List<DimServiceEntity> factVisits = dimVisitService.getDimServices();
        return factVisits;
    }

    @GetMapping("/test1")
    public ResponseData test1() {
        ResponseData resData = new ResponseData();
        resData.setCustom_1("Custom1");
        resData.setCustom_2("Custom2");
        resData.setCustom_3("Custom3");
        resData.setCustom_4("Custom4");
        resData.setCustom_5("Custom5");
        resData.setTicket_id("A999");
        List<Long> list1 = new ArrayList<>();
        list1.add(1L);
        list1.add(3L);
        list1.add(6L);
        resData.setOrigin_ids(list1);
        return resData;
    }

    @GetMapping("/getInfo/ticket/{id}/date/{date}")
    public String getDataByDateAndId(@PathVariable String id,
                                           @PathVariable String date) {
        String responseData = "getDataByDateAndId :\n id = " + id +
                "\ndate = " + date;
        return responseData;
    }
}
