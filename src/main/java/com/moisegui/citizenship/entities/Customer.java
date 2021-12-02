package com.moisegui.citizenship.entities;

import com.flipkart.hbaseobjectmapper.Family;
import com.flipkart.hbaseobjectmapper.HBColumn;
import com.flipkart.hbaseobjectmapper.HBRecord;
import com.flipkart.hbaseobjectmapper.HBTable;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@EqualsAndHashCode
@HBTable(name = "Customers", families = {
        @Family(name = "Info")
})
public class Customer implements HBRecord<String> {
    private String rowKey;
    @HBColumn(family = "Info", column = "companyName")
    private String companyName;
    @HBColumn(family = "Info", column = "contactName")
    private String contactName;
    @HBColumn(family = "Info", column = "contactTIT")
    private String contactTIT;
    @HBColumn(family = "Info", column = "address")
    private String address;
    @HBColumn(family = "Info", column = "city")
    private String city;
    @HBColumn(family = "Info", column = "region")
    private String region;
    @HBColumn(family = "Info", column = "postalCode")
    private String postalCode;
    @HBColumn(family = "Info", column = "country")
    private String country;
    @HBColumn(family = "Info", column = "phone")
    private String phone;
    @HBColumn(family = "Info", column = "fax")
    private String fax;

    @Override
    public String composeRowKey() {
        return rowKey;
    }

    @Override
    public void parseRowKey(String s) {
        rowKey = s;
    }
}
