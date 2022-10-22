package typingsJapgolly.neffosJs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("neffos.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("neffos.js", "Conn")
  @js.native
  open class Conn protected () extends StObject {
    def this(conn: Any, namespaces: Namespaces) = this()
    def this(conn: Any, namespaces: Namespaces, protocols: js.Array[String]) = this()
    
    /* ID is the generated connection ID from the server-side, all connected namespaces(`NSConn` instances)
      that belong to that connection have the same ID. It is available immediately after the `dial`. */
    var ID: String = js.native
    
    /* The ask method writes a message to the server and blocks until a response or an error received. */
    def ask(msg: Message): js.Promise[Message] = js.native
    
    /* The close method will force-disconnect from all connected namespaces and force-leave from all joined rooms
      and finally will terminate the underline websocket connection. After this method call the `Conn` is not usable anymore, a new `dial` call is required. */
    def close(): Unit = js.native
    
    /* The connect method returns a new connected to the specific "namespace" `NSConn` instance or an error. */
    def connect(namespace: String): js.Promise[NSConn] = js.native
    
    /* The isClosed method reports whether this connection is closed. */
    def isClosed(): Boolean = js.native
    
    /* The namespace method returns an already connected `NSConn`. */
    def namespace(namespace: String): NSConn = js.native
    
    /* If > 0 then this connection is the result of a reconnection,
      see `wasReconnected()` too. */
    var reconnectTries: Double = js.native
    
    /* waitServerConnect method blocks until server manually calls the connection's `Connect`
      on the `Server#OnConnected` event. */
    def waitServerConnect(namespace: String): js.Promise[NSConn] = js.native
    
    /* The wasReconnected method reports whether the current connection is the result of a reconnection.
      To get the numbers of total retries see the `reconnectTries` field. */
    def wasReconnected(): Boolean = js.native
    
    /* The write method writes a message to the server and reports whether the connection is still available. */
    def write(msg: Message): Boolean = js.native
  }
  
  @JSImport("neffos.js", "ErrBadNamespace")
  @js.native
  val ErrBadNamespace: js.Error = js.native
  
  @JSImport("neffos.js", "ErrBadRoom")
  @js.native
  val ErrBadRoom: js.Error = js.native
  
  @JSImport("neffos.js", "ErrClosed")
  @js.native
  val ErrClosed: js.Error = js.native
  
  @JSImport("neffos.js", "ErrInvalidPayload")
  @js.native
  val ErrInvalidPayload: js.Error = js.native
  
  @JSImport("neffos.js", "ErrWrite")
  @js.native
  val ErrWrite: js.Error = js.native
  
  @JSImport("neffos.js", "Message")
  @js.native
  open class Message () extends StObject {
    
    /* The actual body of the incoming data. */
    var Body: WSData = js.native
    
    /* The Err contains any message's error if defined and not empty.
      server-side and client-side can return an error instead of a message from inside event callbacks. */
    var Err: js.Error = js.native
    
    /* The Event that this message sent to. */
    var Event: String = js.native
    
    /* The IsForced if true then it means that this is not an incoming action but a force action.
      For example when websocket connection lost from remote the OnNamespaceDisconnect `Message.IsForced` will be true */
    var IsForced: Boolean = js.native
    
    /* The IsLocal reprots whether an event is sent by the client-side itself, i.e when `connect` call on `OnNamespaceConnect` event the `Message.IsLocal` will be true,
      server-side can force-connect a client to connect to a namespace as well in this case the `IsLocal` will be false. */
    var IsLocal: Boolean = js.native
    
    /* The IsNative reports whether the Message is websocket native messages, only Body is filled. */
    var IsNative: Boolean = js.native
    
    /* The Namespace that this message sent to. */
    var Namespace: String = js.native
    
    /* The Room that this message sent to. */
    var Room: String = js.native
    
    /* The SetBinary can be filled to true if the client must send this message using the Binary format message. */
    var SetBinary: Boolean = js.native
    
    /* unmarshal method returns this Message's `Body` as an object,
      equivalent to the Go's `neffos.Message.Unmarshal` method.
      It can be used inside an event's callbacks.
      See library-level `marshal` function too. */
    def unmarshal(): Any = js.native
  }
  
  @JSImport("neffos.js", "NSConn")
  @js.native
  open class NSConn protected () extends StObject {
    def this(conn: Conn, namespace: String, events: Events) = this()
    
    /* See `Conn.ask`. */
    def ask(event: String, body: WSData): js.Promise[Message] = js.native
    
    /* The conn property refers to the main `Conn` constructed by the `dial` function. */
    var conn: Conn = js.native
    
    /* The disconnect method sends a disconnect signal to the server and fires the `OnNamespaceDisconnect` event. */
    def disconnect(): js.Promise[js.Error] = js.native
    
    /* The emit method sends a message to the server with its `Message.Namespace` filled to this specific namespace. */
    def emit(event: String, body: WSData): Boolean = js.native
    
    var events: Events = js.native
    
    /* The joinRoom method can be used to join to a specific room, rooms are dynamic.
      Returns a `Room` or an error. */
    def joinRoom(roomName: String): js.Promise[Room] = js.native
    
    /* The leaveAll method sends a leave room signal to all rooms and fires the `OnRoomLeave` and `OnRoomLeft` (if no error occurred) events. */
    def leaveAll(): js.Promise[js.Error] = js.native
    
    var namespace: String = js.native
    
    /* The room method returns a joined `Room`. */
    def room(roomName: String): Room = js.native
    
    /* The rooms property its the map of the connected namespace's joined rooms. */
    var rooms: Map[String, Room] = js.native
  }
  
  @JSImport("neffos.js", "OnAnyEvent")
  @js.native
  val OnAnyEvent: /* "_OnAnyEvent" */ String = js.native
  
  @JSImport("neffos.js", "OnNamespaceConnect")
  @js.native
  val OnNamespaceConnect: /* "_OnNamespaceConnect" */ String = js.native
  
  @JSImport("neffos.js", "OnNamespaceConnected")
  @js.native
  val OnNamespaceConnected: /* "_OnNamespaceConnected" */ String = js.native
  
  @JSImport("neffos.js", "OnNamespaceDisconnect")
  @js.native
  val OnNamespaceDisconnect: /* "_OnNamespaceDisconnect" */ String = js.native
  
  @JSImport("neffos.js", "OnNativeMessage")
  @js.native
  val OnNativeMessage: /* "_OnNativeMessage" */ String = js.native
  
  @JSImport("neffos.js", "OnRoomJoin")
  @js.native
  val OnRoomJoin: /* "_OnRoomJoin" */ String = js.native
  
  @JSImport("neffos.js", "OnRoomJoined")
  @js.native
  val OnRoomJoined: /* "_OnRoomJoined" */ String = js.native
  
  @JSImport("neffos.js", "OnRoomLeave")
  @js.native
  val OnRoomLeave: /* "_OnRoomLeave" */ String = js.native
  
  @JSImport("neffos.js", "OnRoomLeft")
  @js.native
  val OnRoomLeft: /* "_OnRoomLeft" */ String = js.native
  
  @JSImport("neffos.js", "Room")
  @js.native
  open class Room protected () extends StObject {
    def this(ns: NSConn, roomName: String) = this()
    
    /* The emit method sends a message to the server with its `Message.Room` filled to this specific room
      and `Message.Namespace` to the underline `NSConn`'s namespace. */
    def emit(event: String, body: WSData): Boolean = js.native
    
    /* The emitBinary method sends a binary message to the server with its `Message.Namespace` filled to this specific namespace
      and `Message.SetBinary` to true. */
    def emitBinary(event: String, body: WSData): Boolean = js.native
    
    /* The leave method sends a local and server room leave signal `OnRoomLeave`
      and if succeed it fires the OnRoomLeft` event. */
    def leave(): js.Promise[js.Error] = js.native
    
    var name: String = js.native
    
    var nsConn: NSConn = js.native
  }
  
  @JSImport("neffos.js", "URLParamAsHeaderPrefix")
  @js.native
  val URLParamAsHeaderPrefix: /* "X-Websocket-Header-" */ String = js.native
  
  inline def dial(endpoint: String, connHandler: Any): js.Promise[Conn] = (^.asInstanceOf[js.Dynamic].applyDynamic("dial")(endpoint.asInstanceOf[js.Any], connHandler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conn]]
  inline def dial(endpoint: String, connHandler: Any, options: Any): js.Promise[Conn] = (^.asInstanceOf[js.Dynamic].applyDynamic("dial")(endpoint.asInstanceOf[js.Any], connHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conn]]
  inline def dial(endpoint: String, connHandler: Any, options: Options): js.Promise[Conn] = (^.asInstanceOf[js.Dynamic].applyDynamic("dial")(endpoint.asInstanceOf[js.Any], connHandler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Conn]]
  
  inline def isCloseError(err: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloseError")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isSystemEvent(event: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSystemEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def marshal(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("marshal")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def reply(body: WSData): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("reply")(body.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  type Events = Map[String, MessageHandlerFunc]
  
  type Headers = StringDictionary[Any]
  
  type MessageHandlerFunc = js.Function2[/* c */ NSConn, /* msg */ Message, js.Error]
  
  type Namespaces = Map[String, Events]
  
  trait Options extends StObject {
    
    var headers: js.UndefOr[Headers] = js.undefined
    
    var protocols: js.UndefOr[js.Array[String]] = js.undefined
    
    var reconnnect: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setReconnnect(value: Double): Self = StObject.set(x, "reconnnect", value.asInstanceOf[js.Any])
      
      inline def setReconnnectUndefined: Self = StObject.set(x, "reconnnect", js.undefined)
    }
  }
  
  type WSData = String
}
