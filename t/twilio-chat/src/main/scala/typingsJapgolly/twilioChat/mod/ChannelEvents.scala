package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelEvents extends StObject {
  
  def memberInvited(member: Member): Unit
  
  def memberJoined(member: Member): Unit
  
  def memberLeft(member: Member): Unit
  
  def memberUpdated(data: typingsJapgolly.twilioChat.anon.Member): Unit
  
  def messageAdded(message: Message): Unit
  
  def messageRemoved(message: Message): Unit
  
  def messageUpdated(data: typingsJapgolly.twilioChat.anon.Message): Unit
  
  def removed(channel: Channel): Unit
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
  
  def updated(data: typingsJapgolly.twilioChat.anon.Channel): Unit
}
object ChannelEvents {
  
  inline def apply(
    memberInvited: Member => Callback,
    memberJoined: Member => Callback,
    memberLeft: Member => Callback,
    memberUpdated: typingsJapgolly.twilioChat.anon.Member => Callback,
    messageAdded: Message => Callback,
    messageRemoved: Message => Callback,
    messageUpdated: typingsJapgolly.twilioChat.anon.Message => Callback,
    removed: Channel => Callback,
    typingEnded: Member => Callback,
    typingStarted: Member => Callback,
    updated: typingsJapgolly.twilioChat.anon.Channel => Callback
  ): ChannelEvents = {
    val __obj = js.Dynamic.literal(memberInvited = js.Any.fromFunction1((t0: Member) => memberInvited(t0).runNow()), memberJoined = js.Any.fromFunction1((t0: Member) => memberJoined(t0).runNow()), memberLeft = js.Any.fromFunction1((t0: Member) => memberLeft(t0).runNow()), memberUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => memberUpdated(t0).runNow()), messageAdded = js.Any.fromFunction1((t0: Message) => messageAdded(t0).runNow()), messageRemoved = js.Any.fromFunction1((t0: Message) => messageRemoved(t0).runNow()), messageUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => messageUpdated(t0).runNow()), removed = js.Any.fromFunction1((t0: Channel) => removed(t0).runNow()), typingEnded = js.Any.fromFunction1((t0: Member) => typingEnded(t0).runNow()), typingStarted = js.Any.fromFunction1((t0: Member) => typingStarted(t0).runNow()), updated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Channel) => updated(t0).runNow()))
    __obj.asInstanceOf[ChannelEvents]
  }
  
  extension [Self <: ChannelEvents](x: Self) {
    
    inline def setMemberInvited(value: Member => Callback): Self = StObject.set(x, "memberInvited", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberJoined(value: Member => Callback): Self = StObject.set(x, "memberJoined", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberLeft(value: Member => Callback): Self = StObject.set(x, "memberLeft", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberUpdated(value: typingsJapgolly.twilioChat.anon.Member => Callback): Self = StObject.set(x, "memberUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => value(t0).runNow()))
    
    inline def setMessageAdded(value: Message => Callback): Self = StObject.set(x, "messageAdded", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setMessageRemoved(value: Message => Callback): Self = StObject.set(x, "messageRemoved", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setMessageUpdated(value: typingsJapgolly.twilioChat.anon.Message => Callback): Self = StObject.set(x, "messageUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => value(t0).runNow()))
    
    inline def setRemoved(value: Channel => Callback): Self = StObject.set(x, "removed", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setTypingEnded(value: Member => Callback): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setTypingStarted(value: Member => Callback): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setUpdated(value: typingsJapgolly.twilioChat.anon.Channel => Callback): Self = StObject.set(x, "updated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Channel) => value(t0).runNow()))
  }
}
