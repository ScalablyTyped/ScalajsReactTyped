package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** broadcasts message in case transacted object is committed or reverted. */
trait XTransactionBroadcaster
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive events about commits and reverts. */
  def addTransactionListener(aListener: XTransactionListener): Unit
  
  /** removes the specified listener. */
  def removeTransactionListener(aListener: XTransactionListener): Unit
}
object XTransactionBroadcaster {
  
  inline def apply(
    acquire: Callback,
    addTransactionListener: XTransactionListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeTransactionListener: XTransactionListener => Callback
  ): XTransactionBroadcaster = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addTransactionListener = js.Any.fromFunction1((t0: XTransactionListener) => addTransactionListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeTransactionListener = js.Any.fromFunction1((t0: XTransactionListener) => removeTransactionListener(t0).runNow()))
    __obj.asInstanceOf[XTransactionBroadcaster]
  }
  
  extension [Self <: XTransactionBroadcaster](x: Self) {
    
    inline def setAddTransactionListener(value: XTransactionListener => Callback): Self = StObject.set(x, "addTransactionListener", js.Any.fromFunction1((t0: XTransactionListener) => value(t0).runNow()))
    
    inline def setRemoveTransactionListener(value: XTransactionListener => Callback): Self = StObject.set(x, "removeTransactionListener", js.Any.fromFunction1((t0: XTransactionListener) => value(t0).runNow()))
  }
}
