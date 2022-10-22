package typingsJapgolly.activexLibreoffice.com_.sun.star.report

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XContainerListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface specifies the functions collections of the report definition or a group.
  * @see XFunction
  * @see XReportDefinition
  */
trait XFunctions
  extends StObject
     with XContainer
     with XIndexContainer
     with XChild
     with XComponent {
  
  /** factory method for {@link XFunction} . */
  def createFunction(): XFunction
}
object XFunctions {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    Parent: XInterface,
    acquire: Callback,
    addContainerListener: XContainerListener => Callback,
    addEventListener: XEventListener => Callback,
    createFunction: CallbackTo[XFunction],
    dispose: Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getParent: CallbackTo[XInterface],
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback,
    removeContainerListener: XContainerListener => Callback,
    removeEventListener: XEventListener => Callback,
    replaceByIndex: (Double, Any) => Callback,
    setParent: XInterface => Callback
  ): XFunctions = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], acquire = acquire.toJsFn, addContainerListener = js.Any.fromFunction1((t0: XContainerListener) => addContainerListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), createFunction = createFunction.toJsFn, dispose = dispose.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getParent = getParent.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()), removeContainerListener = js.Any.fromFunction1((t0: XContainerListener) => removeContainerListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), replaceByIndex = js.Any.fromFunction2((t0: Double, t1: Any) => (replaceByIndex(t0, t1)).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()))
    __obj.asInstanceOf[XFunctions]
  }
  
  extension [Self <: XFunctions](x: Self) {
    
    inline def setCreateFunction(value: CallbackTo[XFunction]): Self = StObject.set(x, "createFunction", value.toJsFn)
  }
}
