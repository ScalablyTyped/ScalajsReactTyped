package typingsJapgolly.typescriptCollections

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibLinkedDictionaryMod {
  
  @JSImport("typescript-collections/dist/lib/LinkedDictionary", JSImport.Default)
  @js.native
  open class default[K, V] () extends LinkedDictionary[K, V] {
    def this(toStrFunction: js.Function1[/* key */ K, String]) = this()
  }
  
  @js.native
  trait LinkedDictionary[K, V]
    extends typingsJapgolly.typescriptCollections.distLibDictionaryMod.default[K, V] {
    
    /**
      * Inserts the new node to the 'tail' of the list, updating the
      * neighbors, and moving 'this.tail' (the End of List indicator) that
      * to the end.
      */
    /* private */ def appendToTail(entry: Any): Any = js.native
    
    /**
      * Retrieves a linked dictionary from the table internally
      */
    /* private */ def getLinkedDictionaryPair(key: Any): Any = js.native
    
    /* private */ var head: Any = js.native
    
    /**
      * Internal function used when updating an existing KeyValue pair.
      * It places the new value indexed by key into the table, but maintains
      * its place in the linked ordering.
      */
    /* private */ def replace(oldPair: Any, newPair: Any): Any = js.native
    
    /* private */ var tail: Any = js.native
  }
}
