Class karthikStringDemo7
{
	string gf1;
	String gf2;
	String gf3;

	Karthik(String gf1,String gf2,String gf3)
	{
		this.gf1=gf1;
		this.gf2=gf2;
		this.gf3=gf3;
	}
    //overriding Eguals()//
    @Override
    public boolean equals(Object obj)
    {
        Karthik k=(Karthik)obj;
        //downcasting//
        return.this.gf1==k.gf1 && this.gf2==kgf2 && this.gf3==k.gf3;
    }

	karthik(String gf1)
	{
		this.gf1=gf1;
	}

	public static void main(String[] args) {
		Kathik k1=new Karthik("kanchana","Komala","Kangana");
		Kathik k2=new Karthik("kanchana","Komala","Kangana");

		Kathik k3=new Karthik("kachadi");
		Kathik k4=new Karthik("kachadi");

		System.out.println(k1.equals(k2));
		System.out.println(k2.equals(k4));

	}
}