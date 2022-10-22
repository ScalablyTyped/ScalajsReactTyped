package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is the interface for receiving notifications about reset events.
  *
  * The listener is called if a component implementing the {@link XReset} interface performs a reset. ;  Order of events: a reset is triggered on a
  * componentthe component calls XReset::approveReset() on all its listenersif all listeners approve the reset operation, the data is resetthe component
  * calls XReset::resetted() on all its listeners
  * @see XReset
  */
trait XResetListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked before a component is reset.
    * @param rEvent the event happened.
    * @returns `TRUE` when reset was approved, `FALSE` when the reset operation should be canceled.
    */
  def approveReset(rEvent: EventObject): Boolean
  
  /**
    * is invoked when a component has been reset.
    * @param rEvent the event happened.
    */
  def resetted(rEvent: EventObject): Unit
}
object XResetListener {
  
  inline def apply(
    acquire: Callback,
    approveReset: EventObject => Boolean,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    resetted: EventObject => Callback
  ): XResetListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveReset = js.Any.fromFunction1(approveReset), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, resetted = js.Any.fromFunction1((t0: EventObject) => resetted(t0).runNow()))
    __obj.asInstanceOf[XResetListener]
  }
  
  extension [Self <: XResetListener](x: Self) {
    
    inline def setApproveReset(value: EventObject => Boolean): Self = StObject.set(x, "approveReset", js.Any.fromFunction1(value))
    
    inline def setResetted(value: EventObject => Callback): Self = StObject.set(x, "resetted", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
