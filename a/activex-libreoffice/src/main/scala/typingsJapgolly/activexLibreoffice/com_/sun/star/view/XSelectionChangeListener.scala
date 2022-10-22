package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive an event when the current selection changes.
  * @see com.sun.star.view.XSelectionSupplier
  */
trait XSelectionChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when the selection changes.
    *
    * You can get the new selection via {@link XSelectionSupplier} from {@link com.sun.star.lang.EventObject.Source} .
    */
  def selectionChanged(aEvent: EventObject): Unit
}
object XSelectionChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    selectionChanged: EventObject => Callback
  ): XSelectionChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, selectionChanged = js.Any.fromFunction1((t0: EventObject) => selectionChanged(t0).runNow()))
    __obj.asInstanceOf[XSelectionChangeListener]
  }
  
  extension [Self <: XSelectionChangeListener](x: Self) {
    
    inline def setSelectionChanged(value: EventObject => Callback): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
