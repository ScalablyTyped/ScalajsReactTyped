package typingsJapgolly.firebaseFirestore.distPrivateMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A base class representing a persistence transaction, encapsulating both the
  * transaction's sequence numbers as well as a list of onCommitted listeners.
  *
  * When you call Persistence.runTransaction(), it will create a transaction and
  * pass it to your callback. You then pass it to any method that operates
  * on persistence.
  */
trait PersistenceTransaction extends StObject {
  
  def addOnCommittedListener(listener: js.Function0[Unit]): Unit
  
  val currentSequenceNumber: ListenSequenceNumber
  
  /* private */ val onCommittedListeners: Any
  
  def raiseOnCommittedEvent(): Unit
}
object PersistenceTransaction {
  
  inline def apply(
    addOnCommittedListener: js.Function0[Unit] => Callback,
    currentSequenceNumber: ListenSequenceNumber,
    onCommittedListeners: Any,
    raiseOnCommittedEvent: Callback
  ): PersistenceTransaction = {
    val __obj = js.Dynamic.literal(addOnCommittedListener = js.Any.fromFunction1((t0: js.Function0[Unit]) => addOnCommittedListener(t0).runNow()), currentSequenceNumber = currentSequenceNumber.asInstanceOf[js.Any], onCommittedListeners = onCommittedListeners.asInstanceOf[js.Any], raiseOnCommittedEvent = raiseOnCommittedEvent.toJsFn)
    __obj.asInstanceOf[PersistenceTransaction]
  }
  
  extension [Self <: PersistenceTransaction](x: Self) {
    
    inline def setAddOnCommittedListener(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "addOnCommittedListener", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setCurrentSequenceNumber(value: ListenSequenceNumber): Self = StObject.set(x, "currentSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setOnCommittedListeners(value: Any): Self = StObject.set(x, "onCommittedListeners", value.asInstanceOf[js.Any])
    
    inline def setRaiseOnCommittedEvent(value: Callback): Self = StObject.set(x, "raiseOnCommittedEvent", value.toJsFn)
  }
}
