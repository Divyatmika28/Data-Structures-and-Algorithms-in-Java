public TreeNode sortedArrayToBST(final List<Integer> a) {

 int l = 0; 
 int r = a.size() - 1; 

  TreeNode root = BSThelper(a, l, r); 
  return root; 
}

public TreeNode BSThelper(final List<Integr> a, int l, int r)
{

   if(l>r) return null; 

  int mid = l + (r-l)/2; 

  TreeNode root = new TreeNode(a.get(mid));

  root.left = BSThelper(a, l, mid-1);
  root.right = BSThelper(a, mid+1, r);
  return root; 


}