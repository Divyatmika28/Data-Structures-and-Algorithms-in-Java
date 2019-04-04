public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root)
{
    
   
ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> nodeValues = new ArrayList<Integer>();

LinkedList<TreeNode> curr = new LinkedList<TreeNode> ();
LinkedList<TreeNode>  next = new LinkedList<TreeNode>();

current.add(root);

while(!current.isEmpty())
{

    TreeNode node = curr.remove();
    if(node.left != null)
      next.add(node.left);


    if(node.right != null)
      next.add(node.right);

   nodeValues.add(node.val);

   if(current.isEmpty())
   {
       curr = next ; 
       next = new LinkedList<TreeMNode>();
       al.add(nodeValues);
       nodeValues = new ArrayList();


   }

}


return al; 


    // this prints like [[2]], [1,3,4,5]
//if you have to display in the reverse order , that is last level first : 
ArrayList<ArrayList<Integer>> reversedResult = new  ArrayList<ArrayList<Integer>>();
    for(int i=al.size()-1; i>=0; i--){
        reversedResult.add(al.get(i));
    }


}