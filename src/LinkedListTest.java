import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    LinkedList l;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        l = new LinkedList();
    }

    @org.junit.jupiter.api.Test
    void addLast() {
        l.addLast(1);
        assertEquals(1,l.soma());
        l.addLast(2);
        assertEquals(3,l.soma());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(0,l.size());
        l.addLast(1);
        assertEquals(1,l.size());
        l.remove(0);
        assertEquals(0,l.size());

    }

    @org.junit.jupiter.api.Test
    void soma() {
        l.addLast(1);
        l.addLast(1);
        l.addLast(1);
        l.addLast(1);
        l.addLast(1);
        l.addLast(1);
        assertEquals(6,l.soma());
    }

    @org.junit.jupiter.api.Test
    void isSorted() {
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        assertTrue(l.isSorted());
        l.addLast(1);
        assertFalse(l.isSorted());
    }

    @org.junit.jupiter.api.Test
    void add() {
        l.addLast(1);
        assertEquals(1,l.size());
        l.add(1,2);
        assertEquals(2,l.size());
        l.add(2,3);
        assertTrue(l.isSorted());
        assertEquals(3,l.size());
        l.add(1, 4);
        assertEquals(4,l.size());
        assertFalse(l.isSorted());
    }

    @org.junit.jupiter.api.Test
    void remove() {
        l.addLast(1);
        l.addLast(2);
        assertEquals(3,l.soma());
        l.remove(1);
        assertEquals(1,l.soma());
        l.remove(0);
        assertEquals(0,l.soma());
        l.addLast(1);
        l.addLast(2);
        l.remove(0);
        assertEquals(2,l.soma());
        l.remove(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        assertEquals(15,l.soma());
        l.remove(2);
        assertEquals(12,l.soma());
    }
}