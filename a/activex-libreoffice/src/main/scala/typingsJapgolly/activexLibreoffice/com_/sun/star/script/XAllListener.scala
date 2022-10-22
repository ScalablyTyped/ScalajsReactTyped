package typingsJapgolly.activexLibreoffice.com_.sun.star.script

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a listener combining all methods of a listener interface in a single generic call.
  *
  * Without any output parameters, it is possible to adapt any interface if the {@link XAllListenerAdapterService} can generate an adapter.
  */
trait XAllListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called when a "vetoable event" occurs at the object.
    *
    * That happens when the listener method raises an exception, or has a return value declared.
    */
  def approveFiring(aEvent: AllEventObject): Any
  
  /** gets called when an event occurs at the object. */
  def firing(iaEvent: AllEventObject): Unit
}
object XAllListener {
  
  inline def apply(
    acquire: Callback,
    approveFiring: AllEventObject => Any,
    disposing: EventObject => Callback,
    firing: AllEventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAllListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveFiring = js.Any.fromFunction1(approveFiring), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), firing = js.Any.fromFunction1((t0: AllEventObject) => firing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAllListener]
  }
  
  extension [Self <: XAllListener](x: Self) {
    
    inline def setApproveFiring(value: AllEventObject => Any): Self = StObject.set(x, "approveFiring", js.Any.fromFunction1(value))
    
    inline def setFiring(value: AllEventObject => Callback): Self = StObject.set(x, "firing", js.Any.fromFunction1((t0: AllEventObject) => value(t0).runNow()))
  }
}
