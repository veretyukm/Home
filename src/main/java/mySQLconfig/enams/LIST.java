package mySQLconfig.enams;

public enum LIST {
    ID("id"),NAME("Name"),FAMILE("Famile"),EMAIL("email"),PHISICAL_ADRESS("Phisical_adress"),BIRTHDAY("birthday");
    String fieldName;

    private LIST (String fieldName){
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return fieldName;
    }
}
