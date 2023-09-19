
public class BICDirectoryEntry {
    private String NameP;
//    �������� ����� ed:Name
    private String DateIn;
//    �������� ����� AccDocDate
    private int PtType;
//    �������� ����� AccDocNo
    private int Rgn;
//    �������� ����� Sum
    private String BIC;
//    �������� ����� BIC

    public BICDirectoryEntry(String nameP, String dateIn, int ptType, int rgn, String BIC) {
        this.NameP = nameP;
        this.DateIn = dateIn;
        this.PtType = ptType;
        this.Rgn = rgn;
        this.BIC = BIC;
    }

    @Override
    public String toString() {
        return "BICDirectoryEntry{" +
                "NameP='" + NameP + '\'' +
                ", DateIn='" + DateIn + '\'' +
                ", PtType=" + PtType +
                ", Rgn=" + Rgn +
                ", BIC='" + BIC + '\'' +
                '}';
    }

    public void setNameP(String nameP) {
        this.NameP = nameP;
    }

    public void setDateIn(String dateIn) {
        this.DateIn = dateIn;
    }

    public void setPtType(int ptType) {
        this.PtType = ptType;
    }

    public void setRgn(int rgn) {
        this.Rgn = rgn;
    }

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }



    public String getNameP() {
        return NameP;
    }

    public String getDateIn() {
        return DateIn;
    }

    public int getPtType() {
        return PtType;
    }

    public int getRgn() {
        return Rgn;
    }

    public String getBIC() {
        return BIC;
    }

}
