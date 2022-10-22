package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by components which want to be notified when the `RowSet` supplied by a {@link XRowSetSupplier} changes.
  * @see XRowSetChangeBroadcaster
  * @see XRowSetSupplier
  * @since OOo 3.2
  */
trait XRowSetChangeListener
  extends StObject
     with XEventListener {
  
  /** notifies the listener that the `RowSet` associated with a {@link XRowSetSupplier} has changed. */
  def onRowSetChanged(iEvent: EventObject): Unit
}
object XRowSetChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    onRowSetChanged: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XRowSetChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), onRowSetChanged = js.Any.fromFunction1((t0: EventObject) => onRowSetChanged(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XRowSetChangeListener]
  }
  
  extension [Self <: XRowSetChangeListener](x: Self) {
    
    inline def setOnRowSetChanged(value: EventObject => Callback): Self = StObject.set(x, "onRowSetChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
