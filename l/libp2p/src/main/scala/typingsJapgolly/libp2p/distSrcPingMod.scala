package typingsJapgolly.libp2p

import typingsJapgolly.libp2pComponents.mod.Components
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typingsJapgolly.libp2pInterfaces.distSrcStartableMod.Startable
import typingsJapgolly.libp2pInterfaces.mod.AbortOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPingMod {
  
  @JSImport("libp2p/dist/src/ping", "PingService")
  @js.native
  open class PingService protected ()
    extends StObject
       with Startable {
    def this(components: Components, init: PingServiceInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * A handler to register with Libp2p to process ping messages
      */
    def handleMessage(data: IncomingStreamData): Unit = js.native
    
    /* private */ val init: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /**
      * Ping a given peer and wait for its response, getting the operation latency.
      *
      * @param {PeerId|Multiaddr} peer
      * @returns {Promise<number>}
      */
    def ping(peer: PeerId): js.Promise[Double] = js.native
    def ping(peer: PeerId, options: AbortOptions): js.Promise[Double] = js.native
    
    val protocol: String = js.native
    
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
  
  trait PingServiceInit extends StObject {
    
    var maxInboundStreams: Double
    
    var maxOutboundStreams: Double
    
    var protocolPrefix: String
    
    /**
      * How long we should wait for a ping response
      */
    var timeout: Double
  }
  object PingServiceInit {
    
    inline def apply(maxInboundStreams: Double, maxOutboundStreams: Double, protocolPrefix: String, timeout: Double): PingServiceInit = {
      val __obj = js.Dynamic.literal(maxInboundStreams = maxInboundStreams.asInstanceOf[js.Any], maxOutboundStreams = maxOutboundStreams.asInstanceOf[js.Any], protocolPrefix = protocolPrefix.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[PingServiceInit]
    }
    
    extension [Self <: PingServiceInit](x: Self) {
      
      inline def setMaxInboundStreams(value: Double): Self = StObject.set(x, "maxInboundStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxOutboundStreams(value: Double): Self = StObject.set(x, "maxOutboundStreams", value.asInstanceOf[js.Any])
      
      inline def setProtocolPrefix(value: String): Self = StObject.set(x, "protocolPrefix", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
