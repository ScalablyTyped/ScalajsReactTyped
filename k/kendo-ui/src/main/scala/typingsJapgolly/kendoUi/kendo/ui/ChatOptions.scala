package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatOptions extends StObject {
  
  var actionClick: js.UndefOr[js.Function1[/* e */ ChatActionClickEvent, Unit]] = js.undefined
  
  var messages: js.UndefOr[ChatMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var post: js.UndefOr[js.Function1[/* e */ ChatPostEvent, Unit]] = js.undefined
  
  var sendMessage: js.UndefOr[js.Function1[/* e */ ChatSendMessageEvent, Unit]] = js.undefined
  
  var typingEnd: js.UndefOr[js.Function1[/* e */ ChatTypingEndEvent, Unit]] = js.undefined
  
  var typingStart: js.UndefOr[js.Function1[/* e */ ChatTypingStartEvent, Unit]] = js.undefined
  
  var user: js.UndefOr[ChatUser] = js.undefined
}
object ChatOptions {
  
  inline def apply(): ChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatOptions]
  }
  
  extension [Self <: ChatOptions](x: Self) {
    
    inline def setActionClick(value: /* e */ ChatActionClickEvent => Callback): Self = StObject.set(x, "actionClick", js.Any.fromFunction1((t0: /* e */ ChatActionClickEvent) => value(t0).runNow()))
    
    inline def setActionClickUndefined: Self = StObject.set(x, "actionClick", js.undefined)
    
    inline def setMessages(value: ChatMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPost(value: /* e */ ChatPostEvent => Callback): Self = StObject.set(x, "post", js.Any.fromFunction1((t0: /* e */ ChatPostEvent) => value(t0).runNow()))
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setSendMessage(value: /* e */ ChatSendMessageEvent => Callback): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1((t0: /* e */ ChatSendMessageEvent) => value(t0).runNow()))
    
    inline def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
    
    inline def setTypingEnd(value: /* e */ ChatTypingEndEvent => Callback): Self = StObject.set(x, "typingEnd", js.Any.fromFunction1((t0: /* e */ ChatTypingEndEvent) => value(t0).runNow()))
    
    inline def setTypingEndUndefined: Self = StObject.set(x, "typingEnd", js.undefined)
    
    inline def setTypingStart(value: /* e */ ChatTypingStartEvent => Callback): Self = StObject.set(x, "typingStart", js.Any.fromFunction1((t0: /* e */ ChatTypingStartEvent) => value(t0).runNow()))
    
    inline def setTypingStartUndefined: Self = StObject.set(x, "typingStart", js.undefined)
    
    inline def setUser(value: ChatUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
