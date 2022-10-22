package typingsJapgolly.actioncable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ActionCable {
  
  trait Cable extends StObject {
    
    def connect(): Unit
    
    def disconnect(): Unit
    
    def ensureActiveConnection(): Unit
    
    def send(data: Any): Unit
    
    var subscriptions: Subscriptions
  }
  object Cable {
    
    inline def apply(
      connect: Callback,
      disconnect: Callback,
      ensureActiveConnection: Callback,
      send: Any => Callback,
      subscriptions: Subscriptions
    ): Cable = {
      val __obj = js.Dynamic.literal(connect = connect.toJsFn, disconnect = disconnect.toJsFn, ensureActiveConnection = ensureActiveConnection.toJsFn, send = js.Any.fromFunction1((t0: Any) => send(t0).runNow()), subscriptions = subscriptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cable]
    }
    
    extension [Self <: Cable](x: Self) {
      
      inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setEnsureActiveConnection(value: Callback): Self = StObject.set(x, "ensureActiveConnection", value.toJsFn)
      
      inline def setSend(value: Any => Callback): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSubscriptions(value: Subscriptions): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait Channel extends StObject {
    
    def perform(action: String, data: js.Object): Unit
    
    def send(data: Any): Boolean
    
    def unsubscribe(): Unit
  }
  object Channel {
    
    inline def apply(perform: (String, js.Object) => Callback, send: Any => Boolean, unsubscribe: Callback): Channel = {
      val __obj = js.Dynamic.literal(perform = js.Any.fromFunction2((t0: String, t1: js.Object) => (perform(t0, t1)).runNow()), send = js.Any.fromFunction1(send), unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[Channel]
    }
    
    extension [Self <: Channel](x: Self) {
      
      inline def setPerform(value: (String, js.Object) => Callback): Self = StObject.set(x, "perform", js.Any.fromFunction2((t0: String, t1: js.Object) => (value(t0, t1)).runNow()))
      
      inline def setSend(value: Any => Boolean): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setUnsubscribe(value: Callback): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  trait ChannelNameWithParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var channel: String
  }
  object ChannelNameWithParams {
    
    inline def apply(channel: String): ChannelNameWithParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChannelNameWithParams]
    }
    
    extension [Self <: ChannelNameWithParams](x: Self) {
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateMixin
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var received: js.UndefOr[js.Function1[/* obj */ Any, Unit]] = js.undefined
  }
  object CreateMixin {
    
    inline def apply(): CreateMixin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateMixin]
    }
    
    extension [Self <: CreateMixin](x: Self) {
      
      inline def setConnected(value: Callback): Self = StObject.set(x, "connected", value.toJsFn)
      
      inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      inline def setDisconnected(value: Callback): Self = StObject.set(x, "disconnected", value.toJsFn)
      
      inline def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      inline def setReceived(value: /* obj */ Any => Callback): Self = StObject.set(x, "received", js.Any.fromFunction1((t0: /* obj */ Any) => value(t0).runNow()))
      
      inline def setReceivedUndefined: Self = StObject.set(x, "received", js.undefined)
    }
  }
  
  @js.native
  trait Subscriptions extends StObject {
    
    def create[T /* <: CreateMixin */](channel: String): Channel & T = js.native
    def create[T /* <: CreateMixin */](channel: String, obj: T & ThisType[Channel]): Channel & T = js.native
    def create[T /* <: CreateMixin */](channel: ChannelNameWithParams): Channel & T = js.native
    def create[T /* <: CreateMixin */](channel: ChannelNameWithParams, obj: T & ThisType[Channel]): Channel & T = js.native
  }
}
