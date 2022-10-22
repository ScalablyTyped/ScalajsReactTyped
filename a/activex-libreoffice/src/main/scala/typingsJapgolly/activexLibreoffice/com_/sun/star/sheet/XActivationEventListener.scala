package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events when the active spreadsheet changes. */
trait XActivationEventListener
  extends StObject
     with XEventListener {
  
  /**
    * is called whenever data or a selection changed.
    *
    * This interface must be implemented by components that wish to get notified of changes of the active {@link Spreadsheet} . They can be registered at an
    * XSpreadsheetViewEventProvider component.
    * @param aEvent the event that gives further information on which {@link Spreadsheet} is active now.
    * @see ActivationEvent
    * @see XSpreadsheetViewEventProvider
    * @since OOo 2.0
    */
  def activeSpreadsheetChanged(aEvent: ActivationEvent): Unit
}
object XActivationEventListener {
  
  inline def apply(
    acquire: Callback,
    activeSpreadsheetChanged: ActivationEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XActivationEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, activeSpreadsheetChanged = js.Any.fromFunction1((t0: ActivationEvent) => activeSpreadsheetChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XActivationEventListener]
  }
  
  extension [Self <: XActivationEventListener](x: Self) {
    
    inline def setActiveSpreadsheetChanged(value: ActivationEvent => Callback): Self = StObject.set(x, "activeSpreadsheetChanged", js.Any.fromFunction1((t0: ActivationEvent) => value(t0).runNow()))
  }
}
