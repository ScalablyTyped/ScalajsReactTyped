package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Must be implemented by dispatch objects which want to get notifications about control events.
  * @since OOo 2.0.3
  */
trait XControlNotificationListener
  extends StObject
     with XInterface {
  
  /**
    * notifies that a control event has happened
    * @param Event contains the event information
    */
  def controlEvent(Event: ControlEvent): Unit
}
object XControlNotificationListener {
  
  inline def apply(
    acquire: Callback,
    controlEvent: ControlEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XControlNotificationListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, controlEvent = js.Any.fromFunction1((t0: ControlEvent) => controlEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XControlNotificationListener]
  }
  
  extension [Self <: XControlNotificationListener](x: Self) {
    
    inline def setControlEvent(value: ControlEvent => Callback): Self = StObject.set(x, "controlEvent", js.Any.fromFunction1((t0: ControlEvent) => value(t0).runNow()))
  }
}
