package typingsJapgolly.activexLibreoffice.com_.sun.star.sdbc

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for receiving "cursorMoved", "rowChanged", and "rowSetChanged" events posted by, for example, a row set. */
trait XRowSetListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when a row set's cursor is moved.
    * @param event contains information about the event
    */
  def cursorMoved(event: EventObject): Unit
  
  /**
    * is called when a row is inserted, updated, or deleted.
    * @deprecated Deprecated
    * @param event contains information about the event
    * @see com.sun.star.sdb.XRowsChangeListener
    */
  def rowChanged(event: EventObject): Unit
  
  /**
    * is called when the row set has changed, or in other words, when the row set has been reexecuted.
    * @param event contains information about the event
    */
  def rowSetChanged(event: EventObject): Unit
}
object XRowSetListener {
  
  inline def apply(
    acquire: Callback,
    cursorMoved: EventObject => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    rowChanged: EventObject => Callback,
    rowSetChanged: EventObject => Callback
  ): XRowSetListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cursorMoved = js.Any.fromFunction1((t0: EventObject) => cursorMoved(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, rowChanged = js.Any.fromFunction1((t0: EventObject) => rowChanged(t0).runNow()), rowSetChanged = js.Any.fromFunction1((t0: EventObject) => rowSetChanged(t0).runNow()))
    __obj.asInstanceOf[XRowSetListener]
  }
  
  extension [Self <: XRowSetListener](x: Self) {
    
    inline def setCursorMoved(value: EventObject => Callback): Self = StObject.set(x, "cursorMoved", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setRowChanged(value: EventObject => Callback): Self = StObject.set(x, "rowChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setRowSetChanged(value: EventObject => Callback): Self = StObject.set(x, "rowSetChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
