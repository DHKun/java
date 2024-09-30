package xx;

abstract class gj{
    protected String countryName;
    protected String skin;
    protected String eyeColor;
    protected String hairColor;
    protected String  language;
    protected String  region;
    public abstract void setxx();
    public abstract void getxx();
}

interface yz{
    void setyz();
    String getyz();
}

class gjrtd extends gj implements yz{
    public void setyz(){
        System.out.println("输入语种：");
        language = System.console().readLine();
    }
    public String getyz(){
        return language;
    }
    public void setxx(){
        System.out.println("输入国家名：");
        countryName = System.console().readLine();
        System.out.println("输入肤色：");
        skin = System.console().readLine();
        System.out.println("输入眼色：");
        eyeColor = System.console().readLine();
        System.out.println("输入发色：");
        hairColor = System.console().readLine();
        System.out.println("输入地区：");
        region = System.console().readLine();
    }
    public void getxx(){
        System.out.println("countryName：" + countryName);
        System.out.println("skin：" + skin);
        System.out.println("eyeColor：" + eyeColor);
        System.out.println("hairColor：" + hairColor);
        System.out.println("region：" + region);
    }
}

public class yx {
    public static void main(String[] args) {
        gjrtd CN = new gjrtd();
        gjrtd UK = new gjrtd();
        gjrtd SA = new gjrtd();

        System.out.println("CN:");
        CN.setxx();
        CN.setyz();
        System.out.println("CN:");
        CN.getxx();
        System.out.println("language:"+CN.getyz());

        System.out.println("UK:");
        UK.setxx();
        UK.setyz();
        System.out.println("UK:");
        UK.getxx();
        System.out.println("language:"+CN.getyz());

        System.out.println("SA:");
        SA.setxx();
        SA.setyz();
        System.out.println("SA:");
        SA.getxx();
        System.out.println("language:"+CN.getyz());
    }
}
