package typingsJapgolly.activexLibreoffice.com_.sun.star.beans

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** receives events which get fired whenever the state of a bound property is changed. */
trait XPropertyStateChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when a bound property's state is changed.
    * @param aEvent describes the event source and the property that has changed.
    */
  def propertyStateChange(aEvent: PropertyStateChangeEvent): Unit
}
object XPropertyStateChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    propertyStateChange: PropertyStateChangeEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPropertyStateChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), propertyStateChange = js.Any.fromFunction1((t0: PropertyStateChangeEvent) => propertyStateChange(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPropertyStateChangeListener]
  }
  
  extension [Self <: XPropertyStateChangeListener](x: Self) {
    
    inline def setPropertyStateChange(value: PropertyStateChangeEvent => Callback): Self = StObject.set(x, "propertyStateChange", js.Any.fromFunction1((t0: PropertyStateChangeEvent) => value(t0).runNow()))
  }
}
