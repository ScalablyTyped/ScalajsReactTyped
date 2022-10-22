package typingsJapgolly.libp2p

import typingsJapgolly.itStreamTypes.mod.Duplex
import typingsJapgolly.libp2p.distSrcCircuitCircuitStreamHandlerMod.StreamHandler
import typingsJapgolly.libp2p.distSrcCircuitPbMod.CircuitRelay
import typingsJapgolly.libp2p.distSrcCircuitTransportMod.Circuit
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCircuitCircuitHopMod {
  
  @JSImport("libp2p/dist/src/circuit/circuit/hop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def canHop(options: CanHopOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canHop")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def handleCanHop(options: HandleCanHopOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleCanHop")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def handleHop(hopRequest: HopRequest): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("handleHop")(hopRequest.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def hop(options: HopConfig): js.Promise[
    Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("hop")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    Duplex[Uint8ArrayList, Uint8ArrayList | js.typedarray.Uint8Array, js.Promise[Unit]]
  ]]
  
  trait CanHopOptions
    extends StObject
       with AbortOptions {
    
    var connection: Connection
  }
  object CanHopOptions {
    
    inline def apply(connection: Connection): CanHopOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[CanHopOptions]
    }
    
    extension [Self <: CanHopOptions](x: Self) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
  
  trait HandleCanHopOptions extends StObject {
    
    var circuit: Circuit
    
    var connection: Connection
    
    var streamHandler: StreamHandler
  }
  object HandleCanHopOptions {
    
    inline def apply(circuit: Circuit, connection: Connection, streamHandler: StreamHandler): HandleCanHopOptions = {
      val __obj = js.Dynamic.literal(circuit = circuit.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], streamHandler = streamHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[HandleCanHopOptions]
    }
    
    extension [Self <: HandleCanHopOptions](x: Self) {
      
      inline def setCircuit(value: Circuit): Self = StObject.set(x, "circuit", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setStreamHandler(value: StreamHandler): Self = StObject.set(x, "streamHandler", value.asInstanceOf[js.Any])
    }
  }
  
  trait HopConfig
    extends StObject
       with AbortOptions {
    
    var connection: Connection
    
    var request: CircuitRelay
  }
  object HopConfig {
    
    inline def apply(connection: Connection, request: CircuitRelay): HopConfig = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[HopConfig]
    }
    
    extension [Self <: HopConfig](x: Self) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: CircuitRelay): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  trait HopRequest extends StObject {
    
    var circuit: Circuit
    
    var connection: Connection
    
    var connectionManager: ConnectionManager
    
    var request: CircuitRelay
    
    var streamHandler: StreamHandler
  }
  object HopRequest {
    
    inline def apply(
      circuit: Circuit,
      connection: Connection,
      connectionManager: ConnectionManager,
      request: CircuitRelay,
      streamHandler: StreamHandler
    ): HopRequest = {
      val __obj = js.Dynamic.literal(circuit = circuit.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], streamHandler = streamHandler.asInstanceOf[js.Any])
      __obj.asInstanceOf[HopRequest]
    }
    
    extension [Self <: HopRequest](x: Self) {
      
      inline def setCircuit(value: Circuit): Self = StObject.set(x, "circuit", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: CircuitRelay): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStreamHandler(value: StreamHandler): Self = StObject.set(x, "streamHandler", value.asInstanceOf[js.Any])
    }
  }
}
