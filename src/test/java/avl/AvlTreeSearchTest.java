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

    /**
     * Probamos que al buscar un nodo y el arbol es nulo se devuelve null
     *
     * Given: Un arbol vacio
     * When: Buscamos un elemento
     * Then: Se devuelve null
     */
    @Test
    public void testSearchTopNull() {
        //Given
        AvlTree<Integer> avlTree = new AvlTree(comparator);
        AvlNode<Integer> result = new AvlNode<Integer>(0);

        //When
        result =  avlTree.searchNode(4);

        //Then
        assertEquals( null, result);
    }

}
