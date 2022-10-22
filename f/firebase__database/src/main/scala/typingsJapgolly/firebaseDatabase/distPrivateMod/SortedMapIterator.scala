package typingsJapgolly.firebaseDatabase.distPrivateMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An iterator over an LLRBNode.
  */
trait SortedMapIterator[K, V, T] extends StObject {
  
  def getNext(): T
  
  def hasNext(): Boolean
  
  /* private */ var isReverse_ : Any
  
  /* private */ var nodeStack_ : Any
  
  def peek(): T
  
  /* private */ var resultGenerator_ : Any
}
object SortedMapIterator {
  
  inline def apply[K, V, T](
    getNext: CallbackTo[T],
    hasNext: CallbackTo[Boolean],
    isReverse_ : Any,
    nodeStack_ : Any,
    peek: CallbackTo[T],
    resultGenerator_ : Any
  ): SortedMapIterator[K, V, T] = {
    val __obj = js.Dynamic.literal(getNext = getNext.toJsFn, hasNext = hasNext.toJsFn, isReverse_ = isReverse_.asInstanceOf[js.Any], nodeStack_ = nodeStack_.asInstanceOf[js.Any], peek = peek.toJsFn, resultGenerator_ = resultGenerator_.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedMapIterator[K, V, T]]
  }
  
  extension [Self <: SortedMapIterator[?, ?, ?], K, V, T](x: Self & (SortedMapIterator[K, V, T])) {
    
    inline def setGetNext(value: CallbackTo[T]): Self = StObject.set(x, "getNext", value.toJsFn)
    
    inline def setHasNext(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasNext", value.toJsFn)
    
    inline def setIsReverse_(value: Any): Self = StObject.set(x, "isReverse_", value.asInstanceOf[js.Any])
    
    inline def setNodeStack_(value: Any): Self = StObject.set(x, "nodeStack_", value.asInstanceOf[js.Any])
    
    inline def setPeek(value: CallbackTo[T]): Self = StObject.set(x, "peek", value.toJsFn)
    
    inline def setResultGenerator_(value: Any): Self = StObject.set(x, "resultGenerator_", value.asInstanceOf[js.Any])
  }
}
