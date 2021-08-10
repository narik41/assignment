package QuestionFour;

import java.util.Date;

public class Customer {

    private int id ;

    private String name;

    private String address;

    private Integer rfid;

    private Date joinedDate;

    public Customer(int id, String name, String address, Integer rfid, Date joinedDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.rfid = rfid;
        this.joinedDate = joinedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRfid() {
        return rfid;
    }

    public void setRfid(Integer rfid) {
        this.rfid = rfid;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }
}
