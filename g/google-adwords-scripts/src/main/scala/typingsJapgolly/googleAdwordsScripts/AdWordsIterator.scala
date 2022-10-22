package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsIterator[E] extends StObject {
  
  def hasNext(): Boolean
  
  def next(): E
  
  def totalNumEntities(): Double
}
object AdWordsIterator {
  
  inline def apply[E](hasNext: CallbackTo[Boolean], next: CallbackTo[E], totalNumEntities: CallbackTo[Double]): AdWordsIterator[E] = {
    val __obj = js.Dynamic.literal(hasNext = hasNext.toJsFn, next = next.toJsFn, totalNumEntities = totalNumEntities.toJsFn)
    __obj.asInstanceOf[AdWordsIterator[E]]
  }
  
  extension [Self <: AdWordsIterator[?], E](x: Self & AdWordsIterator[E]) {
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setNext(value: CallbackTo[E]): Self = StObject.set(x, "next", value.toJsFn)
    
    inline def setTotalNumEntities(value: CallbackTo[Double]): Self = StObject.set(x, "totalNumEntities", value.toJsFn)
  }
}
