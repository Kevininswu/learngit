import java.util.HashMap;
import java.util.Map;

class LRUCache {

    BiLinked tail;
    BiLinked head;
    Map<Integer, BiLinked> map;
    int capacity;
    int size;

    class BiLinked {
        BiLinked prev;
        BiLinked next;
        int key;
        int val;

        BiLinked() {
        }

        ;

        BiLinked(int key) {
            this.key = key;
        }

        BiLinked(int key, int val) {
            this.key = key;
            this.val = val;
        }

    }

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        map=new HashMap<>();
        head=new BiLinked();
        tail=new BiLinked();
        tail.prev=head;
        head.next=tail;
    }

    public int get(int key) {
     BiLinked node =map.get(key);
     moveToHead(node);
     return node.val;
    }

    public void put(int key, int value) {
        BiLinked biLinked = map.get(key);

        if (biLinked==null){
            BiLinked biLinked1 =new BiLinked(key,value);
            addHead(biLinked1);
            map.put(key,biLinked1);
            size++;
            if (size>capacity){
               BiLinked lastNode= removeLast();
               map.remove(lastNode.key);
                size--;
            }

        }else {
            biLinked.val=value;
            moveToHead(biLinked);
        }

    }


    public void moveToHead(BiLinked biLinked) {
        remove(biLinked);
        addHead(biLinked);

    }

    public void remove(BiLinked biLinked) {
        biLinked.next.prev = biLinked.prev;
        biLinked.prev.next = biLinked.next;

    }

    public BiLinked removeLast() {
        BiLinked node = tail;
        remove(tail);
        return tail;
    }

    public void addHead(BiLinked biLinked) {
        head.next.prev = biLinked;
        biLinked.next = head.next;
        head.next = biLinked;
        biLinked.prev = head;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */