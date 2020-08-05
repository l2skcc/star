package carrental_final_lay126;

public class StarUpdated extends AbstractEvent {

    private Long id;
    private String carNo;
    private String starts;
    private String resvNo;

    public StarUpdated(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }
    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }
    public String getResvNo() {
        return resvNo;
    }

    public void setResvNo(String resvNo) {
        this.resvNo = resvNo;
    }
}
