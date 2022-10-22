package typingsJapgolly.nodeOsc

import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.nodeOsc.anon.Address
import typingsJapgolly.nodeOsc.nodeOscStrings.bundle
import typingsJapgolly.nodeOsc.nodeOscStrings.error
import typingsJapgolly.nodeOsc.nodeOscStrings.listening
import typingsJapgolly.nodeOsc.nodeOscStrings.message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-osc", "Bundle")
  @js.native
  open class Bundle protected () extends StObject {
    def this(elements: MessageLike*) = this()
    def this(timetag: Double, elements: MessageLike*) = this()
    
    def append(element: Bundle): Unit = js.native
    def append(element: MessageLike): Unit = js.native
    
    var elements: js.Array[Message] = js.native
    
    var timetag: Double = js.native
  }
  
  @JSImport("node-osc", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(host: String, port: Double) = this()
    
    /** Close the underlying socket */
    def close(): Unit = js.native
    def close(cb: ClientCloseCallback): Unit = js.native
    
    /** Send a message to the server */
    def send(addressOrMessage: String): Unit = js.native
    def send(addressOrMessage: Message): Unit = js.native
    def send(addressOrMessage: MessageLike): Unit = js.native
    def send(
      address: String,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...Array<Message | MessageLike>, ClientSendCallback] is not an array type */ args: Array[ClientSendCallback | Message | MessageLike]
    ): Unit = js.native
    def send(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [...Array<Message | MessageLike>, ClientSendCallback] is not an array type */ args: Array[ClientSendCallback | Message | MessageLike]
    ): Unit = js.native
    /** Send a Bundle message to the server */
    def send(bundle: Bundle): Unit = js.native
    def send(bundle: Bundle, callback: ClientSendCallback): Unit = js.native
  }
  
  @JSImport("node-osc", "Message")
  @js.native
  open class Message protected () extends StObject {
    def this(address: String, args: ArgumentType*) = this()
    
    def append(arg: js.Array[ArgumentType]): Unit = js.native
    def append(arg: ArgumentType): Unit = js.native
  }
  
  @JSImport("node-osc", "Server")
  @js.native
  open class Server protected () extends EventEmitter {
    def this(port: Double, host: String) = this()
    def this(port: Double, host: String, cb: ServerCallback) = this()
    
    def close(): Unit = js.native
    def close(cb: ServerCallback): Unit = js.native
    
    /**
      * Listen for all the bundles received by the server.
      *
      * @warning Bundle support is Experimental and subject to change at any point.
      *
      * @see https://github.com/MylesBorins/node-osc#listening-for-osc-bundles
      */
    @JSName("on")
    def on_bundle(event: bundle, listener: ServerBundleListener): this.type = js.native
    /** Listen for errors occurred during message decoding */
    @JSName("on")
    def on_error(event: error, listener: ServerErrorListner): this.type = js.native
    /** Listen for the listening event emitted as soon as the server is ready to receive messages */
    @JSName("on")
    def on_listening(event: listening, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: ServerMessageListener): this.type = js.native
  }
  
  trait Argument extends StObject {
    
    var `type`: String
    
    var value: Boolean | Double | String
  }
  object Argument {
    
    inline def apply(`type`: String, value: Boolean | Double | String): Argument = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Argument]
    }
    
    extension [Self <: Argument](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Boolean | Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type ArgumentType = Boolean | Double | String | Argument
  
  type ClientCloseCallback = js.Function0[Unit]
  
  type ClientSendCallback = js.Function1[/* err */ js.Error | Null, Unit]
  
  type MessageLike = (Array[String | ArgumentType]) | Address
  
  type ServerBundleListener = js.Function1[/* bundle */ Bundle, Unit]
  
  type ServerCallback = js.Function0[Unit]
  
  type ServerErrorListner = js.Function1[/* error */ js.Error, Unit]
  
  type ServerMessageListener = js.Function1[/* message */ Array[String | ArgumentType], Unit]
}
