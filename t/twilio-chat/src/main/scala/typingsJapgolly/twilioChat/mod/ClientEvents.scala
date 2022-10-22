package typingsJapgolly.twilioChat.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.twilioChat.anon.ErrorCode
import typingsJapgolly.twilioChat.anon.UpdateReasons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientEvents extends StObject {
  
  def channelAdded(channel: Channel): Unit
  
  def channelInvited(channel: Channel): Unit
  
  def channelJoined(channel: Channel): Unit
  
  def channelLeft(channel: Channel): Unit
  
  def channelRemoved(channel: Channel): Unit
  
  def channelUpdated(data: typingsJapgolly.twilioChat.anon.Channel): Unit
  
  def connectionError(data: ErrorCode): Unit
  
  def connectionStateChanged(state: typingsJapgolly.twilsock.mod.ConnectionState): Unit
  
  def memberJoined(member: Member): Unit
  
  def memberLeft(member: Member): Unit
  
  def memberUpdated(data: typingsJapgolly.twilioChat.anon.Member): Unit
  
  def messageAdded(message: Message): Unit
  
  def messageRemoved(message: Message): Unit
  
  def messageUpdated(data: typingsJapgolly.twilioChat.anon.Message): Unit
  
  def pushNotification(pushNotification: PushNotification): Unit
  
  def stateChanged(state: State): Unit
  
  def tokenAboutToExpire(ttl: Double): Unit
  
  def tokenExpired(): Unit
  
  def typingEnded(member: Member): Unit
  
  def typingStarted(member: Member): Unit
  
  def userSubscribed(user: User): Unit
  
  def userUnsubscribed(user: User): Unit
  
  def userUpdated(data: UpdateReasons): Unit
}
object ClientEvents {
  
  inline def apply(
    channelAdded: Channel => Callback,
    channelInvited: Channel => Callback,
    channelJoined: Channel => Callback,
    channelLeft: Channel => Callback,
    channelRemoved: Channel => Callback,
    channelUpdated: typingsJapgolly.twilioChat.anon.Channel => Callback,
    connectionError: ErrorCode => Callback,
    connectionStateChanged: typingsJapgolly.twilsock.mod.ConnectionState => Callback,
    memberJoined: Member => Callback,
    memberLeft: Member => Callback,
    memberUpdated: typingsJapgolly.twilioChat.anon.Member => Callback,
    messageAdded: Message => Callback,
    messageRemoved: Message => Callback,
    messageUpdated: typingsJapgolly.twilioChat.anon.Message => Callback,
    pushNotification: PushNotification => Callback,
    stateChanged: State => Callback,
    tokenAboutToExpire: Double => Callback,
    tokenExpired: Callback,
    typingEnded: Member => Callback,
    typingStarted: Member => Callback,
    userSubscribed: User => Callback,
    userUnsubscribed: User => Callback,
    userUpdated: UpdateReasons => Callback
  ): ClientEvents = {
    val __obj = js.Dynamic.literal(channelAdded = js.Any.fromFunction1((t0: Channel) => channelAdded(t0).runNow()), channelInvited = js.Any.fromFunction1((t0: Channel) => channelInvited(t0).runNow()), channelJoined = js.Any.fromFunction1((t0: Channel) => channelJoined(t0).runNow()), channelLeft = js.Any.fromFunction1((t0: Channel) => channelLeft(t0).runNow()), channelRemoved = js.Any.fromFunction1((t0: Channel) => channelRemoved(t0).runNow()), channelUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Channel) => channelUpdated(t0).runNow()), connectionError = js.Any.fromFunction1((t0: ErrorCode) => connectionError(t0).runNow()), connectionStateChanged = js.Any.fromFunction1((t0: typingsJapgolly.twilsock.mod.ConnectionState) => connectionStateChanged(t0).runNow()), memberJoined = js.Any.fromFunction1((t0: Member) => memberJoined(t0).runNow()), memberLeft = js.Any.fromFunction1((t0: Member) => memberLeft(t0).runNow()), memberUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => memberUpdated(t0).runNow()), messageAdded = js.Any.fromFunction1((t0: Message) => messageAdded(t0).runNow()), messageRemoved = js.Any.fromFunction1((t0: Message) => messageRemoved(t0).runNow()), messageUpdated = js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => messageUpdated(t0).runNow()), pushNotification = js.Any.fromFunction1((t0: PushNotification) => pushNotification(t0).runNow()), stateChanged = js.Any.fromFunction1((t0: State) => stateChanged(t0).runNow()), tokenAboutToExpire = js.Any.fromFunction1((t0: Double) => tokenAboutToExpire(t0).runNow()), tokenExpired = tokenExpired.toJsFn, typingEnded = js.Any.fromFunction1((t0: Member) => typingEnded(t0).runNow()), typingStarted = js.Any.fromFunction1((t0: Member) => typingStarted(t0).runNow()), userSubscribed = js.Any.fromFunction1((t0: User) => userSubscribed(t0).runNow()), userUnsubscribed = js.Any.fromFunction1((t0: User) => userUnsubscribed(t0).runNow()), userUpdated = js.Any.fromFunction1((t0: UpdateReasons) => userUpdated(t0).runNow()))
    __obj.asInstanceOf[ClientEvents]
  }
  
  extension [Self <: ClientEvents](x: Self) {
    
    inline def setChannelAdded(value: Channel => Callback): Self = StObject.set(x, "channelAdded", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelInvited(value: Channel => Callback): Self = StObject.set(x, "channelInvited", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelJoined(value: Channel => Callback): Self = StObject.set(x, "channelJoined", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelLeft(value: Channel => Callback): Self = StObject.set(x, "channelLeft", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelRemoved(value: Channel => Callback): Self = StObject.set(x, "channelRemoved", js.Any.fromFunction1((t0: Channel) => value(t0).runNow()))
    
    inline def setChannelUpdated(value: typingsJapgolly.twilioChat.anon.Channel => Callback): Self = StObject.set(x, "channelUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Channel) => value(t0).runNow()))
    
    inline def setConnectionError(value: ErrorCode => Callback): Self = StObject.set(x, "connectionError", js.Any.fromFunction1((t0: ErrorCode) => value(t0).runNow()))
    
    inline def setConnectionStateChanged(value: typingsJapgolly.twilsock.mod.ConnectionState => Callback): Self = StObject.set(x, "connectionStateChanged", js.Any.fromFunction1((t0: typingsJapgolly.twilsock.mod.ConnectionState) => value(t0).runNow()))
    
    inline def setMemberJoined(value: Member => Callback): Self = StObject.set(x, "memberJoined", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberLeft(value: Member => Callback): Self = StObject.set(x, "memberLeft", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setMemberUpdated(value: typingsJapgolly.twilioChat.anon.Member => Callback): Self = StObject.set(x, "memberUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Member) => value(t0).runNow()))
    
    inline def setMessageAdded(value: Message => Callback): Self = StObject.set(x, "messageAdded", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setMessageRemoved(value: Message => Callback): Self = StObject.set(x, "messageRemoved", js.Any.fromFunction1((t0: Message) => value(t0).runNow()))
    
    inline def setMessageUpdated(value: typingsJapgolly.twilioChat.anon.Message => Callback): Self = StObject.set(x, "messageUpdated", js.Any.fromFunction1((t0: typingsJapgolly.twilioChat.anon.Message) => value(t0).runNow()))
    
    inline def setPushNotification(value: PushNotification => Callback): Self = StObject.set(x, "pushNotification", js.Any.fromFunction1((t0: PushNotification) => value(t0).runNow()))
    
    inline def setStateChanged(value: State => Callback): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1((t0: State) => value(t0).runNow()))
    
    inline def setTokenAboutToExpire(value: Double => Callback): Self = StObject.set(x, "tokenAboutToExpire", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTokenExpired(value: Callback): Self = StObject.set(x, "tokenExpired", value.toJsFn)
    
    inline def setTypingEnded(value: Member => Callback): Self = StObject.set(x, "typingEnded", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setTypingStarted(value: Member => Callback): Self = StObject.set(x, "typingStarted", js.Any.fromFunction1((t0: Member) => value(t0).runNow()))
    
    inline def setUserSubscribed(value: User => Callback): Self = StObject.set(x, "userSubscribed", js.Any.fromFunction1((t0: User) => value(t0).runNow()))
    
    inline def setUserUnsubscribed(value: User => Callback): Self = StObject.set(x, "userUnsubscribed", js.Any.fromFunction1((t0: User) => value(t0).runNow()))
    
    inline def setUserUpdated(value: UpdateReasons => Callback): Self = StObject.set(x, "userUpdated", js.Any.fromFunction1((t0: UpdateReasons) => value(t0).runNow()))
  }
}
