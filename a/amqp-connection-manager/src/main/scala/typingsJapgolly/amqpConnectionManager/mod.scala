package typingsJapgolly.amqpConnectionManager

import typingsJapgolly.amqpConnectionManager.distEsmAmqpConnectionManagerMod.AmqpConnectionManagerOptions
import typingsJapgolly.amqpConnectionManager.distEsmAmqpConnectionManagerMod.ConnectionUrl
import typingsJapgolly.amqpConnectionManager.distEsmAmqpConnectionManagerMod.IAmqpConnectionManager
import typingsJapgolly.amqpConnectionManager.distEsmAmqpConnectionManagerMod.default
import typingsJapgolly.amqpConnectionManager.distEsmChannelWrapperMod.CreateChannelOpts
import typingsJapgolly.amqpConnectionManager.distEsmChannelWrapperMod.PublishOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amqp-connection-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("amqp-connection-manager", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def connect(): IAmqpConnectionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[IAmqpConnectionManager]
    inline def connect(urls: js.Array[ConnectionUrl]): IAmqpConnectionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any]).asInstanceOf[IAmqpConnectionManager]
    inline def connect(urls: js.Array[ConnectionUrl], options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
    inline def connect(urls: Null, options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
    inline def connect(urls: Unit, options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
    inline def connect(urls: ConnectionUrl): IAmqpConnectionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any]).asInstanceOf[IAmqpConnectionManager]
    inline def connect(urls: ConnectionUrl, options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
    @JSImport("amqp-connection-manager", "default.connect")
    @js.native
    def connect_Fdefault: js.Function2[
        /* urls */ js.UndefOr[ConnectionUrl | js.Array[ConnectionUrl] | Null], 
        /* options */ js.UndefOr[AmqpConnectionManagerOptions], 
        IAmqpConnectionManager
      ] = js.native
    
    inline def connect_Fdefault_=(
      x: js.Function2[
          /* urls */ js.UndefOr[ConnectionUrl | js.Array[ConnectionUrl] | Null], 
          /* options */ js.UndefOr[AmqpConnectionManagerOptions], 
          IAmqpConnectionManager
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connect")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("amqp-connection-manager", "AmqpConnectionManagerClass")
  @js.native
  /**
    *  Create a new AmqplibConnectionManager.
    *
    * @param urls - An array of brokers to connect to.
    *   Takes url strings or objects {url: string, connectionOptions?: object}
    *   If present, a broker's [connectionOptions] will be used instead
    *   of [options.connectionOptions] when passed to the amqplib connect method.
    *   AmqplibConnectionManager will round-robin between them whenever it
    *   needs to create a new connection.
    * @param [options={}] -
    * @param [options.heartbeatIntervalInSeconds=5] - The interval,
    *   in seconds, to send heartbeats.
    * @param [options.reconnectTimeInSeconds] - The time to wait
    *   before trying to reconnect.  If not specified, defaults to
    *   `heartbeatIntervalInSeconds`.
    * @param [options.connectionOptions] - Passed to the amqplib
    *   connect method.
    * @param [options.findServers] - A `fn(callback)` or a `fn()`
    *   which returns a Promise.  This should resolve to one or more servers
    *   to connect to, either a single URL or an array of URLs.  This is handy
    *   when you're using a service discovery mechanism such as Consul or etcd.
    *   Note that if this is supplied, then `urls` is ignored.
    */
  open class AmqpConnectionManagerClass () extends default {
    def this(urls: js.Array[ConnectionUrl]) = this()
    def this(urls: ConnectionUrl) = this()
    def this(urls: js.Array[ConnectionUrl], options: AmqpConnectionManagerOptions) = this()
    def this(urls: Null, options: AmqpConnectionManagerOptions) = this()
    def this(urls: Unit, options: AmqpConnectionManagerOptions) = this()
    def this(urls: ConnectionUrl, options: AmqpConnectionManagerOptions) = this()
  }
  
  @JSImport("amqp-connection-manager", "ChannelWrapper")
  @js.native
  open class ChannelWrapper protected ()
    extends typingsJapgolly.amqpConnectionManager.distEsmChannelWrapperMod.default {
    /**
      * Create a new ChannelWrapper.
      *
      * @param connectionManager - connection manager which
      *   created this channel.
      * @param [options] -
      * @param [options.name] - A name for this channel.  Handy for debugging.
      * @param [options.setup] - A default setup function to call.  See
      *   `addSetup` for details.
      * @param [options.json] - if true, then ChannelWrapper assumes all
      *   messages passed to `publish()` and `sendToQueue()` are plain JSON objects.
      *   These will be encoded automatically before being sent.
      *
      */
    def this(connectionManager: IAmqpConnectionManager) = this()
    def this(connectionManager: IAmqpConnectionManager, options: CreateChannelOpts) = this()
  }
  
  inline def connect(): IAmqpConnectionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[IAmqpConnectionManager]
  inline def connect(urls: js.Array[ConnectionUrl]): IAmqpConnectionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any]).asInstanceOf[IAmqpConnectionManager]
  inline def connect(urls: js.Array[ConnectionUrl], options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
  inline def connect(urls: Null, options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
  inline def connect(urls: Unit, options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
  inline def connect(urls: ConnectionUrl): IAmqpConnectionManager = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any]).asInstanceOf[IAmqpConnectionManager]
  inline def connect(urls: ConnectionUrl, options: AmqpConnectionManagerOptions): IAmqpConnectionManager = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IAmqpConnectionManager]
  
  object Options {
    
    type AssertExchange = typingsJapgolly.amqplib.propertiesMod.Options.AssertExchange
    
    type AssertQueue = typingsJapgolly.amqplib.propertiesMod.Options.AssertQueue
    
    type Connect = typingsJapgolly.amqplib.propertiesMod.Options.Connect
    
    type Consume = typingsJapgolly.amqplib.propertiesMod.Options.Consume
    
    type DeleteExchange = typingsJapgolly.amqplib.propertiesMod.Options.DeleteExchange
    
    type DeleteQueue = typingsJapgolly.amqplib.propertiesMod.Options.DeleteQueue
    
    type Get = typingsJapgolly.amqplib.propertiesMod.Options.Get
    
    type Publish = PublishOptions
  }
}
