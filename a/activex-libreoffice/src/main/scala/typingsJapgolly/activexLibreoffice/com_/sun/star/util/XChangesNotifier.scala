package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts events about multiple changes that occur in bulk.
  * @see XChangesListener
  * @see XChangesBatch
  * @see ChangesEvent
  */
trait XChangesNotifier
  extends StObject
     with XInterface {
  
  /** adds the specified listener to receive events when changes occurred. */
  def addChangesListener(aListener: XChangesListener): Unit
  
  /** removes the specified listener. */
  def removeChangesListener(aListener: XChangesListener): Unit
}
object XChangesNotifier {
  
  inline def apply(
    acquire: Callback,
    addChangesListener: XChangesListener => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeChangesListener: XChangesListener => Callback
  ): XChangesNotifier = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addChangesListener = js.Any.fromFunction1((t0: XChangesListener) => addChangesListener(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeChangesListener = js.Any.fromFunction1((t0: XChangesListener) => removeChangesListener(t0).runNow()))
    __obj.asInstanceOf[XChangesNotifier]
  }
  
  extension [Self <: XChangesNotifier](x: Self) {
    
    inline def setAddChangesListener(value: XChangesListener => Callback): Self = StObject.set(x, "addChangesListener", js.Any.fromFunction1((t0: XChangesListener) => value(t0).runNow()))
    
    inline def setRemoveChangesListener(value: XChangesListener => Callback): Self = StObject.set(x, "removeChangesListener", js.Any.fromFunction1((t0: XChangesListener) => value(t0).runNow()))
  }
}
