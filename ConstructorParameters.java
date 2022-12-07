
public class ConstructorParameters {
	public static void main(String[] args)
	{
		VolumeClassArgs v= new VolumeClassArgs(10, 20, 30);
		System.out.println("Volume is "+v.depth*v.height*v.width);
		VolumeClassArgs v1= new VolumeClassArgs(10, 30, 36);
		System.out.println("Volume is "+v.depth*v1.height*v1.width);
	}

}


class VolumeClassArgs
{
	int height, width, depth;
	
	VolumeClassArgs(int h, int w, int d)
	{
		height=h;
		width=w;
		depth=d;
	}

 }
