package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowSetChangeListener
  * @since OOo 3.2
  */
trait XRowSetChangeBroadcaster extends StObject {
  
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowSetChangeListener(iListener: XRowSetChangeListener): Unit
  
  /** removes a previously added listener. */
  def removeRowSetChangeListener(iListener: XRowSetChangeListener): Unit
}
object XRowSetChangeBroadcaster {
  
  inline def apply(
    addRowSetChangeListener: XRowSetChangeListener => Callback,
    removeRowSetChangeListener: XRowSetChangeListener => Callback
  ): XRowSetChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowSetChangeListener = js.Any.fromFunction1((t0: XRowSetChangeListener) => addRowSetChangeListener(t0).runNow()), removeRowSetChangeListener = js.Any.fromFunction1((t0: XRowSetChangeListener) => removeRowSetChangeListener(t0).runNow()))
    __obj.asInstanceOf[XRowSetChangeBroadcaster]
  }
  
  extension [Self <: XRowSetChangeBroadcaster](x: Self) {
    
    inline def setAddRowSetChangeListener(value: XRowSetChangeListener => Callback): Self = StObject.set(x, "addRowSetChangeListener", js.Any.fromFunction1((t0: XRowSetChangeListener) => value(t0).runNow()))
    
    inline def setRemoveRowSetChangeListener(value: XRowSetChangeListener => Callback): Self = StObject.set(x, "removeRowSetChangeListener", js.Any.fromFunction1((t0: XRowSetChangeListener) => value(t0).runNow()))
  }
}
