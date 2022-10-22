package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods for reading and accepting message change revisions. */
trait ChatMessageChangeReader extends StObject {
  
  /** Accepts all the changes up to and including the latest change to the message. */
  def acceptChanges(): Unit
  
  /**
    * Accepts all the changes up to a specified change.
    * @param lastChangeToAcknowledge The last change to acknowledge.
    */
  def acceptChangesThrough(lastChangeToAcknowledge: ChatMessageChange): Unit
  
  /**
    * Returns a batch list of chat message change objects from the message store’s change tracker.
    * @return An asynchronous operation that returns a list of changes.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[IVectorView[Any]]
}
object ChatMessageChangeReader {
  
  inline def apply(
    acceptChanges: Callback,
    acceptChangesThrough: ChatMessageChange => Callback,
    readBatchAsync: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]
  ): ChatMessageChangeReader = {
    val __obj = js.Dynamic.literal(acceptChanges = acceptChanges.toJsFn, acceptChangesThrough = js.Any.fromFunction1((t0: ChatMessageChange) => acceptChangesThrough(t0).runNow()), readBatchAsync = readBatchAsync.toJsFn)
    __obj.asInstanceOf[ChatMessageChangeReader]
  }
  
  extension [Self <: ChatMessageChangeReader](x: Self) {
    
    inline def setAcceptChanges(value: Callback): Self = StObject.set(x, "acceptChanges", value.toJsFn)
    
    inline def setAcceptChangesThrough(value: ChatMessageChange => Callback): Self = StObject.set(x, "acceptChangesThrough", js.Any.fromFunction1((t0: ChatMessageChange) => value(t0).runNow()))
    
    inline def setReadBatchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[IVectorView[Any]]]): Self = StObject.set(x, "readBatchAsync", value.toJsFn)
  }
}
