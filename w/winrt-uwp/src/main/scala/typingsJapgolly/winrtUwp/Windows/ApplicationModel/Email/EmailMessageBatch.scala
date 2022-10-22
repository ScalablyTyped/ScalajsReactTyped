package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a collection of email messages. */
trait EmailMessageBatch extends StObject {
  
  /** Gets a batch of email messages. */
  var messages: IVectorView[EmailMessage]
  
  /** Gets the status of the email batch read. */
  var status: EmailBatchStatus
}
object EmailMessageBatch {
  
  inline def apply(messages: IVectorView[EmailMessage], status: EmailBatchStatus): EmailMessageBatch = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailMessageBatch]
  }
  
  extension [Self <: EmailMessageBatch](x: Self) {
    
    inline def setMessages(value: IVectorView[EmailMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EmailBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
