package com.moisegui.citizenship.entities;

import com.flipkart.hbaseobjectmapper.Family;
import com.flipkart.hbaseobjectmapper.HBColumn;
import com.flipkart.hbaseobjectmapper.HBRecord;
import com.flipkart.hbaseobjectmapper.HBTable;
import lombok.*;

// create 'Users','Info'
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
@EqualsAndHashCode
@HBTable(name = "Users", families = {
        @Family(name = "Info")
})
public class User implements HBRecord<String> {
    private String id;
    @HBColumn(family = "Info", column = "nom")
    private String nom;
    @HBColumn(family = "Info", column = "prenom")
    private String prenom;
    @HBColumn(family = "Info", column = "email")
    private String email;
    @HBColumn(family="Info", column="username")
    private String username;
    @HBColumn(family="Info", column="cne")
    private String cne;
    @HBColumn(family = "Info", column = "password")
    private String password;
    @HBColumn(family = "Info", column = "role")
    private String role;

    @Override
    public String composeRowKey() {
        return email.split("@")[0];
    }

    @Override
    public void parseRowKey(String s) {
        id = s;
    }
}
