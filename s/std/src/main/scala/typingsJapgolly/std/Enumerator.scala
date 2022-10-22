package typingsJapgolly.std

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows enumerating over a COM collection, which may not have indexed item access.
  */
trait Enumerator[T] extends StObject {
  
  /**
    * Returns true if the current item is the last one in the collection, or the collection is empty,
    * or the current item is undefined.
    */
  /* standard scripthost */
  def atEnd(): scala.Boolean
  
  /**
    * Returns the current item in the collection
    */
  /* standard scripthost */
  def item(): T
  
  /**
    * Resets the current item in the collection to the first item. If there are no items in the collection,
    * the current item is set to undefined.
    */
  /* standard scripthost */
  def moveFirst(): Unit
  
  /**
    * Moves the current item to the next item in the collection. If the enumerator is at the end of
    * the collection or the collection is empty, the current item is set to undefined.
    */
  /* standard scripthost */
  def moveNext(): Unit
}
object Enumerator {
  
  inline def apply[T](atEnd: CallbackTo[scala.Boolean], item: CallbackTo[T], moveFirst: Callback, moveNext: Callback): Enumerator[T] = {
    val __obj = js.Dynamic.literal(atEnd = atEnd.toJsFn, item = item.toJsFn, moveFirst = moveFirst.toJsFn, moveNext = moveNext.toJsFn)
    __obj.asInstanceOf[Enumerator[T]]
  }
  
  extension [Self <: Enumerator[?], T](x: Self & Enumerator[T]) {
    
    inline def setAtEnd(value: CallbackTo[scala.Boolean]): Self = StObject.set(x, "atEnd", value.toJsFn)
    
    inline def setItem(value: CallbackTo[T]): Self = StObject.set(x, "item", value.toJsFn)
    
    inline def setMoveFirst(value: Callback): Self = StObject.set(x, "moveFirst", value.toJsFn)
    
    inline def setMoveNext(value: Callback): Self = StObject.set(x, "moveNext", value.toJsFn)
  }
}
