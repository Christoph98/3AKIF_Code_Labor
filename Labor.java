public class Labor
{
    private String gebaude;
    private int stock;
    private boolean beamer;
    private int anzPlatze;
    
public String gebaude()
{
    return gebaude;
}

public int stock()
{
    return stock;
}

public boolean beamer()
{
    return beamer;
}

public int anzPlatze()
{
    return anzPlatze;
}


public void setgebaude(String neuGebaude)
{
    gebaude = neuGebaude;
}

public void setstock (int neustock)
{
    stock = neustock;
}

public void setbeamer(boolean neubeamer)
{
    beamer = neubeamer;
}

public void setanzPlatze(int neuanzPlatze)
{
    anzPlatze = neuanzPlatze;
}
}