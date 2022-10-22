package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowsChangeListener
  * @since OOo 3.3
  */
trait XRowsChangeBroadcaster extends StObject {
  
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowsChangeListener(listener: XRowsChangeListener): Unit
  
  /** removes a previously added listener. */
  def removeRowsChangeListener(listener: XRowsChangeListener): Unit
}
object XRowsChangeBroadcaster {
  
  inline def apply(
    addRowsChangeListener: XRowsChangeListener => Callback,
    removeRowsChangeListener: XRowsChangeListener => Callback
  ): XRowsChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowsChangeListener = js.Any.fromFunction1((t0: XRowsChangeListener) => addRowsChangeListener(t0).runNow()), removeRowsChangeListener = js.Any.fromFunction1((t0: XRowsChangeListener) => removeRowsChangeListener(t0).runNow()))
    __obj.asInstanceOf[XRowsChangeBroadcaster]
  }
  
  extension [Self <: XRowsChangeBroadcaster](x: Self) {
    
    inline def setAddRowsChangeListener(value: XRowsChangeListener => Callback): Self = StObject.set(x, "addRowsChangeListener", js.Any.fromFunction1((t0: XRowsChangeListener) => value(t0).runNow()))
    
    inline def setRemoveRowsChangeListener(value: XRowsChangeListener => Callback): Self = StObject.set(x, "removeRowsChangeListener", js.Any.fromFunction1((t0: XRowsChangeListener) => value(t0).runNow()))
  }
}
