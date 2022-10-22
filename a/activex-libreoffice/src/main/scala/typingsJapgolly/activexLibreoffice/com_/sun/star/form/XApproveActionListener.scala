package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * can be implemented to listen and probably veto actions to be performed on components.
  *
  * An example for an action would be the click of a CommandButton.
  * @see XApproveActionBroadcaster
  * @see com.sun.star.form.component.CommandButton
  * @see com.sun.star.form.control.CommandButton
  */
trait XApproveActionListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when an action is performed.
    * @param aEvent A descriptor specifying the source of the event.
    * @returns `TRUE` when the action is permitted, otherwise `FALSE` .
    */
  def approveAction(aEvent: EventObject): Boolean
}
object XApproveActionListener {
  
  inline def apply(
    acquire: Callback,
    approveAction: EventObject => Boolean,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XApproveActionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, approveAction = js.Any.fromFunction1(approveAction), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XApproveActionListener]
  }
  
  extension [Self <: XApproveActionListener](x: Self) {
    
    inline def setApproveAction(value: EventObject => Boolean): Self = StObject.set(x, "approveAction", js.Any.fromFunction1(value))
  }
}
