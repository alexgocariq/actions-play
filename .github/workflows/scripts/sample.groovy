import static java.lang.Math.*

import groovyx.net.http.HTTPBuilder

def http = new HTTPBuilder('http://localhost')
http.get(   path : '/index.json',
            contentType : 'application/json'
        ) { resp, reader ->

        // cast the object it's not necessary... I cast it 
        // to have the method suggestions by IDE
        net.sf.json.JSONObject read = reader
        println read.get("a") // prints "a"
        println read.get("b").get("b1") // prints "b1"
        //...

        // you can also use this approach 
        println read.a // prints "a"
        println read.b.b1 // prints "b1"
        println read.b // prints [b1:b1, b2:b2]

}
  

assert sin(0) == 0.00
assert cos(0) == 1.0
assert cos(0) == 1.0
