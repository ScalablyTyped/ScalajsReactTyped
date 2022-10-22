package typingsJapgolly.firebaseFirestore.distInternalMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortedMapIterator[K, V] extends StObject {
  
  def getNext(): Entry[K, V]
  
  def hasNext(): Boolean
  
  /* private */ var isReverse: Any
  
  /* private */ var nodeStack: Any
  
  def peek(): (Entry[K, V]) | Null
}
object SortedMapIterator {
  
  inline def apply[K, V](
    getNext: CallbackTo[Entry[K, V]],
    hasNext: CallbackTo[Boolean],
    isReverse: Any,
    nodeStack: Any,
    peek: CallbackTo[(Entry[K, V]) | Null]
  ): SortedMapIterator[K, V] = {
    val __obj = js.Dynamic.literal(getNext = getNext.toJsFn, hasNext = hasNext.toJsFn, isReverse = isReverse.asInstanceOf[js.Any], nodeStack = nodeStack.asInstanceOf[js.Any], peek = peek.toJsFn)
    __obj.asInstanceOf[SortedMapIterator[K, V]]
  }
  
  extension [Self <: SortedMapIterator[?, ?], K, V](x: Self & (SortedMapIterator[K, V])) {
    
    inline def setGetNext(value: CallbackTo[Entry[K, V]]): Self = StObject.set(x, "getNext", value.toJsFn)
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setIsReverse(value: Any): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
    
    inline def setNodeStack(value: Any): Self = StObject.set(x, "nodeStack", value.asInstanceOf[js.Any])
    
    inline def setPeek(value: CallbackTo[(Entry[K, V]) | Null]): Self = StObject.set(x, "peek", value.toJsFn)
  }
}
