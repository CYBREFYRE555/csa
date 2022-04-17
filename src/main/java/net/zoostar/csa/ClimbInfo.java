package net.zoostar.csa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClimbInfo implements Comparable<ClimbInfo> {
	private String name;
	private int time;

	public ClimbInfo(String peakName, int climbTime) {
		name = peakName;
		time = climbTime;
	}
	
	public String getName() {
		return name;
	}
	
	public int getTime() {
		return time;
	}

	@Override
	public int compareTo(ClimbInfo o) {
		return name.compareTo(o.getName());
		
	}
	
	@Override
	public String toString() {
		return "ClimbInfo [name=" + name + ", time=" + time + "]";
	}

	public static void main(String[] args) {
		List<ClimbInfo> club = new ArrayList<>();
		club.add(new ClimbInfo("Everest", 500));
		club.add(new ClimbInfo("Alpine", 2000));
		club.add(new ClimbInfo("Everest", 450));
		
		System.out.println("Before sort...");
		for(ClimbInfo info : club) {
			System.out.println(info);
		}
		
		club.sort(null);
		Collections.sort(club);
		System.out.println("After sort...");
		for(ClimbInfo info : club) {
			System.out.println(info);
		}
		
	}
}
