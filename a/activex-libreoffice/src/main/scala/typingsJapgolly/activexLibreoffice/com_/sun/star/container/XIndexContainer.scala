package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the insertion and removal of indexed elements.
  * @see XContainer
  */
trait XIndexContainer
  extends StObject
     with XIndexReplace {
  
  /**
    * inserts the given element at the specified index.
    *
    * To append an element, use the index "last index +1".
    */
  def insertByIndex(Index: Double, Element: Any): Unit
  
  /** removes the element at the specified index. */
  def removeByIndex(Index: Double): Unit
}
object XIndexContainer {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback,
    replaceByIndex: (Double, Any) => Callback
  ): XIndexContainer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[XIndexContainer]
  }
  
  extension [Self <: XIndexContainer](x: Self) {
    
    inline def setInsertByIndex(value: (Double, Any) => Callback): Self = StObject.set(x, "insertByIndex", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByIndex(value: Double => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
