import dataObject.UserList;
import mySQLconfig.StatemenT;
import mySQLconfig.enams.LIST;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;
import java.util.*;

public class TestDB {
    static StatemenT statemenT;
    @BeforeClass
    public static void b(){
        statemenT = new StatemenT();
    }

    @Test
    public void test1(){
        UserList name = statemenT.selectById(LIST.ID,"1");
        System.out.println(name.name);
    }

    @Test
    public void test2 () {
        for (UserList l:statemenT.selectUniqueMail(LIST.EMAIL,"space@gmail.com")){
            System.out.println(l.name+" "+l.family+" "+l.email);
        }
        }

    @Test
    public void test3 () {
        ArrayList<String> listUnique = new ArrayList<String>();
        for (UserList l: statemenT.selectUniqueName(LIST.NAME)){
            listUnique.add(l.name);
        }
        Set<String> set = new LinkedHashSet<String>(listUnique);
        System.out.println(set);
    }




    }


