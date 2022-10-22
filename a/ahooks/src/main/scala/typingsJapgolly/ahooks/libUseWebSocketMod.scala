package typingsJapgolly.ahooks

import japgolly.scalajs.react.Callback
import org.scalajs.dom.CloseEvent
import org.scalajs.dom.Event
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.WebSocket
import typingsJapgolly.ahooks.anon.FnCallData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseWebSocketMod {
  
  @JSImport("ahooks/lib/useWebSocket", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(socketUrl: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(socketUrl.asInstanceOf[js.Any]).asInstanceOf[Result]
  inline def default(socketUrl: String, options: Options): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(socketUrl.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  @js.native
  sealed trait ReadyState extends StObject
  @JSImport("ahooks/lib/useWebSocket", "ReadyState")
  @js.native
  object ReadyState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReadyState & Double] = js.native
    
    @js.native
    sealed trait Closed
      extends StObject
         with ReadyState
    /* 3 */ val Closed: typingsJapgolly.ahooks.libUseWebSocketMod.ReadyState.Closed & Double = js.native
    
    @js.native
    sealed trait Closing
      extends StObject
         with ReadyState
    /* 2 */ val Closing: typingsJapgolly.ahooks.libUseWebSocketMod.ReadyState.Closing & Double = js.native
    
    @js.native
    sealed trait Connecting
      extends StObject
         with ReadyState
    /* 0 */ val Connecting: typingsJapgolly.ahooks.libUseWebSocketMod.ReadyState.Connecting & Double = js.native
    
    @js.native
    sealed trait Open
      extends StObject
         with ReadyState
    /* 1 */ val Open: typingsJapgolly.ahooks.libUseWebSocketMod.ReadyState.Open & Double = js.native
  }
  
  trait Options extends StObject {
    
    var manual: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function2[/* event */ CloseEvent, /* instance */ WebSocket, Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function2[/* event */ Event, /* instance */ WebSocket, Unit]] = js.undefined
    
    var onMessage: js.UndefOr[js.Function2[/* message */ MessageEvent, /* instance */ WebSocket, Unit]] = js.undefined
    
    var onOpen: js.UndefOr[js.Function2[/* event */ Event, /* instance */ WebSocket, Unit]] = js.undefined
    
    var protocols: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var reconnectInterval: js.UndefOr[Double] = js.undefined
    
    var reconnectLimit: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      inline def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      inline def setOnClose(value: (/* event */ CloseEvent, /* instance */ WebSocket) => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction2((t0: /* event */ CloseEvent, t1: /* instance */ WebSocket) => (value(t0, t1)).runNow()))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: (/* event */ Event, /* instance */ WebSocket) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* event */ Event, t1: /* instance */ WebSocket) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnMessage(value: (/* message */ MessageEvent, /* instance */ WebSocket) => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction2((t0: /* message */ MessageEvent, t1: /* instance */ WebSocket) => (value(t0, t1)).runNow()))
      
      inline def setOnMessageUndefined: Self = StObject.set(x, "onMessage", js.undefined)
      
      inline def setOnOpen(value: (/* event */ Event, /* instance */ WebSocket) => Callback): Self = StObject.set(x, "onOpen", js.Any.fromFunction2((t0: /* event */ Event, t1: /* instance */ WebSocket) => (value(t0, t1)).runNow()))
      
      inline def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      inline def setProtocols(value: String | js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      inline def setReconnectLimit(value: Double): Self = StObject.set(x, "reconnectLimit", value.asInstanceOf[js.Any])
      
      inline def setReconnectLimitUndefined: Self = StObject.set(x, "reconnectLimit", js.undefined)
    }
  }
  
  trait Result extends StObject {
    
    var connect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var disconnect: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var latestMessage: js.UndefOr[MessageEvent] = js.undefined
    
    var readyState: ReadyState
    
    var sendMessage: js.UndefOr[FnCallData] = js.undefined
    
    var webSocketIns: js.UndefOr[WebSocket] = js.undefined
  }
  object Result {
    
    inline def apply(readyState: ReadyState): Result = {
      val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    extension [Self <: Result](x: Self) {
      
      inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
      
      inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setDisconnectUndefined: Self = StObject.set(x, "disconnect", js.undefined)
      
      inline def setLatestMessage(value: MessageEvent): Self = StObject.set(x, "latestMessage", value.asInstanceOf[js.Any])
      
      inline def setLatestMessageUndefined: Self = StObject.set(x, "latestMessage", js.undefined)
      
      inline def setReadyState(value: ReadyState): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setSendMessage(value: FnCallData): Self = StObject.set(x, "sendMessage", value.asInstanceOf[js.Any])
      
      inline def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
      
      inline def setWebSocketIns(value: WebSocket): Self = StObject.set(x, "webSocketIns", value.asInstanceOf[js.Any])
      
      inline def setWebSocketInsUndefined: Self = StObject.set(x, "webSocketIns", js.undefined)
    }
  }
}
