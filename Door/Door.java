
public class Door
{
    private String status;
    private String name;

    public Door(String doorName, String doorStatus)
    {
        this.status = doorStatus;
        this.name = doorName;
    }

    public void close()
    {
        this.status = "closed";
    }
    
    public void open()
    {
        this.status = "open";
    }

    public String getName()
    {
        return this.name;
    }
    
    public void setName(String newName)
    {
        this.name = newName;
    }

    public void setStatus(String doorStatus)
    {
        this.status = doorStatus;
    }

    public String getStatus()
    {
        return this.status;
    }
}
