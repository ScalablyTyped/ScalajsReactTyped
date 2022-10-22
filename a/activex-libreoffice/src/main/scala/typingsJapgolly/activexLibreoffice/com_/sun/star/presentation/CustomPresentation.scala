package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A custom presentation can show the pages of its presentation in a customized order.
  *
  * Such a presentation can use certain pages more than once, but it does not necessarily use all of the pages.
  */
trait CustomPresentation
  extends StObject
     with XIndexContainer
     with XNamed
object CustomPresentation {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    Name: String,
    acquire: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getName: CallbackTo[String],
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback,
    replaceByIndex: (Double, Any) => Callback,
    setName: String => Callback
  ): CustomPresentation = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getName = getName.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[CustomPresentation]
  }
}
