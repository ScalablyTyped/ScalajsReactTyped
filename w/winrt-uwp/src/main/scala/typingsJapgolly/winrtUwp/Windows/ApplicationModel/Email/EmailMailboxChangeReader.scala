package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The functionality described in this topic is not available to all Windows and Windows Phone apps. For your code to call these APIs, Microsoft must approve your use of them and provision your developer account. Otherwise the calls will fail at runtime. */
trait EmailMailboxChangeReader extends StObject {
  
  /** Accepts all changes. */
  def acceptChanges(): Unit
  
  /**
    * Accepts all changes through the current change.
    * @param lastChangeToAcknowledge The current change.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: EmailMailboxChange): Unit
  
  /**
    * Reads a collection of changes.
    * @return A batch of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]]
}
object EmailMailboxChangeReader {
  
  inline def apply(
    acceptChanges: Callback,
    acceptChangesThrough: EmailMailboxChange => Callback,
    readBatchAsync: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  ): EmailMailboxChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = acceptChanges.toJsFn, acceptChangesThrough = js.Any.fromFunction1((t0: EmailMailboxChange) => acceptChangesThrough(t0).runNow()), readBatchAsync = readBatchAsync.toJsFn)
    __obj.asInstanceOf[EmailMailboxChangeReader]
  }
  
  extension [Self <: EmailMailboxChangeReader](x: Self) {
    
    inline def setAcceptChanges(value: Callback): Self = StObject.set(x, "acceptChanges", value.toJsFn)
    
    inline def setAcceptChangesThrough(value: EmailMailboxChange => Callback): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1((t0: EmailMailboxChange) => value(t0).runNow()))
    
    inline def setReadBatchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]): Self = StObject.set(x, "readBatchAsync", value.toJsFn)
  }
}
