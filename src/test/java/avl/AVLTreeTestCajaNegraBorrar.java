package avl;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;

import java.util.Comparator;

import static junit.framework.Assert.assertEquals;


public class AVLTreeTestCajaNegraBorrar {

    AvlTree<Integer> avlTree;
    Comparator<?> comparator;

    @BeforeEach
    public void setUp() {
        comparator = Comparator.comparingInt((Integer o) -> o);
        avlTree = new AvlTree(comparator);
    }

    @AfterEach
    public void tearDown() {
        avlTree = null;
        comparator = null;
    }

    @DisplayName("Dado que tenemos un nodo hoja, si borramos ese nodo, entonces tendremos un árbol vacío")
    @Test
    public void deleteLeafNode(){
        AvlNode<Integer> node = new AvlNode(4);
        avlTree.insertAvlNode(node);
        avlTree.deleteLeafNode(node);
        assertEquals(true, avlTree.avlIsEmpty());
    }

    @DisplayName("Dado que tenemos un arbol con un nodo y sus dos hijos, si borramos el nodo raiz, entonces el nodo izquierdo pasa a ser el raiz y el árbol sigue siendo un árbol AVL válido")
    @Test
    public void deleteRootNodeWithTwoChilds(){
        AvlNode<Integer> node1 = new AvlNode(4);
        AvlNode<Integer> nodeLeft = new AvlNode(5);
        AvlNode<Integer> nodeRight = new AvlNode(6);
        avlTree.insertAvlNode(node1);
        avlTree.insertAvlNode(nodeLeft);
        avlTree.insertAvlNode(nodeRight);
        avlTree.deleteNode(4);
        assertEquals(nodeLeft, avlTree.getTop());
        assertEquals(1, avlTree.getBalance(nodeLeft));
    }

    @DisplayName("Dado que tenemos un arbol con un nodo y un hijo derecho, si borramos el nodo raiz, entonces el nodo derecho pasa a ser el raiz y el árbol sigue siendo un árbol AVL válido")
    @Test
    public void deleteRootNodeWithRightChild(){
        AvlNode<Integer> node1 = new AvlNode(4);
        AvlNode<Integer> nodeRight = new AvlNode(6);
        avlTree.insertAvlNode(nodeRight);
        avlTree.insertAvlNode(node1);
        avlTree.deleteNode(4);
        assertEquals(nodeRight, avlTree.getTop());
        assertEquals(0, avlTree.getBalance(nodeRight));
    }

    @DisplayName("Dado que tenemos un arbol con un nodo y un hijo izquierdo, si borramos el nodo raiz, entonces el nodo izquierdo pasa a ser el raiz y el árbol sigue siendo un árbol AVL válido")
    @Test
    public void deleteRootNodeWithLeftChild(){
        AvlNode<Integer> node1 = new AvlNode(4);
        AvlNode<Integer> nodeLeft = new AvlNode(2);
        avlTree.insertAvlNode(nodeLeft);
        avlTree.insertAvlNode(node1);
        avlTree.deleteNode(4);
        assertEquals(nodeLeft, avlTree.getTop());
        assertEquals(0, avlTree.getBalance(nodeLeft));
    }
}
