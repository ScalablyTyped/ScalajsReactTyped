package typingsJapgolly.parchment

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsCollectionLinkedNodeMod {
  
  trait LinkedNode extends StObject {
    
    def length(): Double
    
    var next: LinkedNode | Null
    
    var prev: LinkedNode | Null
  }
  object LinkedNode {
    
    inline def apply(length: CallbackTo[Double]): LinkedNode = {
      val __obj = js.Dynamic.literal(length = length.toJsFn, next = null, prev = null)
      __obj.asInstanceOf[LinkedNode]
    }
    
    extension [Self <: LinkedNode](x: Self) {
      
      inline def setLength(value: CallbackTo[Double]): Self = StObject.set(x, "length", value.toJsFn)
      
      inline def setNext(value: LinkedNode): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: LinkedNode): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
}
