package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsEvents extends StObject {
  
  def channelAdded(channel: Channel): Unit
  
  def channelInvited(channel: Channel): Unit
  
  def channelJoined(channel: Channel): Unit
  
  def channelLeft(channel: Channel): Unit
  
  def channelRemoved(channel: Channel): Unit
  
  def channelUpdated(data: typingsJapgolly.twilioChat.anon.Channel): Unit
  
  def memberJoined(member: Member): Unit
  
  def memberLeft(member: Member): Unit
  
  def memberUpdated(data: typingsJapgolly.twilioChat.anon.Member): Unit
  
  def messageAdded(message: Message): Unit
  
  def messageRemoved(message: Message): Unit
  
  def messageUpdated(data: typingsJapgolly.twilioChat.anon.Message): Unit
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
}
object ChannelsEvents {
  
  inline def apply(
    channelAdded: Channel => Callback,
    channelInvited: Channel => Callback,
    channelJoined: Channel => Callback,
    channelLeft: Channel => Callback,
    channelRemoved: Channel => Callback,
    channelUpdated: typingsJapgolly.twilioChat.anon.Channel => Callback,
    memberJoined: Member => Callback,
    memberLeft: Member => Callback,
    memberUpdated: typingsJapgolly.twilioChat.anon.Member => Callback,
    messageAdded: Message => Callback,
    messageRemoved: Message => Callback,
    messageUpdated: typingsJapgolly.twilioChat.anon.Message => Callback,
    typingEnded: Member => Callback,
    typingStarted: Member => Callback
  ): ChannelsEvents = {
    val __obj = js.Dynamic.literal(channelAdded = js.Any.fromFunction1((t0: Channel) => channelAdded(t0).runNow()), channelInvited = js.Any.fromFunction1((t0: Channel) => channelInvited(t0).runNow()), channelJoined = js.Any.fromFunction1((t0: Channel) => channelJoined(t0).runNow()), channelLeft = js.Any.fromFunction1((t0: Channel) => channelLeft(t0).runNow()), channelRemoved = js.Any.fromFunction1((t0: Channel) => channelRemoved(t0).runNow()), channelUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Channel) => channelUpdated(t0).runNow()), memberJoined = js.Any.fromFunction1((t0: Member) => memberJoined(t0).runNow()), memberLeft = js.Any.fromFunction1((t0: Member) => memberLeft(t0).runNow()), memberUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => memberUpdated(t0).runNow()), messageAdded = js.Any.fromFunction1((t0: Message) => messageAdded(t0).runNow()), messageRemoved = js.Any.fromFunction1((t0: Message) => messageRemoved(t0).runNow()), messageUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => messageUpdated(t0).runNow()), typingEnded = js.Any.fromFunction1((t0: Member) => typingEnded(t0).runNow()), typingStarted = js.Any.fromFunction1((t0: Member) => typingStarted(t0).runNow()))
    __obj.asInstanceOf[ChannelsEvents]
  }
  
  extension [Self <: ChannelsEvents](x: Self) {
    
    inline def setChannelAdded(value: Channel => Callback): Self = StObject.set(x, "channelAdded", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelInvited(value: Channel => Callback): Self = StObject.set(x, "channelInvited", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelJoined(value: Channel => Callback): Self = StObject.set(x, "channelJoined", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelLeft(value: Channel => Callback): Self = StObject.set(x, "channelLeft", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelRemoved(value: Channel => Callback): Self = StObject.set(x, "channelRemoved", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelUpdated(value: typingsJapgolly.twilioChat.anon.Channel => Callback): Self = StObject.set(x, "channelUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Channel) => value(t0).runNow()))
    
    inline def setMemberJoined(value: Member => Callback): Self = StObject.set(x, "memberJoined", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberLeft(value: Member => Callback): Self = StObject.set(x, "memberLeft", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberUpdated(value: typingsJapgolly.twilioChat.anon.Member => Callback): Self = StObject.set(x, "memberUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => value(t0).runNow()))
    
    inline def setMessageAdded(value: Message => Callback): Self = StObject.set(x, "messageAdded", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setMessageRemoved(value: Message => Callback): Self = StObject.set(x, "messageRemoved", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setMessageUpdated(value: typingsJapgolly.twilioChat.anon.Message => Callback): Self = StObject.set(x, "messageUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => value(t0).runNow()))
    
    inline def setTypingEnded(value: Member => Callback): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setTypingStarted(value: Member => Callback): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
  }
}
