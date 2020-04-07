import java.util.ArrayList;

public class Territory
{
	private String name;
	private int numberOfUnits;
	private ArrayList<String> canAccess;
	private ArrayList<Territory> canAccessTerritory;
	private Player owner;
	
	public Territory(String n, int nOU, ArrayList<String> cA)
	{
		name = n;
		numberOfUnits = nOU;
		canAccess = cA;
		canAccessTerritory = new ArrayList<Territory>();
		owner = null;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getNumberOfUnits()
	{
		return numberOfUnits;
	}

	public void setNumberOfUnits(int numberOfUnits)
	{
		this.numberOfUnits = numberOfUnits;
	}

	public ArrayList<String> getCanAccess()
	{
		return canAccess;
	}

	public void setCanAccess(ArrayList<String> canAccess)
	{
		this.canAccess = canAccess;
	}

		public ArrayList<Territory> getCanAccessTerritory()
			{
				return canAccessTerritory;
			}

		public void setCanAccessTerritory(ArrayList<Territory> canAccessTerritory)
			{
				this.canAccessTerritory = canAccessTerritory;
			}
	
		public void addCanAccessTerritory(Territory territory)
			{
				this.canAccessTerritory.add(territory);
			}

		public Player getOwner()
			{
				return owner;
			}

		public void setOwner(Player owner)
			{
				this.owner = owner;
			}
		
		public void swapOwnership(){
			this.owner = Runner.players.get((Runner.players.indexOf(this.owner)+1)%2);
			
		}
	
}

