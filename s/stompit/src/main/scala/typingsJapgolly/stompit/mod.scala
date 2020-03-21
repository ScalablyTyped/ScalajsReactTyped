package typingsJapgolly.stompit

import typingsJapgolly.node.streamMod.Duplex
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.std.Error
import typingsJapgolly.stompit.channelMod.ChannelOptions
import typingsJapgolly.stompit.channelMod.^
import typingsJapgolly.stompit.channelPoolMod.ChannelPoolOptions
import typingsJapgolly.stompit.connectFailoverMod.ConnectFailoverOptions
import typingsJapgolly.stompit.connectMod.ConnectOptions
import typingsJapgolly.stompit.socketMod.SocketOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stompit", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Channel protected () extends ^ {
    def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^, options: ChannelOptions) = this()
  }
  
  @js.native
  class ChannelFactory protected ()
    extends typingsJapgolly.stompit.channelFactoryMod.^ {
    def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^) = this()
  }
  
  @js.native
  class ChannelPool protected ()
    extends typingsJapgolly.stompit.channelPoolMod.^ {
    def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^) = this()
    def this(connectFailover: typingsJapgolly.stompit.connectFailoverMod.^, options: ChannelPoolOptions) = this()
  }
  
  @js.native
  class Client protected ()
    extends typingsJapgolly.stompit.clientMod.^ {
    def this(transportSocket: Duplex) = this()
    def this(transportSocket: Duplex, options: SocketOptions) = this()
  }
  
  @js.native
  class ConnectFailover ()
    extends typingsJapgolly.stompit.connectFailoverMod.^ {
    def this(servers: String) = this()
    def this(servers: js.Array[ConnectOptions]) = this()
    def this(servers: String, options: ConnectFailoverOptions) = this()
    def this(servers: js.Array[ConnectOptions], options: ConnectFailoverOptions) = this()
  }
  
  @js.native
  class IncomingFrameStream ()
    extends typingsJapgolly.stompit.incomingFrameStreamMod.^ {
    def this(opts: TransformOptions) = this()
  }
  
  @js.native
  class OutgoingFrameStream protected ()
    extends typingsJapgolly.stompit.outgoingFrameStreamMod.^ {
    def this(destination: Duplex) = this()
  }
  
  @js.native
  object connect extends js.Object {
    def apply(optionsOrPath: String): typingsJapgolly.stompit.clientMod.^ = js.native
    def apply(
      optionsOrPath: String,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
    ): typingsJapgolly.stompit.clientMod.^ = js.native
    def apply(optionsOrPath: ConnectOptions): typingsJapgolly.stompit.clientMod.^ = js.native
    def apply(
      optionsOrPath: ConnectOptions,
      connectionListener: js.Function2[/* err */ Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
    ): typingsJapgolly.stompit.clientMod.^ = js.native
    def apply(port: Double): typingsJapgolly.stompit.clientMod.^ = js.native
    def apply(port: Double, host: String): typingsJapgolly.stompit.clientMod.^ = js.native
    def apply(
      port: Double,
      host: String,
      connectionListener: js.Function2[/* err */ js.Error | Null, /* client */ typingsJapgolly.stompit.clientMod.^, Unit]
    ): typingsJapgolly.stompit.clientMod.^ = js.native
  }
  
}

