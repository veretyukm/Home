package dataObject;

import mySQLconfig.enams.LIST;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserList {
   public int id;
    public String name, family, email, phisical_adress, birthday;

    public UserList(int id, String name, String family, String email, String phisical_adress, String birthday) {
        this.id = id;
        this.name = name;
        this.family = family;
        this.email = email;
        this.phisical_adress = phisical_adress;
        this.birthday = birthday;
    }

    public UserList(ResultSet resultSet) {
        try {
            this.id = resultSet.getInt(LIST.ID.getFieldName());
            this.name = resultSet.getString(LIST.NAME.getFieldName());
            this.family = resultSet.getString(LIST.FAMILE.getFieldName());
            this.email = resultSet.getString(LIST.EMAIL.getFieldName());
            this.phisical_adress = resultSet.getString(LIST.PHISICAL_ADRESS.getFieldName());
            this.birthday = resultSet.getString(LIST.BIRTHDAY.getFieldName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
