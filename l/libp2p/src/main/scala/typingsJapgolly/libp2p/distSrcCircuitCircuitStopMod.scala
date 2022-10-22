package typingsJapgolly.libp2p

import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.libp2p.distSrcCircuitCircuitStreamHandlerMod.StreamHandler
import typingsJapgolly.libp2p.distSrcCircuitPbMod.CircuitRelay
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitCircuitStopMod {
  
  @JSImport("libp2p/dist/src/circuit/circuit/stop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def handleStop(options: HandleStopOptions): js.UndefOr[
    Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleStop")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[
    Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  
  inline def stop(options: StopOptions): js.Promise[
    js.UndefOr[
      Duplex[Uint8ArrayList, js.typedarray.Uint8Array | Uint8ArrayList, js.Promise[Unit]]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    js.UndefOr[
      Duplex[Uint8ArrayList, js.typedarray.Uint8Array | Uint8ArrayList, js.Promise[Unit]]
    ]
  ]]
  
  trait HandleStopOptions extends StObject {
    
    var connection: Connection
    
    var request: CircuitRelay
    
    var streamHandler: StreamHandler
  }
  object HandleStopOptions {
    
    inline def apply(connection: Connection, request: CircuitRelay, streamHandler: StreamHandler): HandleStopOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], streamHandler = streamHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleStopOptions]
    }
    
    extension [Self <: HandleStopOptions](x: Self) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: CircuitRelay): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStreamHandler(value: StreamHandler): Self = StObject.set(x, "streamHandler", value.asInstanceOf[js.Any])
    }
  }
  
  trait StopOptions
    extends StObject
       with AbortOptions {
    
    var connection: Connection
    
    var request: CircuitRelay
  }
  object StopOptions {
    
    inline def apply(connection: Connection, request: CircuitRelay): StopOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[StopOptions]
    }
    
    extension [Self <: StopOptions](x: Self) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: CircuitRelay): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}
