package typingsJapgolly.node

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diagnosticsChannelMod {
  
  @JSImport("diagnostics_channel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The class `Channel` represents an individual named channel within the data
    * pipeline. It is use to track subscribers and to publish messages when there
    * are subscribers present. It exists as a separate object to avoid channel
    * lookups at publish time, enabling very fast publish speeds and allowing
    * for heavy use while incurring very minimal cost. Channels are created with {@link channel}, constructing a channel directly
    * with `new Channel(name)` is not supported.
    * @since v15.1.0, v14.17.0
    */
  @JSImport("diagnostics_channel", "Channel")
  @js.native
  open class Channel_ protected () extends StObject {
    /* private */ def this(name: String) = this()
    
    /**
      * Check if there are active subscribers to this channel. This is helpful if
      * the message you want to send might be expensive to prepare.
      *
      * This API is optional but helpful when trying to publish messages from very
      * performance-sensitive code.
      *
      * ```js
      * import diagnostics_channel from 'diagnostics_channel';
      *
      * const channel = diagnostics_channel.channel('my-channel');
      *
      * if (channel.hasSubscribers) {
      *   // There are subscribers, prepare and publish message
      * }
      * ```
      * @since v15.1.0, v14.17.0
      */
    val hasSubscribers: Boolean = js.native
    
    val name: String = js.native
    
    /**
      * Publish a message to any subscribers to the channel. This will
      * trigger message handlers synchronously so they will execute within
      * the same context.
      *
      * ```js
      * import diagnostics_channel from 'diagnostics_channel';
      *
      * const channel = diagnostics_channel.channel('my-channel');
      *
      * channel.publish({
      *   some: 'message'
      * });
      * ```
      * @since v15.1.0, v14.17.0
      * @param message The message to send to the channel subscribers
      */
    def publish(message: Any): Unit = js.native
    
    /**
      * Register a message handler to subscribe to this channel. This message handler
      * will be run synchronously whenever a message is published to the channel. Any
      * errors thrown in the message handler will trigger an `'uncaughtException'`.
      *
      * ```js
      * import diagnostics_channel from 'diagnostics_channel';
      *
      * const channel = diagnostics_channel.channel('my-channel');
      *
      * channel.subscribe((message, name) => {
      *   // Received data
      * });
      * ```
      * @since v15.1.0, v14.17.0
      * @param onMessage The handler to receive channel messages
      */
    def subscribe(onMessage: ChannelListener): Unit = js.native
    
    /**
      * Remove a message handler previously registered to this channel with `channel.subscribe(onMessage)`.
      *
      * ```js
      * import diagnostics_channel from 'diagnostics_channel';
      *
      * const channel = diagnostics_channel.channel('my-channel');
      *
      * function onMessage(message, name) {
      *   // Received data
      * }
      *
      * channel.subscribe(onMessage);
      *
      * channel.unsubscribe(onMessage);
      * ```
      * @since v15.1.0, v14.17.0
      * @param onMessage The previous subscribed handler to remove
      * @return `true` if the handler was found, `false` otherwise.
      */
    def unsubscribe(onMessage: ChannelListener): Unit = js.native
  }
  
  /**
    * This is the primary entry-point for anyone wanting to interact with a named
    * channel. It produces a channel object which is optimized to reduce overhead at
    * publish time as much as possible.
    *
    * ```js
    * import diagnostics_channel from 'diagnostics_channel';
    *
    * const channel = diagnostics_channel.channel('my-channel');
    * ```
    * @since v15.1.0, v14.17.0
    * @param name The channel name
    * @return The named channel object
    */
  inline def channel(name: String): Channel_ = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(name.asInstanceOf[js.Any]).asInstanceOf[Channel_]
  
  /**
    * Check if there are active subscribers to the named channel. This is helpful if
    * the message you want to send might be expensive to prepare.
    *
    * This API is optional but helpful when trying to publish messages from very
    * performance-sensitive code.
    *
    * ```js
    * import diagnostics_channel from 'diagnostics_channel';
    *
    * if (diagnostics_channel.hasSubscribers('my-channel')) {
    *   // There are subscribers, prepare and publish message
    * }
    * ```
    * @since v15.1.0, v14.17.0
    * @param name The channel name
    * @return If there are active subscribers
    */
  inline def hasSubscribers(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSubscribers")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type ChannelListener = js.Function2[/* message */ Any, /* name */ String, Unit]
}
