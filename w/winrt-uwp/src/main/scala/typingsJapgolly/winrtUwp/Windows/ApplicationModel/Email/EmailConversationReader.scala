package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reads a batch of email conversations. */
trait EmailConversationReader extends StObject {
  
  /**
    * Asynchronously reads a batch of email conversations.
    * @return Returns a batch of email conversations.
    */
  def readBatchAsync(): IPromiseWithIAsyncOperation[EmailConversationBatch]
}
object EmailConversationReader {
  
  inline def apply(readBatchAsync: CallbackTo[IPromiseWithIAsyncOperation[EmailConversationBatch]]): EmailConversationReader = {
    val __obj = js.Dynamic.literal(readBatchAsync = readBatchAsync.toJsFn)
    __obj.asInstanceOf[EmailConversationReader]
  }
  
  extension [Self <: EmailConversationReader](x: Self) {
    
    inline def setReadBatchAsync(value: CallbackTo[IPromiseWithIAsyncOperation[EmailConversationBatch]]): Self = StObject.set(x, "readBatchAsync", value.toJsFn)
  }
}
