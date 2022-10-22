package typingsJapgolly.firebaseFirestore.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedSetIterator[T] extends StObject {
  
  def getNext(): T
  
  def hasNext(): Boolean
  
  /* private */ var iter: Any
}
object SortedSetIterator {
  
  inline def apply[T](getNext: CallbackTo[T], hasNext: CallbackTo[Boolean], iter: Any): SortedSetIterator[T] = {
    val __obj = js.Dynamic.literal(getNext = getNext.toJsFn, hasNext = hasNext.toJsFn, iter = iter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedSetIterator[T]]
  }
  
  extension [Self <: SortedSetIterator[?], T](x: Self & SortedSetIterator[T]) {
    
    inline def setGetNext(value: CallbackTo[T]): Self = StObject.set(x, "getNext", value.toJsFn)
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setIter(value: Any): Self = StObject.set(x, "iter", value.asInstanceOf[js.Any])
  }
}
