package typingsJapgolly.activexLibreoffice.com_.sun.star.container

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the generic interface for supporting the replacement of indexed elements.
  * @see XContainer
  */
trait XIndexReplace
  extends StObject
     with XIndexAccess {
  
  /** replaces the element at the specified index with the given element. */
  def replaceByIndex(Index: Double, Element: Any): Unit
}
object XIndexReplace {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    replaceByIndex: (Double, Any) => Callback
  ): XIndexReplace = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[XIndexReplace]
  }
  
  extension [Self <: XIndexReplace](x: Self) {
    
    inline def setReplaceByIndex(value: (Double, Any) => Callback): Self = StObject.set(x, "replaceByIndex", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
  }
}
