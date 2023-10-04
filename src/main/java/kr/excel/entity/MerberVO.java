package kr.excel.entity;

public class MerberVO {
    private String name;
    private int age;
    private String birthdate;
    private String phone;
    private String address;
    private boolean iSMarried;

    public MerberVO(){};

    public MerberVO(String name, int age, String birthdate, String phone, String address, boolean iSMarried) {
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
        this.phone = phone;
        this.address = address;
        this.iSMarried = iSMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isiSMarried() {
        return iSMarried;
    }

    public void setiSMarried(boolean iSMarried) {
        this.iSMarried = iSMarried;
    }

    @Override
    public String toString() {
        return "MerberVO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", iSMarried=" + iSMarried +
                '}';
    }
}
