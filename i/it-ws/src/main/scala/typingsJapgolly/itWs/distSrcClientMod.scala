package typingsJapgolly.itWs

import typingsJapgolly.itWs.distSrcDuplexMod.DuplexWebSocket
import typingsJapgolly.itWs.distSrcSinkMod.SinkOptions
import typingsJapgolly.ws.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcClientMod {
  
  @JSImport("it-ws/dist/src/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(addr: String): DuplexWebSocket = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(addr.asInstanceOf[js.Any]).asInstanceOf[DuplexWebSocket]
  inline def connect(addr: String, opts: WebSocketOptions): DuplexWebSocket = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(addr.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[DuplexWebSocket]
  
  trait WebSocketOptions
    extends StObject
       with SinkOptions {
    
    var websocket: js.UndefOr[ClientOptions] = js.undefined
  }
  object WebSocketOptions {
    
    inline def apply(): WebSocketOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebSocketOptions]
    }
    
    extension [Self <: WebSocketOptions](x: Self) {
      
      inline def setWebsocket(value: ClientOptions): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      inline def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
}
