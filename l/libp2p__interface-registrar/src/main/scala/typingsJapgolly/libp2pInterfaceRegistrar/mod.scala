package typingsJapgolly.libp2pInterfaceRegistrar

import japgolly.scalajs.react.Callback
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfaceConnection.mod.Stream
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-registrar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isTopology(other: Any): /* is @libp2p/interface-registrar.@libp2p/interface-registrar.Topology */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTopology")(other.asInstanceOf[js.Any]).asInstanceOf[/* is @libp2p/interface-registrar.@libp2p/interface-registrar.Topology */ Boolean]
  
  @JSImport("@libp2p/interface-registrar", "topologySymbol")
  @js.native
  val topologySymbol: js.Symbol = js.native
  
  trait IncomingStreamData extends StObject {
    
    var connection: Connection
    
    var stream: Stream
  }
  object IncomingStreamData {
    
    inline def apply(connection: Connection, stream: Stream): IncomingStreamData = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingStreamData]
    }
    
    extension [Self <: IncomingStreamData](x: Self) {
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setStream(value: Stream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Registrar extends StObject {
    
    def getHandler(protocol: String): StreamHandlerRecord = js.native
    
    def getProtocols(): js.Array[String] = js.native
    
    def getTopologies(protocol: String): js.Array[Topology] = js.native
    
    def handle(protocol: String, handler: StreamHandler): js.Promise[Unit] = js.native
    def handle(protocol: String, handler: StreamHandler, options: StreamHandlerOptions): js.Promise[Unit] = js.native
    
    def register(protocol: String, topology: Topology): js.Promise[String] = js.native
    
    def unhandle(protocol: String): js.Promise[Unit] = js.native
    
    def unregister(id: String): Unit = js.native
  }
  
  type StreamHandler = js.Function1[/* data */ IncomingStreamData, Unit]
  
  trait StreamHandlerOptions extends StObject {
    
    /**
      * How many incoming streams can be open for this protocol at the same time on each connection (default: 1)
      */
    var maxInboundStreams: js.UndefOr[Double] = js.undefined
    
    /**
      * How many outgoing streams can be open for this protocol at the same time on each connection (default: 1)
      */
    var maxOutboundStreams: js.UndefOr[Double] = js.undefined
  }
  object StreamHandlerOptions {
    
    inline def apply(): StreamHandlerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamHandlerOptions]
    }
    
    extension [Self <: StreamHandlerOptions](x: Self) {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxInboundStreamsUndefined: Self = StObject.set(x, "maxInboundStreams", js.undefined)
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreamsUndefined: Self = StObject.set(x, "maxOutboundStreams", js.undefined)
    }
  }
  
  trait StreamHandlerRecord extends StObject {
    
    def handler(data: IncomingStreamData): Unit
    @JSName("handler")
    var handler_Original: StreamHandler
    
    var options: StreamHandlerOptions
  }
  object StreamHandlerRecord {
    
    inline def apply(handler: /* data */ IncomingStreamData => Callback, options: StreamHandlerOptions): StreamHandlerRecord = {
      val __obj = js.Dynamic.literal(handler = js.Any.fromFunction1((t0: /* data */ IncomingStreamData) => handler(t0).runNow()), options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamHandlerRecord]
    }
    
    extension [Self <: StreamHandlerRecord](x: Self) {
      
      inline def setHandler(value: /* data */ IncomingStreamData => Callback): Self = StObject.set(x, "handler", js.Any.fromFunction1((t0: /* data */ IncomingStreamData) => value(t0).runNow()))
      
      inline def setOptions(value: StreamHandlerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  trait Topology extends StObject {
    
    var max: Double
    
    var min: Double
    
    def onConnect(peerId: PeerId, conn: Connection): Unit
    
    def onDisconnect(peerId: PeerId): Unit
    
    var peers: Set[String]
    
    def setRegistrar(registrar: Registrar): js.Promise[Unit]
  }
  object Topology {
    
    inline def apply(
      max: Double,
      min: Double,
      onConnect: (PeerId, Connection) => Callback,
      onDisconnect: PeerId => Callback,
      peers: Set[String],
      setRegistrar: Registrar => js.Promise[Unit]
    ): Topology = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], onConnect = js.Any.fromFunction2((t0: PeerId, t1: Connection) => (onConnect(t0, t1)).runNow()), onDisconnect = js.Any.fromFunction1((t0: PeerId) => onDisconnect(t0).runNow()), peers = peers.asInstanceOf[js.Any], setRegistrar = js.Any.fromFunction1(setRegistrar))
      __obj.asInstanceOf[Topology]
    }
    
    extension [Self <: Topology](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setOnConnect(value: (PeerId, Connection) => Callback): Self = StObject.set(x, "onConnect", js.Any.fromFunction2((t0: PeerId, t1: Connection) => (value(t0, t1)).runNow()))
      
      inline def setOnDisconnect(value: PeerId => Callback): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction1((t0: PeerId) => value(t0).runNow()))
      
      inline def setPeers(value: Set[String]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
      
      inline def setSetRegistrar(value: Registrar => js.Promise[Unit]): Self = StObject.set(x, "setRegistrar", js.Any.fromFunction1(value))
    }
  }
  
  trait TopologyInit extends StObject {
    
    /**
      * maximum needed connections
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * minimum needed connections
      */
    var min: js.UndefOr[Double] = js.undefined
    
    var onConnect: js.UndefOr[onConnectHandler] = js.undefined
    
    var onDisconnect: js.UndefOr[onDisconnectHandler] = js.undefined
  }
  object TopologyInit {
    
    inline def apply(): TopologyInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TopologyInit]
    }
    
    extension [Self <: TopologyInit](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnConnect(value: (/* peerId */ PeerId, /* conn */ Connection) => Callback): Self = StObject.set(x, "onConnect", js.Any.fromFunction2((t0: /* peerId */ PeerId, t1: /* conn */ Connection) => (value(t0, t1)).runNow()))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnDisconnect(value: (/* peerId */ PeerId, /* conn */ js.UndefOr[Connection]) => Callback): Self = StObject.set(x, "onDisconnect", js.Any.fromFunction2((t0: /* peerId */ PeerId, t1: /* conn */ js.UndefOr[Connection]) => (value(t0, t1)).runNow()))
      
      inline def setOnDisconnectUndefined: Self = StObject.set(x, "onDisconnect", js.undefined)
    }
  }
  
  type onConnectHandler = js.Function2[/* peerId */ PeerId, /* conn */ Connection, Unit]
  
  type onDisconnectHandler = js.Function2[/* peerId */ PeerId, /* conn */ js.UndefOr[Connection], Unit]
}
