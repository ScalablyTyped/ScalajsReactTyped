package typingsJapgolly.libp2p

import typingsJapgolly.libp2p.anon.TypeofIdentify
import typingsJapgolly.libp2p.distSrcIdentifyPbMessageMod.Identify
import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfaceConnection.mod.Connection
import typingsJapgolly.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import typingsJapgolly.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIdentifyMod {
  
  @JSImport("libp2p/dist/src/identify", "IdentifyService")
  @js.native
  open class IdentifyService protected ()
    extends StObject
       with Startable {
    def this(components: Components, init: IdentifyServiceInit) = this()
    
    /**
      * Sends the `Identify` response with the Signed Peer Record
      * to the requesting peer over the given `connection`
      */
    def _handleIdentify(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    /**
      * Reads the Identify Push message from the given `connection`
      */
    def _handlePush(data: IncomingStreamData): js.Promise[Unit] = js.native
    
    def _identify(connection: Connection): js.Promise[Identify] = js.native
    def _identify(connection: Connection, options: AbortOptions): js.Promise[Identify] = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ val host: Any = js.native
    
    /**
      * Requests the `Identify` message from peer associated with the given `connection`.
      * If the identified peer does not match the `PeerId` associated with the connection,
      * an error will be thrown.
      */
    def identify(connection: Connection): js.Promise[Unit] = js.native
    def identify(connection: Connection, options: AbortOptions): js.Promise[Unit] = js.native
    
    /* private */ val identifyProtocolStr: Any = js.native
    
    /* private */ val identifyPushProtocolStr: Any = js.native
    
    /* private */ val init: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * Send an Identify Push update to the list of connections
      */
    def push(connections: js.Array[Connection]): js.Promise[Unit] = js.native
    
    /**
      * Calls `push` on all peer connections
      */
    def pushToPeerStore(): js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  /* static members */
  object IdentifyService {
    
    @JSImport("libp2p/dist/src/identify", "IdentifyService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Takes the `addr` and converts it to a Multiaddr if possible
      */
    inline def getCleanMultiaddr(): js.UndefOr[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCleanMultiaddr")().asInstanceOf[js.UndefOr[Multiaddr_]]
    inline def getCleanMultiaddr(addr: String): js.UndefOr[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCleanMultiaddr")(addr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Multiaddr_]]
    inline def getCleanMultiaddr(addr: js.typedarray.Uint8Array): js.UndefOr[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCleanMultiaddr")(addr.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Multiaddr_]]
  }
  
  object Message {
    
    @JSImport("libp2p/dist/src/identify", "Message")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/dist/src/identify", "Message.Identify")
    @js.native
    def Identify: TypeofIdentify = js.native
    inline def Identify_=(x: TypeofIdentify): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Identify")(x.asInstanceOf[js.Any])
  }
  
  object multicodecs {
    
    @JSImport("libp2p/dist/src/identify", "multicodecs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("libp2p/dist/src/identify", "multicodecs.IDENTIFY")
    @js.native
    def IDENTIFY: String = js.native
    inline def IDENTIFY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTIFY")(x.asInstanceOf[js.Any])
    
    @JSImport("libp2p/dist/src/identify", "multicodecs.IDENTIFY_PUSH")
    @js.native
    def IDENTIFY_PUSH: String = js.native
    inline def IDENTIFY_PUSH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDENTIFY_PUSH")(x.asInstanceOf[js.Any])
  }
  
  trait HostProperties extends StObject {
    
    var agentVersion: String
  }
  object HostProperties {
    
    inline def apply(agentVersion: String): HostProperties = {
      val __obj = js.Dynamic.literal(agentVersion = agentVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostProperties]
    }
    
    extension [Self <: HostProperties](x: Self) {
      
      inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentifyServiceInit extends StObject {
    
    /**
      * What details we should send as part of an identify message
      */
    var host: HostProperties
    
    /**
      * Identify responses larger than this in bytes will be rejected (default: 8192)
      */
    var maxIdentifyMessageSize: js.UndefOr[Double] = js.undefined
    
    var maxInboundStreams: Double
    
    var maxOutboundStreams: Double
    
    var maxPushIncomingStreams: Double
    
    var maxPushOutgoingStreams: Double
    
    /**
      * The prefix to use for the protocol (default: 'ipfs')
      */
    var protocolPrefix: String
    
    /**
      * How long we should wait for a remote peer to send their identify response
      */
    var timeout: Double
  }
  object IdentifyServiceInit {
    
    inline def apply(
      host: HostProperties,
      maxInboundStreams: Double,
      maxOutboundStreams: Double,
      maxPushIncomingStreams: Double,
      maxPushOutgoingStreams: Double,
      protocolPrefix: String,
      timeout: Double
    ): IdentifyServiceInit = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], maxInboundStreams = maxInboundStreams.asInstanceOf[js.Any], maxOutboundStreams = maxOutboundStreams.asInstanceOf[js.Any], maxPushIncomingStreams = maxPushIncomingStreams.asInstanceOf[js.Any], maxPushOutgoingStreams = maxPushOutgoingStreams.asInstanceOf[js.Any], protocolPrefix = protocolPrefix.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentifyServiceInit]
    }
    
    extension [Self <: IdentifyServiceInit](x: Self) {
      
      inline def setHost(value: HostProperties): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setMaxIdentifyMessageSize(value: Double): Self = StObject.set(x, "maxIdentifyMessageSize", value.asInstanceOf[js.Any])
      
      inline def setMaxIdentifyMessageSizeUndefined: Self = StObject.set(x, "maxIdentifyMessageSize", js.undefined)
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxPushIncomingStreams(value: Double): Self = StObject.set(x, "maxPushIncomingStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxPushOutgoingStreams(value: Double): Self = StObject.set(x, "maxPushOutgoingStreams", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
