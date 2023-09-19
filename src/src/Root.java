import java.util.List;

public class Root {

    private String BIC;
    private List<BICDirectoryEntry> bicDirectoryEntry;

    public void setBIC(String BIC) {
        this.BIC = BIC;
    }

    public void setBicDirectoryEntry(List<BICDirectoryEntry> bicDirectoryEntry) {
        this.bicDirectoryEntry = bicDirectoryEntry;
    }

    public String getBIC() {
        return BIC;
    }

    public List<BICDirectoryEntry> getBicDirectoryEntry() {
        return bicDirectoryEntry;
    }

    public Root(List<BICDirectoryEntry> bicDirectoryEntry) {
        this.bicDirectoryEntry = bicDirectoryEntry;
    }

    @Override
    public String toString() {
        return "Root{" +
                "bicDirectoryEntry=" + bicDirectoryEntry +
                '}';
    }
}
