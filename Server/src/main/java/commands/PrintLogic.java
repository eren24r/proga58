package commands;

import objectResAns.ObjectResAns;
import statics.Static;
import сlasses.Organization;

import java.util.HashSet;

public class PrintLogic implements Command{
    private String name = "print_logic_type";
    @Override
    public ObjectResAns doo(HashSet<Organization> mySet, String s) {
        if(Static.isPrint == 1) {
            return new ObjectResAns("Console\n", true);
        }else{
            return new ObjectResAns("Log File\n", true);
        }
    }

    @Override
    public String des() {
        return "print_logic_type: тип вывода!";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
