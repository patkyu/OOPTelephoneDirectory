import java.io.Serializable;


@SuppressWarnings("serial")
public class SLNode implements Serializable {

    private String name;
    private String address;
    private String phoneNumber;
    private SLNode next;


    // create instance of SLNode and set next to 'null'
    public SLNode() {
        //data = -1;
        next = null;
    }

    /**
     * create setters and getters for name, address, phone number, and SLNode
     */

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SLNode getNext() {
        return next;
    }

    public void setNext(SLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Name = " + name + ", Address = " + address + ", Phone Number = "
                + phoneNumber;
    }
}