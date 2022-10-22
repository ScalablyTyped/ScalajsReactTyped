package typingsJapgolly.libp2pWebrtcPeer

import japgolly.scalajs.react.Callback
import org.scalajs.dom.MessageEvent
import org.scalajs.dom.RTCDataChannel
import typingsJapgolly.libp2pLogger.mod.Logger_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcChannelMod {
  
  @JSImport("@libp2p/webrtc-peer/dist/src/channel", "WebRTCDataChannel")
  @js.native
  open class WebRTCDataChannel protected () extends StObject {
    def this(channel: RTCDataChannel, opts: WebRTCDataChannelOptions) = this()
    
    def bufferedAmount: Double = js.native
    
    /* private */ val channel: Any = js.native
    
    def close(): Unit = js.native
    
    /* private */ val closingInterval: Any = js.native
    
    var label: String = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ var open: Any = js.native
    
    def send(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
  }
  
  trait WebRTCDataChannelOptions extends StObject {
    
    def log(formatter: Any, args: Any*): Unit
    @JSName("log")
    var log_Original: Logger_
    
    def onClose(): Unit
    
    def onError(err: js.Error): Unit
    
    def onMessage(event: MessageEvent): Unit
    
    def onOpen(): Unit
  }
  object WebRTCDataChannelOptions {
    
    inline def apply(
      log: Logger_,
      onClose: Callback,
      onError: js.Error => Callback,
      onMessage: MessageEvent => Callback,
      onOpen: Callback
    ): WebRTCDataChannelOptions = {
      val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any], onClose = onClose.toJsFn, onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onMessage = js.Any.fromFunction1((t0: MessageEvent) => onMessage(t0).runNow()), onOpen = onOpen.toJsFn)
      __obj.asInstanceOf[WebRTCDataChannelOptions]
    }
    
    extension [Self <: WebRTCDataChannelOptions](x: Self) {
      
      inline def setLog(value: Logger_): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnMessage(value: MessageEvent => Callback): Self = StObject.set(x, "onMessage", js.Any.fromFunction1((t0: MessageEvent) => value(t0).runNow()))
      
      inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
    }
  }
}
