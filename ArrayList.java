import java.util.*;
class ArrayList
{
	public static void main(String arg[])
	{
		java.util.ArrayList<String> playlist = new java.util.ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first song:");
		String firstsong = sc.nextLine();
		playlist.add(firstsong);
		System.out.println("Enter the second song:");
		String secondsong = sc.nextLine();
		playlist.add(secondsong);
		System.out.println("Enter the third song:");
		String thirdsong = sc.nextLine();
		playlist.add(thirdsong);
		System.out.println("Playlist before removal:");
		System.out.println(playlist);
		System.out.println(playlist.remove(0));
		System.out.println("Playlist after removal:");
		System.out.println(playlist);
		System.out.println(playlist.get(0));
		System.out.println(playlist.contains("Dragon"));
		sc.close();
	}
}