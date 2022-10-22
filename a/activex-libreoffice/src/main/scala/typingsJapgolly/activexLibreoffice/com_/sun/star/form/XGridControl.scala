package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies (some) functionality provided by a grid control (aka table control)
  * @since OOo 3.1
  */
trait XGridControl
  extends StObject
     with XGrid
     with XGridFieldDataSupplier {
  
  /** registers a listener which is to be notified about state changes in the grid control */
  def addGridControlListener(listener: XGridControlListener): Unit
  
  /** revokes a previously registered grid control listener */
  def removeGridControlListener(listener: XGridControlListener): Unit
}
object XGridControl {
  
  inline def apply(
    CurrentColumnPosition: Double,
    acquire: Callback,
    addGridControlListener: XGridControlListener => Callback,
    getCurrentColumnPosition: CallbackTo[Double],
    queryFieldData: (Double, `type`) => SafeArray[Any],
    queryFieldDataType: `type` => SafeArray[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeGridControlListener: XGridControlListener => Callback,
    setCurrentColumnPosition: Double => Callback
  ): XGridControl = {
    val __obj = js.Dynamic.literal(CurrentColumnPosition = CurrentColumnPosition.asInstanceOf[js.Any], acquire = acquire.toJsFn, addGridControlListener = js.Any.fromFunction1((t0: XGridControlListener) => addGridControlListener(t0).runNow()), getCurrentColumnPosition = getCurrentColumnPosition.toJsFn, queryFieldData = js.Any.fromFunction2(queryFieldData), queryFieldDataType = js.Any.fromFunction1(queryFieldDataType), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeGridControlListener = js.Any.fromFunction1((t0: XGridControlListener) => removeGridControlListener(t0).runNow()), setCurrentColumnPosition = js.Any.fromFunction1((t0: Double) => setCurrentColumnPosition(t0).runNow()))
    __obj.asInstanceOf[XGridControl]
  }
  
  extension [Self <: XGridControl](x: Self) {
    
    inline def setAddGridControlListener(value: XGridControlListener => Callback): Self = StObject.set(x, "addGridControlListener", js.Any.fromFunction1((t0: XGridControlListener) => value(t0).runNow()))
    
    inline def setRemoveGridControlListener(value: XGridControlListener => Callback): Self = StObject.set(x, "removeGridControlListener", js.Any.fromFunction1((t0: XGridControlListener) => value(t0).runNow()))
  }
}
