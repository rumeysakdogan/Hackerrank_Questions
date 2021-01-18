package DataStructures.tries;

/**
 *  A trie is a data structure that is actually a type of tree, but it's often used to store characters.
 *  And the way that it works is each node might store a, just a character as its data, but then
 *  if we look at the path from root down to that node, that node is really representing a word or a part of a word.
 *  And so that it allows us to do is very quick lookups of a particular kind.
 */

/*
  We are asked to implement very simple contact list and the contacts list will need to do two things.
  It will need to add things to it, but then it will need to given a String figure out how many contacts start with
  that string. For this problem we only have characters lowercase a-z.
 */
public class Contacts {

        public static class Node {
            private static int NUMBER_OF_CHARACTERS = 26;
            Node[] children =  new Node[NUMBER_OF_CHARACTERS];
            int size = 0;

            private static int getCharIndex(char c) {
                return c - 'a';
            }
            private Node getNode(char c) {
                return children[getCharIndex(c)];
            }

            private void setNode(char c, Node node) {
                children[getCharIndex(c)] = node;
            }

            private void add(String s) {
                add(s, 0);
            }

            private void add(String s, int index) {
                size++;
                if (index == s.length()) return;
                char current = s.charAt(index);
                int charCode = getCharIndex(current);
                Node child = getNode(current);
                if (child == null) {
                    child = new Node();
                    setNode(current, child);
                }
                child.add(s, index + 1);
            }

            public int findCount(String s, int index) {
                if (index == s.length()) {
                    return size;
                }
                Node child = getNode(s.charAt(index));
                if(child == null) {
                    return 0;
                }
                return child.findCount(s, index + 1);
            }
        }
}
