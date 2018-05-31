/**\
 * 
 * @author Alyssa Ma
 * 5/31/18
 *
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	Node startNode;
	Node goalNode;
	
	public BreadthFirstSearch(Node start, Node goalNode)
	{
		this.startNode = start;
		this.goalNode = goalNode;
	}
	
	public boolean compute()
	{
		if(this.startNode.equals(goalNode))
		{
			System.out.println("Goal Node Found.");
			System.out.println(startNode);
		}
		
		Queue<javax.xml.soap.Node> queue = new LinkedList<>();
		ArrayList<Node> explored = new ArrayList<>();
		queue.add(this.startNode);
		explored.add
	}

}
