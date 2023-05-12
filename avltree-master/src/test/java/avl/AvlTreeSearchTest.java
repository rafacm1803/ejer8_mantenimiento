package avl;

import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.*;

public class AvlTreeSearchTest {

    Comparator<?> comparator;

    @Before
    public void setUp() throws Exception {
        comparator = Comparator.comparingInt((Integer o) -> o);
    }

    @Test
    public void testSearchTopNull() {
        //Given
        AvlNode<Integer> node1 = new AvlNode<Integer>(4);
        AvlTree<Integer> avlTree = new AvlTree(comparator);
        AvlNode<Integer> result = new AvlNode<Integer>(0);

        //When
        result =  avlTree.searchNode(4);

        //Then
        assertEquals( null, result);




    }

}
