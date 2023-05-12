package avl;

import junit.framework.TestCase;
import org.junit.Before;

import java.util.Comparator;

public class AvlTreeTestInserts extends TestCase {
    AvlTree<Integer> avlTree;
    Comparator<?> comparator;

    @Before
    public void setUp() throws Exception {
        comparator = Comparator.comparingInt((Integer o) -> o);
        avlTree = new AvlTree(comparator);
    }
}