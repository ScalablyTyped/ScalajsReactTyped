package typingsJapgolly.stompit

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.stompit.libChannelMod.ChannelOptions
import typingsJapgolly.stompit.libChannelPoolMod.ChannelPoolOptions
import typingsJapgolly.stompit.libConnectFailoverMod.ConnectFailoverOptions
import typingsJapgolly.stompit.libConnectMod.ConnectOptions
import typingsJapgolly.stompit.libConnectMod.ConnectionListener
import typingsJapgolly.stompit.libSocketMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stompit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stompit", "Channel")
  @js.native
  open class Channel protected ()
    extends typingsJapgolly.stompit.libChannelMod.^ {
    def this(connectFailover: typingsJapgolly.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typingsJapgolly.stompit.libConnectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @JSImport("stompit", "ChannelFactory")
  @js.native
  open class ChannelFactory protected ()
    extends typingsJapgolly.stompit.libChannelFactoryMod.^ {
    def this(connectFailover: typingsJapgolly.stompit.libConnectFailoverMod.^) = this()
  }
  
  @JSImport("stompit", "ChannelPool")
  @js.native
  open class ChannelPool protected ()
    extends typingsJapgolly.stompit.libChannelPoolMod.^ {
    def this(connectFailover: typingsJapgolly.stompit.libConnectFailoverMod.^) = this()
    def this(connectFailover: typingsJapgolly.stompit.libConnectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @JSImport("stompit", "Client")
  @js.native
  open class Client protected ()
    extends typingsJapgolly.stompit.libClientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @JSImport("stompit", "ConnectFailover")
  @js.native
  open class ConnectFailover ()
    extends typingsJapgolly.stompit.libConnectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
    def this(servers: Unit, options: ConnectFailoverOptions) = this()
  }
  
  @JSImport("stompit", "IncomingFrameStream")
  @js.native
  open class IncomingFrameStream ()
    extends typingsJapgolly.stompit.libIncomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stompit", "OutgoingFrameStream")
  @js.native
  open class OutgoingFrameStream protected ()
    extends typingsJapgolly.stompit.libOutgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  inline def connect(optionsOrPathOrPort: String): typingsJapgolly.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: String, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: Double): typingsJapgolly.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: Double, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: ConnectOptions): typingsJapgolly.stompit.libClientMod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(optionsOrPathOrPort: ConnectOptions, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(optionsOrPathOrPort.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(port: Double, host: String): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(port: Double, host: String, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
  inline def connect(port: Double, host: Unit, connectionListener: ConnectionListener): typingsJapgolly.stompit.libClientMod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], connectionListener.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.stompit.libClientMod.^]
}
