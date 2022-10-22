package typingsJapgolly.engineIo

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.engineIo.anon.Typeofpolling
import typingsJapgolly.engineIo.buildServerMod.AttachOptions
import typingsJapgolly.engineIo.buildServerMod.ServerOptions
import typingsJapgolly.engineIo.buildTransportsWebsocketMod.WebSocket
import typingsJapgolly.engineIoParser.buildEsmCommonsMod.BinaryType
import typingsJapgolly.engineIoParser.buildEsmCommonsMod.Packet
import typingsJapgolly.engineIoParser.buildEsmCommonsMod.RawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("engine.io", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("engine.io", "Server")
  @js.native
  /**
    * Server constructor.
    *
    * @param {Object} opts - options
    * @api public
    */
  open class Server ()
    extends typingsJapgolly.engineIo.buildServerMod.Server {
    def this(opts: ServerOptions) = this()
  }
  
  @JSImport("engine.io", "Socket")
  @js.native
  open class Socket protected ()
    extends typingsJapgolly.engineIo.buildSocketMod.Socket {
    /**
      * Client class (abstract).
      *
      * @api private
      */
    def this(id: Any, server: Any, transport: Any, req: Any, protocol: Any) = this()
  }
  
  /* note: abstract class */ @JSImport("engine.io", "Transport")
  @js.native
  open class Transport protected ()
    extends typingsJapgolly.engineIo.buildTransportMod.Transport {
    /**
      * Transport constructor.
      *
      * @param {http.IncomingMessage} request
      * @api public
      */
    def this(req: Any) = this()
  }
  
  /**
    * Captures upgrade requests for a http.Server.
    *
    * @param {http.Server} server
    * @param {Object} options
    * @return {Server} engine server
    * @api public
    */
  inline def attach(server: Any, options: AttachOptions & ServerOptions): typingsJapgolly.engineIo.buildServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.engineIo.buildServerMod.Server]
  
  /**
    * Creates an http.Server exclusively used for WS upgrades.
    *
    * @param {Number} port
    * @param {Function} callback
    * @param {Object} options
    * @return {Server} websocket.io server
    * @api public
    */
  inline def listen(port: Any, options: AttachOptions & ServerOptions, fn: Any): typingsJapgolly.engineIo.buildServerMod.Server = (^.asInstanceOf[js.Dynamic].applyDynamic("listen")(port.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.engineIo.buildServerMod.Server]
  
  object parser {
    
    @JSImport("engine.io", "parser")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodePacket(encodedPacket: RawData): Packet = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(encodedPacket.asInstanceOf[js.Any]).asInstanceOf[Packet]
    inline def decodePacket(encodedPacket: RawData, binaryType: BinaryType): Packet = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePacket")(encodedPacket.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[Packet]
    
    inline def decodePayload(encodedPayload: String): js.Array[Packet] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(encodedPayload.asInstanceOf[js.Any]).asInstanceOf[js.Array[Packet]]
    inline def decodePayload(encodedPayload: String, binaryType: BinaryType): js.Array[Packet] = (^.asInstanceOf[js.Dynamic].applyDynamic("decodePayload")(encodedPayload.asInstanceOf[js.Any], binaryType.asInstanceOf[js.Any])).asInstanceOf[js.Array[Packet]]
    
    inline def encodePacket(
      hasTypeData: Packet,
      supportsBinary: Boolean,
      callback: js.Function1[/* encodedPacket */ RawData, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePacket")(hasTypeData.asInstanceOf[js.Any], supportsBinary.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def encodePayload(packets: js.Array[Packet], callback: js.Function1[/* encodedPayload */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("encodePayload")(packets.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("engine.io", "parser.protocol")
    @js.native
    val protocol: /* 4 */ Double = js.native
  }
  
  @JSImport("engine.io", "protocol")
  @js.native
  val protocol: /* 4 */ Double = js.native
  
  object transports {
    
    @JSImport("engine.io", "transports")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("engine.io", "transports.polling")
    @js.native
    def polling: Typeofpolling = js.native
    inline def polling_=(x: Typeofpolling): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("polling")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("engine.io", "transports.websocket")
    @js.native
    open class websocket protected () extends WebSocket {
      /**
        * WebSocket transport
        *
        * @param {http.IncomingMessage}
        * @api public
        */
      def this(req: Any) = this()
    }
    @JSImport("engine.io", "transports.websocket")
    @js.native
    def websocket: Instantiable1[/* req */ Any, WebSocket] = js.native
    inline def websocket_=(x: Instantiable1[/* req */ Any, WebSocket]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("websocket")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("engine.io", "uServer")
  @js.native
  /**
    * Server constructor.
    *
    * @param {Object} opts - options
    * @api public
    */
  open class uServer ()
    extends typingsJapgolly.engineIo.buildUserverMod.uServer {
    def this(opts: ServerOptions) = this()
  }
}
