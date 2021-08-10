package QuestionFour;

import java.util.Date;
import java.util.UUID;

public class NewCustomer {
    private int id ;

    private UUID newId;

    private String name;

    private String address;

    private Integer rfid;

    private Date joinedDate;

    public NewCustomer(int id, UUID newId, String name, String address, Integer rfid, Date joinedDate) {
        this.id = id;
        this.newId = newId;
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

    public UUID getNewId() {
        return newId;
    }

    public void setNewId(UUID newId) {
        this.newId = newId;
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
