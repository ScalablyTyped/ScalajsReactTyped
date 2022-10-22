package typingsJapgolly.winrtUwp.Windows.ApplicationModel.Email

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a group of EmailConversation objects for batch processing. */
trait EmailConversationBatch extends StObject {
  
  /** Gets a list of EmailConversation objects to use for batch processing. */
  var conversations: IVectorView[EmailConversation]
  
  /** Gets the status of the last batch processing operation. */
  var status: EmailBatchStatus
}
object EmailConversationBatch {
  
  inline def apply(conversations: IVectorView[EmailConversation], status: EmailBatchStatus): EmailConversationBatch = {
    val __obj = js.Dynamic.literal(conversations = conversations.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConversationBatch]
  }
  
  extension [Self <: EmailConversationBatch](x: Self) {
    
    inline def setConversations(value: IVectorView[EmailConversation]): Self = StObject.set(x, "conversations", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: EmailBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
