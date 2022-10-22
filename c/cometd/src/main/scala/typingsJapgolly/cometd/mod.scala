package typingsJapgolly.cometd

import typingsJapgolly.cometd.anon.Hosts
import typingsJapgolly.cometd.anon.Name
import typingsJapgolly.cometd.cometdBooleans.`false`
import typingsJapgolly.cometd.cometdBooleans.`true`
import typingsJapgolly.cometd.cometdStrings.debug
import typingsJapgolly.cometd.cometdStrings.error
import typingsJapgolly.cometd.cometdStrings.info
import typingsJapgolly.cometd.cometdStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cometd", "CometD")
  @js.native
  open class CometD () extends StObject {
    def this(options: Configuration) = this()
    
    /**
      * Adds a listener for Bayeux messages, performing the given callback in the given scope when a
      * message for the given channel arrives.
      *
      * - Must be used to listen to meta channel messages.
      * - May be used to listen to service channel messages.
      * - Should not be used to listen broadcast channel messages (use `subscribe` instead).
      * - Does not involve any communication with the Bayeux server, and as such can be called before
      *   calling `handshake`.
      * - Is synchronous: when it returns, you are guaranteed that the listener has been added.
      *
      * @param channel the channel the listener is interested to
      * @param callback the callback to call when a message is sent to the channel
      * @returns the subscription handle to be passed to `removeListener`
      */
    def addListener(channel: String, callback: Listener): SubscriptionHandle = js.native
    
    /**
      * Executes the given callback in the given scope, surrounded by a `startBatch` and `endBatch`
      * calls.
      *
      * @param callback the callback to be executed within `startBatch` and `endBatch` calls
      */
    def batch(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Removes all listeners registered with `addListener` or `subscribe`.
      */
    def clearListeners(): Unit = js.native
    
    /**
      * Removes all subscriptions added via `subscribe`, but does not remove the listeners added via
      * `addListener`.
      */
    def clearSubscriptions(): Unit = js.native
    
    /**
      * Configures the initial Bayeux communication with the Bayeux server.
      *
      * @param configuration the URL of the Bayeux server, or a configuration object that must
      * contain a mandatory field `url`
      */
    def configure(config: String): Unit = js.native
    def configure(config: Configuration): Unit = js.native
    
    /**
      * Disconnects from the Bayeux server.
      *
      * @param disconnectCallback a function to be invoked when the disconnect is acknowledged
      */
    def disconnect(disconnectCallback: Listener): Unit = js.native
    /**
      * Disconnects from the Bayeux server.
      *
      * @param disconnectProps an object to be merged with the disconnect message
      * @param disconnectCallback a function to be invoked when the disconnect is acknowledged
      */
    def disconnect(disconnectProps: js.Object, disconnectCallback: Listener): Unit = js.native
    
    /**
      * Marks the end of a batch of application messages to be sent to the server in a single
      * request.
      */
    def endBatch(): Unit = js.native
    
    /**
      * Returns the backoff period used to increase the backoff time when retrying an unsuccessful or
      * failed message.
      *
      * @returns the backoff increment
      */
    def getBackoffIncrement(): Unit = js.native
    
    /**
      * Returns the backoff period to wait before retrying an unsuccessful or failed message.
      *
      * @returns the backoff period
      */
    def getBackoffPeriod(): Unit = js.native
    
    /**
      * Returns the client ID assigned by the Bayeux server during handshake.
      *
      * @return the client ID assigned by the Bayeux server
      */
    def getClientId(): String = js.native
    
    /**
      * Returns the configuration for this CometD object.
      *
      * @return the configuration for this CometD object
      */
    def getConfiguration(): Configuration = js.native
    
    /**
      * Find the extension registered with the given name.
      *
      * @param name the name of the extension to find
      * @return the extension found or null if no extension with the given name has been registered
      */
    def getExtension(name: String): Extension = js.native
    
    /**
      * Returns the name assigned to this CometD object, or the string 'default' if no name has been
      * explicitly passed as parameter to the constructor.
      *
      * @return the name assigned to this CometD object, or `'default'`
      */
    def getName(): String = js.native
    
    /**
      * Returns a string representing the status of the Bayeux communication with the Bayeux server.
      *
      * @return the status of the Bayeux communication
      */
    def getStatus(): Status = js.native
    
    /**
      * Returns the transport object associated with this CometD object
      */
    def getTransport(): Transport | Null = js.native
    
    /**
      * Gets all registered transport types.
      *
      * @return an array of all registered transport types
      */
    def getTransportTypes(): js.Array[String] = js.native
    
    /**
      * Returns the URL of the Bayeux server.
      *
      * @return the URL of the Bayeux server
      */
    def getURL(): String = js.native
    
    /**
      * Establishes the Bayeux communication with the Bayeux server via a handshake and a subsequent
      * connect.
      *
      * @param handshakeCallback a function to be invoked when the handshake is acknowledged
      */
    def handshake(handshakeCallback: HandshakeListener): Unit = js.native
    /**
      * Establishes the Bayeux communication with the Bayeux server via a handshake and a subsequent
      * connect.
      *
      * @param handshakeProps an object to be merged with the handshake message
      * @param handshakeCallback a function to be invoked when the handshake is acknowledged
      */
    def handshake(handshakeProps: js.Object, handshakeCallback: HandshakeListener): Unit = js.native
    
    /**
      * Increases the backoff period up to the maximum value configured.
      *
      * @returns the backoff period after increment
      */
    def increaseBackoffPeriod(): Double = js.native
    
    /**
      * Configures and establishes the Bayeux communication with the Bayeux server via a handshake
      * and a subsequent connect.
      *
      * @param configuration the configuration object
      * @param handshakeProps an object to be merged with the handshake message
      */
    def init(configuration: String): Unit = js.native
    def init(configuration: String, handshakeProps: js.Object): Unit = js.native
    def init(configuration: Configuration): Unit = js.native
    def init(configuration: Configuration, handshakeProps: js.Object): Unit = js.native
    
    /**
      * Returns true if this instance is disconnected or disconnecting.
      *
      * @return whether this instance disconnected or disconnecting.
      */
    def isDisconnected(): Boolean = js.native
    
    /**
      * Handler invoked every time a listener or subscriber throws an exception.
      *
      * @param exception the exception thrown
      * @param subscriptionHandle the listener or subscription that threw the exception
      * @param isListener whether it was a listener
      * @param message the message received from the Bayeux server
      */
    def onListenerException(exception: Any, subscriptionHandle: SubscriptionHandle, isListener: Boolean, message: String): Unit = js.native
    
    /**
      * Publishes a message on the given channel, containing the given content.
      *
      * @param channel the channel to publish the message to
      * @param content the content of the message
      * @param publishCallback a function to be invoked when the publish is acknowledged by the
      * server
      */
    def publish(channel: String, content: js.Object): Unit = js.native
    def publish(channel: String, content: js.Object, publishCallback: Listener): Unit = js.native
    /**
      * Publishes a message on the given channel, containing the given content.
      *
      * @param channel the channel to publish the message to
      * @param content the content of the message
      * @param publishProps an object to be merged with the publish message
      * @param publishCallback a function to be invoked when the publish is acknowledged by the
      * server
      */
    def publish(channel: String, content: js.Object, publishProps: js.Object): Unit = js.native
    def publish(channel: String, content: js.Object, publishProps: js.Object, publishCallback: Listener): Unit = js.native
    
    /**
      * Publishes a message with binary data on the given channel.
      *
      * The binary data chunk may be an `ArrayBuffer`, a `DataView`, a `TypedArray` (such as
      * `Uint8Array`) or a plain integer array.
      *
      * The meta data object may contain additional application data such as a file name, a mime
      * type, etc.
      *
      * @param channel the channel to publish the message to
      * @param data the binary data to publish
      * @param last whether the binary data chunk is the last
      * @param meta an object containing meta data associated to the binary chunk
      * @param callback a function to be invoked when the publish is acknowledged by the server
      */
    def publishBinary(channel: String, data: js.typedarray.ArrayBuffer, last: Boolean): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.ArrayBuffer, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(
      channel: String,
      data: js.typedarray.ArrayBuffer,
      last: Boolean,
      meta: js.Object,
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.ArrayBuffer, last: Boolean, meta: Unit, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.DataView, last: Boolean): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.DataView, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.DataView, last: Boolean, meta: js.Object, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.DataView, last: Boolean, meta: Unit, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint16Array, last: Boolean): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint16Array, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(
      channel: String,
      data: js.typedarray.Uint16Array,
      last: Boolean,
      meta: js.Object,
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint16Array, last: Boolean, meta: Unit, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint32Array, last: Boolean): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint32Array, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(
      channel: String,
      data: js.typedarray.Uint32Array,
      last: Boolean,
      meta: js.Object,
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint32Array, last: Boolean, meta: Unit, callback: Listener): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint8Array, last: Boolean): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint8Array, last: Boolean, meta: js.Object): Unit = js.native
    def publishBinary(
      channel: String,
      data: js.typedarray.Uint8Array,
      last: Boolean,
      meta: js.Object,
      callback: Listener
    ): Unit = js.native
    def publishBinary(channel: String, data: js.typedarray.Uint8Array, last: Boolean, meta: Unit, callback: Listener): Unit = js.native
    
    /**
      * Registers an extension whose callbacks are called for every incoming message (that comes from
      * the server to this client implementation) and for every outgoing message (that originates
      * from this client implementation for the server).
      *
      * The format of the extension object is the following:
      *
      *     {
      *       incoming: (message) => { ... },
      *       outgoing: (message) => { ... }
      *     }
      *
      * Both properties are optional, but if they are present they will be called respectively for
      * each incoming message and for each outgoing message.
      *
      * @param name the name of the extension
      * @param extension the extension to register
      * @return true if the extension was registered, false otherwise
      */
    def registerExtension(name: String, `extension`: Extension): Boolean = js.native
    
    /**
      * Registers the given transport under the given transport type.
      *
      * The optional index parameter specifies the priority at which the transport is registered
      * (where `0` is the max priority).
      *
      * If a transport with the same type is already registered, this function does nothing and
      * returns `false`.
      *
      * @param type the transport type
      * @param transport the transport object
      * @param index the index at which this transport is to be registered
      * @return true if the transport has been registered, false otherwise
      */
    def registerTransport(`type`: String, transport: js.Object): Boolean = js.native
    def registerTransport(`type`: String, transport: js.Object, index: Double): Boolean = js.native
    
    /**
      * Function attached to the CometD instance when the ReloadExtension is registered
      *
      * @param config the configuration object for the ReloadExtension
      */
    var reload: js.UndefOr[js.Function1[/* config */ js.UndefOr[Name], Unit]] = js.native
    
    /**
      * Removes the subscription obtained with a call to `addListener`.
      *
      * @param subscription the subscription to unsubscribe.
      */
    def removeListener(subscription: SubscriptionHandle): Unit = js.native
    
    /**
      * Resets the backoff period to zero.
      */
    def resetBackoffPeriod(): Unit = js.native
    
    /**
      * Resubscribes as necessary in case of a re-handshake.
      */
    def resubscribe(subscription: SubscriptionHandle): SubscriptionHandle = js.native
    def resubscribe(subscription: SubscriptionHandle, subscribeProps: js.Object): SubscriptionHandle = js.native
    
    /**
      * Sets the backoff period used to increase the backoff time when retrying an unsuccessful or
      * failed message.
      *
      * Default value is 1 second, which means if there is a persistent failure the retries will
      * happen after 1 second, then after 2 seconds, then after 3 seconds, etc. So for example with
      * 15 seconds of elapsed time, there will be 5 retries (at 1, 3, 6, 10 and 15 seconds elapsed).
      *
      * @param period the backoff period to set
      */
    def setBackoffIncrement(period: Double): Unit = js.native
    
    /**
      * Sets the log level for console logging.
      *
      * @param level the log level string
      */
    def setLogLevel(level: error | warn | info | debug): Unit = js.native
    
    /**
      * Marks the start of a batch of application messages to be sent to the server in a single
      * request, obtaining a single response containing (possibly) many application reply messages.
      *
      * Messages are held in a queue and not sent until `endBatch` is called. If `startBatch` is
      * called multiple times, then an equal number of `endBatch` calls must be made to close and
      * send the batch of messages.
      */
    def startBatch(): Unit = js.native
    
    /**
      * Subscribes to the given channel, performing the given callback in the given scope when a
      * message for the channel arrives.
      *
      * - Must not be used to listen to meta channels messages (if attempted, the server returns an
      *   error).
      * - May be used to listen to service channel messages.
      * - Should be used to listen to broadcast channel messages.
      * - Involves a communication with the Bayeux server and as such cannot be called before calling
      *   `handshake`.
      * - Is asynchronous: it returns immediately, well before the Bayeux server has received the
      *   subscription request.
      *
      * @param channel the channel to subscribe to
      * @param callback the callback to call when a message is sent to the channel
      * @param subscribeCallback a function to be invoked when the subscription is acknowledged
      * @return the subscription handle to be passed to `unsubscribe`
      */
    def subscribe(channel: String, callback: Callback): SubscriptionHandle = js.native
    def subscribe(channel: String, callback: Callback, subscribeCallback: SubscribeListener): SubscriptionHandle = js.native
    /**
      * Subscribes to the given channel, performing the given callback in the given scope when a
      * message for the channel arrives.
      *
      * - Must not be used to listen to meta channels messages (if attempted, the server returns an
      *   error).
      * - May be used to listen to service channel messages.
      * - Should be used to listen to broadcast channel messages.
      * - Involves a communication with the Bayeux server and as such cannot be called before calling
      *   `handshake`.
      * - Is asynchronous: it returns immediately, well before the Bayeux server has received the
      *   subscription request.
      *
      * @param channel the channel to subscribe to
      * @param callback the callback to call when a message is sent to the channel
      * @param subscribeProps an object to be merged with the subscribe message
      * @param subscribeCallback a function to be invoked when the subscription is acknowledged
      * @return the subscription handle to be passed to `unsubscribe`
      */
    def subscribe(channel: String, callback: Callback, subscribeProps: js.Object): SubscriptionHandle = js.native
    def subscribe(
      channel: String,
      callback: Callback,
      subscribeProps: js.Object,
      subscribeCallback: SubscribeListener
    ): SubscriptionHandle = js.native
    
    /**
      * Unregister an extension previously registered with `registerExtension`.
      *
      * @param name the name of the extension to unregister.
      * @return true if the extension was unregistered, false otherwise
      */
    def unregisterExtension(name: String): Boolean = js.native
    
    /**
      * Unregisters the transport with the given transport type.
      *
      * @param type the transport type to unregister
      * @return the transport that has been unregistered, or null if no transport was previously
      * registered under the given transport type
      */
    def unregisterTransport(`type`: String): Unit = js.native
    
    /**
      * Unregisters all transports.
      */
    def unregisterTransports(): Unit = js.native
    
    /**
      * Unsubscribes the subscription obtained with a call to `subscribe`.
      *
      * @param subscription the subscription to unsubscribe.
      * @param unsubscribeCallback a function to be invoked when the unsubscription is acknowledged
      */
    def unsubscribe(subscription: SubscriptionHandle): Unit = js.native
    def unsubscribe(subscription: SubscriptionHandle, unsubscribeCallback: SubscribeListener): Unit = js.native
    /**
      * Unsubscribes the subscription obtained with a call to `subscribe`.
      *
      * @param subscription the subscription to unsubscribe.
      * @param unsubscribeProps an object to be merged with the unsubscribe message
      * @param unsubscribeCallback a function to be invoked when the unsubscription is acknowledged
      */
    def unsubscribe(subscription: SubscriptionHandle, unsubscribeProps: js.Object): Unit = js.native
    def unsubscribe(
      subscription: SubscriptionHandle,
      unsubscribeProps: js.Object,
      unsubscribeCallback: SubscribeListener
    ): Unit = js.native
    
    /**
      * Shorthand property to enable or disable websocket transport.
      * Must be set before performing the initial CometD handshake.
      * Functionally equivelant to cometd.unregisterTransport('websocket');
      */
    var websocketEnabled: Boolean = js.native
  }
  
  trait BaseMessage
    extends StObject
       with Message {
    
    var advice: js.UndefOr[Hosts] = js.undefined
    
    var channel: String
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var connectionType: js.UndefOr[ConnectionType] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var minimumVersion: js.UndefOr[String] = js.undefined
    
    var successful: Boolean
    
    var timestamp: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
  }
  object BaseMessage {
    
    inline def apply(channel: String, successful: Boolean): BaseMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseMessage]
    }
    
    extension [Self <: BaseMessage](x: Self) {
      
      inline def setAdvice(value: Hosts): Self = StObject.set(x, "advice", value.asInstanceOf[js.Any])
      
      inline def setAdviceUndefined: Self = StObject.set(x, "advice", js.undefined)
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setConnectionType(value: ConnectionType): Self = StObject.set(x, "connectionType", value.asInstanceOf[js.Any])
      
      inline def setConnectionTypeUndefined: Self = StObject.set(x, "connectionType", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExt(value: Any): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
      
      inline def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
      
      inline def setSuccessful(value: Boolean): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type Callback = js.Function1[/* data */ Any, Unit]
  
  trait Configuration extends StObject {
    
    /**
      * Determines whether or not the Bayeux message type (handshake, connect, disconnect) is
      * appended to the URL of the Bayeux server (see above).
      */
    var appendMessageTypeToURL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Determines whether multiple publishes that get queued are sent as a batch on the first
      * occasion, without requiring explicit batching.
      */
    var autoBatch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of milliseconds that the backoff time increments every time a connection with the
      * Bayeux server fails. CometD attempts to reconnect after the backoff time elapses.
      */
    var backoffIncrement: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of milliseconds to wait for a WebSocket connection to be opened. It does
      * not apply to HTTP connections. A timeout value of 0 means to wait forever.
      */
    var connectTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The log level. Possible values are: "warn", "info", "debug". Output to `window.console` if
      * available.
      */
    var logLevel: js.UndefOr[String] = js.undefined
    
    /**
      * The maximum number of milliseconds of the backoff time after which the backoff time is not
      * incremented further.
      */
    var maxBackoff: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of connections used to connect to the Bayeux server. Change this value
      * only if you know exactly the client’s connection limit and what "request queued behind long
      * poll" means.
      */
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of milliseconds to wait before considering a request to the Bayeux server
      * failed.
      */
    var maxNetworkDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The max length of the URI for a request made with the callback-polling transport. Microsoft
      * Internet Explorer 7 and 8 are known to limit the URI length, so single large messages sent by
      * CometD may fail to remain within the max URI length when encoded in JSON.
      */
    var maxURILength: js.UndefOr[Double] = js.undefined
    
    /**
      * An object containing the request headers to be sent for every Bayeux request (for example,
      * `{"My-Custom-Header": "MyValue"}`).
      */
    var requestHeaders: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Only applies to the websocket transport. Determines whether to stick using the websocket
      * transport when a websocket transport failure has been detected after the websocket transport
      * was able to successfully connect to the server.
      */
    var stickyReconnect: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL of the Bayeux server this client will connect to.
      */
    var url: String
    
    /**
      * Uses the scheduler service available in Web Workers via Worker.setTimeout(fn, delay) rather
      * than using that available via Window.setTimeout(fn, delay). Browsers are now throttling the
      * Window scheduler in background tabs to save battery in mobile devices, so the Window scheduler
      * events are delayed by possibly several seconds, causing CometD sessions to timeout on the
      * server. The Worker scheduler is not throttled and guarantees that scheduler events happen
      * on time.
      */
    var useWorkerScheduler: js.UndefOr[Boolean] = js.undefined
  }
  object Configuration {
    
    inline def apply(url: String): Configuration = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setAppendMessageTypeToURL(value: Boolean): Self = StObject.set(x, "appendMessageTypeToURL", value.asInstanceOf[js.Any])
      
      inline def setAppendMessageTypeToURLUndefined: Self = StObject.set(x, "appendMessageTypeToURL", js.undefined)
      
      inline def setAutoBatch(value: Boolean): Self = StObject.set(x, "autoBatch", value.asInstanceOf[js.Any])
      
      inline def setAutoBatchUndefined: Self = StObject.set(x, "autoBatch", js.undefined)
      
      inline def setBackoffIncrement(value: Double): Self = StObject.set(x, "backoffIncrement", value.asInstanceOf[js.Any])
      
      inline def setBackoffIncrementUndefined: Self = StObject.set(x, "backoffIncrement", js.undefined)
      
      inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
      
      inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
      
      inline def setLogLevel(value: String): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      inline def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setMaxNetworkDelay(value: Double): Self = StObject.set(x, "maxNetworkDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxNetworkDelayUndefined: Self = StObject.set(x, "maxNetworkDelay", js.undefined)
      
      inline def setMaxURILength(value: Double): Self = StObject.set(x, "maxURILength", value.asInstanceOf[js.Any])
      
      inline def setMaxURILengthUndefined: Self = StObject.set(x, "maxURILength", js.undefined)
      
      inline def setRequestHeaders(value: js.Object): Self = StObject.set(x, "requestHeaders", value.asInstanceOf[js.Any])
      
      inline def setRequestHeadersUndefined: Self = StObject.set(x, "requestHeaders", js.undefined)
      
      inline def setStickyReconnect(value: Boolean): Self = StObject.set(x, "stickyReconnect", value.asInstanceOf[js.Any])
      
      inline def setStickyReconnectUndefined: Self = StObject.set(x, "stickyReconnect", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerScheduler(value: Boolean): Self = StObject.set(x, "useWorkerScheduler", value.asInstanceOf[js.Any])
      
      inline def setUseWorkerSchedulerUndefined: Self = StObject.set(x, "useWorkerScheduler", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cometd.cometdStrings.`long-polling`
    - typingsJapgolly.cometd.cometdStrings.`callback-polling`
    - typingsJapgolly.cometd.cometdStrings.iframe
    - typingsJapgolly.cometd.cometdStrings.flash
  */
  trait ConnectionType extends StObject
  object ConnectionType {
    
    inline def `callback-polling`: typingsJapgolly.cometd.cometdStrings.`callback-polling` = "callback-polling".asInstanceOf[typingsJapgolly.cometd.cometdStrings.`callback-polling`]
    
    inline def flash: typingsJapgolly.cometd.cometdStrings.flash = "flash".asInstanceOf[typingsJapgolly.cometd.cometdStrings.flash]
    
    inline def iframe: typingsJapgolly.cometd.cometdStrings.iframe = "iframe".asInstanceOf[typingsJapgolly.cometd.cometdStrings.iframe]
    
    inline def `long-polling`: typingsJapgolly.cometd.cometdStrings.`long-polling` = "long-polling".asInstanceOf[typingsJapgolly.cometd.cometdStrings.`long-polling`]
  }
  
  trait Extension extends StObject {
    
    var incoming: js.UndefOr[Listener] = js.undefined
    
    var outgoing: js.UndefOr[Listener] = js.undefined
    
    var registered: js.UndefOr[js.Function2[/* name */ String, /* cometd */ CometD, Unit]] = js.undefined
    
    var unregistered: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Extension {
    
    inline def apply(): Extension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Extension]
    }
    
    extension [Self <: Extension](x: Self) {
      
      inline def setIncoming(value: /* message */ Message => japgolly.scalajs.react.Callback): Self = StObject.set(x, "incoming", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setIncomingUndefined: Self = StObject.set(x, "incoming", js.undefined)
      
      inline def setOutgoing(value: /* message */ Message => japgolly.scalajs.react.Callback): Self = StObject.set(x, "outgoing", js.Any.fromFunction1((t0: /* message */ Message) => value(t0).runNow()))
      
      inline def setOutgoingUndefined: Self = StObject.set(x, "outgoing", js.undefined)
      
      inline def setRegistered(value: (/* name */ String, /* cometd */ CometD) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "registered", js.Any.fromFunction2((t0: /* name */ String, t1: /* cometd */ CometD) => (value(t0, t1)).runNow()))
      
      inline def setRegisteredUndefined: Self = StObject.set(x, "registered", js.undefined)
      
      inline def setUnregistered(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "unregistered", value.toJsFn)
      
      inline def setUnregisteredUndefined: Self = StObject.set(x, "unregistered", js.undefined)
    }
  }
  
  type HandshakeListener = js.Function1[/* message */ HandshakeMessage, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cometd.mod.SuccessfulHandshakeMessage
    - typingsJapgolly.cometd.mod.UnsuccessfulHandshakeMessage
  */
  trait HandshakeMessage
    extends StObject
       with Message
  object HandshakeMessage {
    
    inline def SuccessfulHandshakeMessage(
      channel: String,
      clientId: String,
      reestablish: Boolean,
      supportedConnectionTypes: js.Array[ConnectionType],
      version: String
    ): typingsJapgolly.cometd.mod.SuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = true, supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cometd.mod.SuccessfulHandshakeMessage]
    }
    
    inline def UnsuccessfulHandshakeMessage(channel: String, error: String, reestablish: Unit): typingsJapgolly.cometd.mod.UnsuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = false)
      __obj.asInstanceOf[typingsJapgolly.cometd.mod.UnsuccessfulHandshakeMessage]
    }
  }
  
  type Listener = js.Function1[/* message */ Message, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cometd.mod.BaseMessage
    - typingsJapgolly.cometd.mod.HandshakeMessage
    - typingsJapgolly.cometd.mod.SubscribeMessage
  */
  trait Message extends StObject
  object Message {
    
    inline def BaseMessage(channel: String, successful: Boolean): typingsJapgolly.cometd.mod.BaseMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cometd.mod.BaseMessage]
    }
    
    inline def SubscribeMessage(channel: String, subscription: String, successful: Boolean): typingsJapgolly.cometd.mod.SubscribeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cometd.mod.SubscribeMessage]
    }
    
    inline def SuccessfulHandshakeMessage(
      channel: String,
      clientId: String,
      reestablish: Boolean,
      supportedConnectionTypes: js.Array[ConnectionType],
      version: String
    ): typingsJapgolly.cometd.mod.SuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = true, supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.cometd.mod.SuccessfulHandshakeMessage]
    }
    
    inline def UnsuccessfulHandshakeMessage(channel: String, error: String, reestablish: Unit): typingsJapgolly.cometd.mod.UnsuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = false)
      __obj.asInstanceOf[typingsJapgolly.cometd.mod.UnsuccessfulHandshakeMessage]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cometd.cometdStrings.retry
    - typingsJapgolly.cometd.cometdStrings.handshake
    - typingsJapgolly.cometd.cometdStrings.none
  */
  trait ReconnectAdvice extends StObject
  object ReconnectAdvice {
    
    inline def handshake: typingsJapgolly.cometd.cometdStrings.handshake = "handshake".asInstanceOf[typingsJapgolly.cometd.cometdStrings.handshake]
    
    inline def none: typingsJapgolly.cometd.cometdStrings.none = "none".asInstanceOf[typingsJapgolly.cometd.cometdStrings.none]
    
    inline def retry: typingsJapgolly.cometd.cometdStrings.retry = "retry".asInstanceOf[typingsJapgolly.cometd.cometdStrings.retry]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cometd.cometdStrings.disconnected
    - typingsJapgolly.cometd.cometdStrings.disconnecting
    - typingsJapgolly.cometd.cometdStrings.handshaking
    - typingsJapgolly.cometd.cometdStrings.connected
    - typingsJapgolly.cometd.cometdStrings.connecting
  */
  trait Status extends StObject
  object Status {
    
    inline def connected: typingsJapgolly.cometd.cometdStrings.connected = "connected".asInstanceOf[typingsJapgolly.cometd.cometdStrings.connected]
    
    inline def connecting: typingsJapgolly.cometd.cometdStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.cometd.cometdStrings.connecting]
    
    inline def disconnected: typingsJapgolly.cometd.cometdStrings.disconnected = "disconnected".asInstanceOf[typingsJapgolly.cometd.cometdStrings.disconnected]
    
    inline def disconnecting: typingsJapgolly.cometd.cometdStrings.disconnecting = "disconnecting".asInstanceOf[typingsJapgolly.cometd.cometdStrings.disconnecting]
    
    inline def handshaking: typingsJapgolly.cometd.cometdStrings.handshaking = "handshaking".asInstanceOf[typingsJapgolly.cometd.cometdStrings.handshaking]
  }
  
  type SubscribeListener = js.Function1[/* message */ SubscribeMessage, Unit]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.cometd.mod.Message because Already inherited */ trait SubscribeMessage
    extends StObject
       with BaseMessage {
    
    var subscription: String
  }
  object SubscribeMessage {
    
    inline def apply(channel: String, subscription: String, successful: Boolean): SubscribeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeMessage]
    }
    
    extension [Self <: SubscribeMessage](x: Self) {
      
      inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubscriptionHandle extends StObject {
    
    def callback(data: Any): Unit
    @JSName("callback")
    var callback_Original: Callback
    
    var channel: String
    
    var id: Double
    
    var listener: Boolean
    
    var scope: js.UndefOr[Any] = js.undefined
  }
  object SubscriptionHandle {
    
    inline def apply(
      callback: /* data */ Any => japgolly.scalajs.react.Callback,
      channel: String,
      id: Double,
      listener: Boolean
    ): SubscriptionHandle = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1((t0: /* data */ Any) => callback(t0).runNow()), channel = channel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], listener = listener.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionHandle]
    }
    
    extension [Self <: SubscriptionHandle](x: Self) {
      
      inline def setCallback(value: /* data */ Any => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* data */ Any) => value(t0).runNow()))
      
      inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setListener(value: Boolean): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setScope(value: Any): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait SuccessfulHandshakeMessage
    extends StObject
       with BaseMessage
       with HandshakeMessage {
    
    var authSuccessful: js.UndefOr[`true`] = js.undefined
    
    @JSName("clientId")
    var clientId_SuccessfulHandshakeMessage: String
    
    var reestablish: Boolean
    
    @JSName("successful")
    var successful_SuccessfulHandshakeMessage: `true`
    
    var supportedConnectionTypes: js.Array[ConnectionType]
    
    @JSName("version")
    var version_SuccessfulHandshakeMessage: String
  }
  object SuccessfulHandshakeMessage {
    
    inline def apply(
      channel: String,
      clientId: String,
      reestablish: Boolean,
      supportedConnectionTypes: js.Array[ConnectionType],
      version: String
    ): SuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = true, supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessfulHandshakeMessage]
    }
    
    extension [Self <: SuccessfulHandshakeMessage](x: Self) {
      
      inline def setAuthSuccessful(value: `true`): Self = StObject.set(x, "authSuccessful", value.asInstanceOf[js.Any])
      
      inline def setAuthSuccessfulUndefined: Self = StObject.set(x, "authSuccessful", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setReestablish(value: Boolean): Self = StObject.set(x, "reestablish", value.asInstanceOf[js.Any])
      
      inline def setSuccessful(value: `true`): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      inline def setSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = StObject.set(x, "supportedConnectionTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportedConnectionTypesVarargs(value: ConnectionType*): Self = StObject.set(x, "supportedConnectionTypes", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transport extends StObject {
    
    def abort(): Unit
    
    def accept(version: String, crossDomain: Boolean, url: String): Boolean
    
    val `type`: String
    
    var url: String
  }
  object Transport {
    
    inline def apply(
      abort: japgolly.scalajs.react.Callback,
      accept: (String, Boolean, String) => Boolean,
      `type`: String,
      url: String
    ): Transport = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, accept = js.Any.fromFunction3(accept), url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transport]
    }
    
    extension [Self <: Transport](x: Self) {
      
      inline def setAbort(value: japgolly.scalajs.react.Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setAccept(value: (String, Boolean, String) => Boolean): Self = StObject.set(x, "accept", js.Any.fromFunction3(value))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsuccessfulHandshakeMessage
    extends StObject
       with BaseMessage
       with HandshakeMessage {
    
    @JSName("error")
    var error_UnsuccessfulHandshakeMessage: String
    
    var reestablish: Unit
    
    @JSName("successful")
    var successful_UnsuccessfulHandshakeMessage: `false`
    
    var supportedConnectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.undefined
  }
  object UnsuccessfulHandshakeMessage {
    
    inline def apply(channel: String, error: String, reestablish: Unit): UnsuccessfulHandshakeMessage = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = false)
      __obj.asInstanceOf[UnsuccessfulHandshakeMessage]
    }
    
    extension [Self <: UnsuccessfulHandshakeMessage](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setReestablish(value: Unit): Self = StObject.set(x, "reestablish", value.asInstanceOf[js.Any])
      
      inline def setSuccessful(value: `false`): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      inline def setSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = StObject.set(x, "supportedConnectionTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportedConnectionTypesUndefined: Self = StObject.set(x, "supportedConnectionTypes", js.undefined)
      
      inline def setSupportedConnectionTypesVarargs(value: ConnectionType*): Self = StObject.set(x, "supportedConnectionTypes", js.Array(value*))
    }
  }
}
