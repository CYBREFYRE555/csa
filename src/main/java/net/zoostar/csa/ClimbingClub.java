package net.zoostar.csa;
import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {
	private List<ClimbInfo> climbList = new ArrayList<>();
	
	public void addClimb(String peakName, int climbTime) {
		ClimbInfo climbinfo = new ClimbInfo(peakName, climbTime);
		if (climbList.size() == 0) {
			climbList.add(climbinfo);
		}
		else {
			boolean added = false;
			for (int i = 0; i < climbList.size() && !added; i++) {
				
				if (peakName.compareTo(climbList.get(i).getName()) == 0) {
					if (climbTime < climbList.get(i).getTime()) {
						climbList.add(i, climbinfo);
						added = true;
					}
				} else if (peakName.compareTo(climbList.get(i).getName()) < 0) {
					climbList.add(i, climbinfo);
					added = true;
				}
			}
			if(!added) {
				climbList.add(climbinfo);
			}
		}
	}
	
	public List<ClimbInfo> getClimbList() {
		return climbList;
	}
	
	public static void main(String[] args) {
		
		ClimbingClub club = new ClimbingClub();
		
		club.addClimb("Montalk", 300);
		club.addClimb("Montalk", 250);
		club.addClimb("Everest", 76);
		club.addClimb("Rocky", 987);
		club.addClimb("Helen", 4563);
		System.out.println(club.getClimbList());
	}
}
