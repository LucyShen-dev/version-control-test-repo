public class HashMap <K,V>{
    K key;
    V value;
    Entry <K,V> [] buckets;
    int capacity = 16;
    private static class Entry <K,V>{
        K key;
        V value;
        Entry <K,V> next;
        
        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }
        
    }
    
    public HashMap()
    {
        buckets = new Entry[capacity];
    }
    
    public int getBucketIndex(K key)
    {
        return Math.abs(key.hashCode())%capacity;
    }
    
    public void put(K key, V value)
    {
        int index = getBucketIndex(key);
        Entry <K, V> head = buckets[index];
        Entry <K, V> putEntry = new Entry <> (key, value);
        buckets[index]=putEntry;
        putEntry.next = head;
    }
    
    public V get(K key)
    {
        int index = getBucketIndex(key);
        Entry <K, V> curNode = buckets[index];
        while(curNode!=null)
        {
            if(curNode.key.equals(key))
            {
                return curNode.value;
            }
            
            curNode=curNode.next;
        }
        
        return null;
    }
}
