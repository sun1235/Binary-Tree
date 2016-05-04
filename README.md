# Binary-Tree
Write a method evenBranches that returns the number of branch nodes in a binary tree that contain even numbers. 
A branch node is one that has one or two children (i.e., not a leaf node). For example, if a variable tree stores a 
reference to the following tree:

          +---+
          | 2 |
          +---+
         /     \
     +---+     +---+
     | 8 |     | 1 |
     +---+     +---+
    /         /     \
+---+     +---+     +---+
| 0 |     | 7 |     | 6 |
+---+     +---+     +---+
         /               \
     +---+               +---+
     | 4 |               | 9 |
     +---+               +---+

Then the call tree.evenBranches(); should return 3 because there are three branch nodes with even values
(2, 8, and 6). Notice that the leaf nodes with even values are not included (the nodes storing 0 and 4).
