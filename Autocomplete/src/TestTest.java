import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import java.util.*;
class TestTest {

	@Test
	void test() {
		 Trie t = new Trie();            
         t.insert("hello"); 
         t.insert("high"); 
			t.insert("seattle"); 			 
         t.insert("seatac"); 
         t.insert("see");
         t.insert("alibaba");
         t.insert("hollow");
         t.insert("how");
         List<String> a= t.autocomplete("h");
         List<String> b= new ArrayList<String>();
         b.add("hello");
         b.add("high");
         b.add("hollow");
         b.add("how");
         assertEquals(a,b);
	}
	@Test
	void test2() {
		 Trie t = new Trie();            
         t.insert("hello"); 
         t.insert("high"); 
			t.insert("seattle"); 			 
         t.insert("seatac"); 
         t.insert("see");
         t.insert("alibaba");
         t.insert("hollow");
         t.insert("how");
         List<String> a= t.autocomplete("se");
         List<String> b= new ArrayList<String>();
         b.add("seattle");
         b.add("seatac");
         b.add("see");
        
         assertEquals(a,b);
	}
	@Test
	void test3() {
		 Trie t = new Trie();            
         t.insert("hello"); 
         t.insert("high"); 
			t.insert("seattle"); 			 
         t.insert("seatac"); 
         t.insert("see");
         t.insert("alibaba");
         t.insert("hollow");
         t.insert("how");
         List<String> a= t.autocomplete("sea");
         List<String> b= new ArrayList<String>();
         b.add("seattle");
         b.add("seatac");
         assertEquals(a,b);
	}
	@Test
	void test4() {
		 Trie t = new Trie();            
        t.insert("hello"); 
        t.insert("high"); 
			t.insert("seattle"); 			 
        t.insert("seatac"); 
        t.insert("see");
        t.insert("alibaba");
        t.insert("hollow");
        t.insert("how");
        List<String> a= t.autocomplete("ho");
        List<String> b= new ArrayList<String>();
        
        b.add("hollow");
        b.add("how");
        assertEquals(a,b);
	}
	@Test
	void test5() {
		 Trie t = new Trie();            
       t.insert("hello"); 
       t.insert("high"); 
			t.insert("seattle"); 			 
       t.insert("seatac"); 
       t.insert("see");
       t.insert("alibaba");
       t.insert("hollow");
       t.insert("how");
       List<String> a= t.autocomplete("xyz");
       List<String> b= new ArrayList<String>();
     
       assertEquals(a,b);
	}
}
