package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides the possibility of reviving an event before changing the content of a row set. */
trait XRowSetApproveBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive the events "approveCursorMove", "approveRowChange", and "appproveRowSetChange". */
  def addRowSetApproveListener(listener: XRowSetApproveListener): Unit
  
  /** removes the specified listener. */
  def removeRowSetApproveListener(listener: XRowSetApproveListener): Unit
}
object XRowSetApproveBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addRowSetApproveListener: XRowSetApproveListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeRowSetApproveListener: XRowSetApproveListener => Callback
  ): XRowSetApproveBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addRowSetApproveListener = js.Any.fromFunction1((t0: XRowSetApproveListener) => addRowSetApproveListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRowSetApproveListener = js.Any.fromFunction1((t0: XRowSetApproveListener) => removeRowSetApproveListener(t0).runNow()))
    __obj.asInstanceOf[XRowSetApproveBroadcaster]
  }
  
  extension [Self <: XRowSetApproveBroadcaster](x: Self) {
    
    inline def setAddRowSetApproveListener(value: XRowSetApproveListener => Callback): Self = StObject.set(x, "addRowSetApproveListener", js.Any.fromFunction1((t0: XRowSetApproveListener) => value(t0).runNow()))
    
    inline def setRemoveRowSetApproveListener(value: XRowSetApproveListener => Callback): Self = StObject.set(x, "removeRowSetApproveListener", js.Any.fromFunction1((t0: XRowSetApproveListener) => value(t0).runNow()))
  }
}
