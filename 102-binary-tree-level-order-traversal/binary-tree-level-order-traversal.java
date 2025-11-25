/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      //using same type which we have to return
      List<List<Integer>> ans= new ArrayList<>();
      //using ArrayDeque type of queue define (slightly faster)
      Deque<TreeNode> q= new ArrayDeque<>(); // Node stored in queue;

      if(root==null)return ans; // if null tree return empty ans;


      //inserting node in quee can be removed first
      q.offer(root); // .offer slightly faster than .add
      
      while(!q.isEmpty()){ //runs till q becomes empty i.e. all element visited and popped to ans list.
       int size = q.size(); //check curr size of array,to remove that many element,
       List<Integer> level = new ArrayList<>(); //storing list to the ans. which is list of list.

       //running loop to pop the element and add it for each level

       for(int i=0; i<size;i++){
        TreeNode curr= q.poll(); // using poll to escape any exception;
        level.add(curr.val); //adding val list. 

        // now add the left and right child of the curr node to queue/ i.e for lower level
        if(curr.left!=null) q.offer(curr.left);
        if(curr.right!=null) q.offer(curr.right);
       } 

        ans.add(level); // adding the level list to final ans.
      }
      return ans; 
    }
}