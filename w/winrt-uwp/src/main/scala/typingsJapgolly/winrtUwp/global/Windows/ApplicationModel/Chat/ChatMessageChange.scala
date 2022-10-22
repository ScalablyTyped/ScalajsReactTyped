package typingsJapgolly.winrtUwp.global.Windows.ApplicationModel.Chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a revision to a chat message. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChange")
@js.native
open class ChatMessageChange ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChange {
  
  /** Gets the type of change made to a chat message, such as created, modified, etc. */
  /* CompleteClass */
  var changeType: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageChangeType = js.native
  
  /** Gets the updated message text. */
  /* CompleteClass */
  var message: typingsJapgolly.winrtUwp.Windows.ApplicationModel.Chat.ChatMessage = js.native
}
