package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XMLNodeIterator extends StObject {
  
  def hasNext(): Boolean
  
  def next(): XMLNode
}
object XMLNodeIterator {
  
  inline def apply(hasNext: CallbackTo[Boolean], next: CallbackTo[XMLNode]): XMLNodeIterator = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.toJsFn, next = next.toJsFn)
    __obj.asInstanceOf[XMLNodeIterator]
  }
  
  extension [Self <: XMLNodeIterator](x: Self) {
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setNext(value: CallbackTo[XMLNode]): Self = StObject.set(x, "next", value.toJsFn)
  }
}
