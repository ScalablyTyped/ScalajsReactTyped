package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides functionality for blocking messages. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageBlocking")
@js.native
open class ChatMessageBlocking ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageBlocking
object ChatMessageBlocking {
  
  @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageBlocking")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously marks a message as blocked or unblocked.
    * @param localChatMessageId The ID of the message to block.
    * @param blocked TRUE if the message should be blocked, FALSE if it should be unblocked.
    * @return An async action indicating that the operation has completed.
    */
  /* static member */
  inline def markMessageAsBlockedAsync(localChatMessageId: String, blocked: Boolean): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("markMessageAsBlockedAsync")(localChatMessageId.asInstanceOf[js.Any], blocked.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
}
