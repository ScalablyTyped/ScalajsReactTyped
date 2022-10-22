package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An instance of this interface is used by the {@link XGridRowSelection} to get notifications about selection changes. */
trait XGridSelectionListener
  extends StObject
     with XEventListener {
  
  /** Invoked after a selection was changed. */
  def selectionChanged(gridSelectionEvent: GridSelectionEvent): Unit
}
object XGridSelectionListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    selectionChanged: GridSelectionEvent => Callback
  ): XGridSelectionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, selectionChanged = js.Any.fromFunction1((t0: GridSelectionEvent) => selectionChanged(t0).runNow()))
    __obj.asInstanceOf[XGridSelectionListener]
  }
  
  extension [Self <: XGridSelectionListener](x: Self) {
    
    inline def setSelectionChanged(value: GridSelectionEvent => Callback): Self = StObject.set(x, "selectionChanged", js.Any.fromFunction1((t0: GridSelectionEvent) => value(t0).runNow()))
  }
}
