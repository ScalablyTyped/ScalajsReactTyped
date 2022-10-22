package typingsJapgolly.activexLibreoffice.com_.sun.star.ui.dialogs

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used to notify listeners about dialog-closed events.
  *
  * Registered listeners will be notified with a {@link DialogClosedEvent} when a {@link XAsynchronousExecutableDialog} is closed.
  * @see XAsynchronousExecutableDialog
  * @see DialogClosedEvent
  */
trait XDialogClosedListener
  extends StObject
     with XEventListener {
  
  /**
    * A client receives this event if a dialog is closed.
    * @param aEvent of type {@link DialogClosedEvent} that describes the event
    * @see EndDialogEvent
    */
  def dialogClosed(aEvent: DialogClosedEvent): Unit
}
object XDialogClosedListener {
  
  inline def apply(
    acquire: Callback,
    dialogClosed: DialogClosedEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDialogClosedListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dialogClosed = js.Any.fromFunction1((t0: DialogClosedEvent) => dialogClosed(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDialogClosedListener]
  }
  
  extension [Self <: XDialogClosedListener](x: Self) {
    
    inline def setDialogClosed(value: DialogClosedEvent => Callback): Self = StObject.set(x, "dialogClosed", js.Any.fromFunction1((t0: DialogClosedEvent) => value(t0).runNow()))
  }
}
