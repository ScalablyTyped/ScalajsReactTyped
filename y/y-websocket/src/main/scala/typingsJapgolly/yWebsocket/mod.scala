package typingsJapgolly.yWebsocket

import org.scalajs.dom.WebSocket
import typingsJapgolly.lib0.decodingMod.Decoder
import typingsJapgolly.lib0.encodingMod.Encoder
import typingsJapgolly.lib0.observableMod.Observable
import typingsJapgolly.yWebsocket.anon.Awareness
import typingsJapgolly.yWebsocket.anon.Instantiable
import typingsJapgolly.yWebsocket.yWebsocketInts.`0`
import typingsJapgolly.yWebsocket.yWebsocketInts.`1`
import typingsJapgolly.yWebsocket.yWebsocketInts.`2`
import typingsJapgolly.yWebsocket.yWebsocketInts.`3`
import typingsJapgolly.yjs.mod.Doc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("y-websocket", "WebsocketProvider")
  @js.native
  open class WebsocketProvider protected () extends Observable[String] {
    /**
      * @param {string} serverUrl
      * @param {string} roomname
      * @param {Y.Doc} doc
      * @param {object} [opts]
      * @param {boolean} [opts.connect]
      * @param {awarenessProtocol.Awareness} [opts.awareness]
      * @param {Object<string,string>} [opts.params]
      * @param {typeof WebSocket} [opts.WebSocketPolyfill] Optionall provide a WebSocket polyfill
      * @param {number} [opts.resyncInterval] Request server state every `resyncInterval` milliseconds
      * @param {number} [opts.maxBackoffTime] Maximum amount of time to wait before trying to reconnect (we try to reconnect using exponential backoff)
      * @param {boolean} [opts.disableBc] Disable cross-tab BroadcastChannel communication
      */
    def this(serverUrl: String, roomname: String, doc: Doc) = this()
    def this(
      serverUrl: String,
      roomname: String,
      doc: Doc,
      hasConnectAwarenessParamsWebSocketPolyfillResyncIntervalMaxBackoffTimeDisableBc: Awareness
    ) = this()
    
    var _WS: Instantiable = js.native
    
    /**
      * @param {any} changed
      * @param {any} _origin
      */
    def _awarenessUpdateHandler(hasAddedUpdatedRemoved: Any, _origin: Any): Unit = js.native
    
    /**
      * @param {ArrayBuffer} data
      * @param {any} origin
      */
    def _bcSubscriber(data: js.typedarray.ArrayBuffer, origin: Any): Unit = js.native
    
    var _checkInterval: Any = js.native
    
    /**
      * @type {number}
      */
    var _resyncInterval: Double = js.native
    
    /**
      * @type {boolean}
      */
    var _synced: Boolean = js.native
    
    def _unloadHandler(): Unit = js.native
    
    /**
      * Listens to Yjs updates and sends them to remote peers (ws and broadcastchannel)
      * @param {Uint8Array} update
      * @param {any} origin
      */
    def _updateHandler(update: js.typedarray.Uint8Array, origin: Any): Unit = js.native
    
    var awareness: typingsJapgolly.yProtocols.awarenessMod.Awareness = js.native
    
    var bcChannel: String = js.native
    
    var bcconnected: Boolean = js.native
    
    def connect(): Unit = js.native
    
    def connectBc(): Unit = js.native
    
    var disableBc: Boolean = js.native
    
    def disconnect(): Unit = js.native
    
    def disconnectBc(): Unit = js.native
    
    var doc: Doc = js.native
    
    var maxBackoffTime: Double = js.native
    
    var messageHandlers: js.Array[
        js.Function5[
          /* arg0 */ Encoder, 
          /* arg1 */ Decoder, 
          /* arg2 */ this.type, 
          /* arg3 */ Boolean, 
          /* arg4 */ Double, 
          Unit
        ]
      ] = js.native
    
    var roomname: String = js.native
    
    /**
      * Whether to connect to other peers or not
      * @type {boolean}
      */
    var shouldConnect: Boolean = js.native
    
    /**
      * @type {boolean}
      */
    def synced: Boolean = js.native
    def synced_=(arg: Boolean): Unit = js.native
    
    var url: String = js.native
    
    /**
      * @type {WebSocket?}
      */
    var ws: WebSocket | Null = js.native
    
    var wsLastMessageReceived: Double = js.native
    
    var wsUnsuccessfulReconnects: Double = js.native
    
    var wsconnected: Boolean = js.native
    
    var wsconnecting: Boolean = js.native
  }
  
  @JSImport("y-websocket", "messageAuth")
  @js.native
  val messageAuth: `2` = js.native
  
  @JSImport("y-websocket", "messageAwareness")
  @js.native
  val messageAwareness: `1` = js.native
  
  @JSImport("y-websocket", "messageQueryAwareness")
  @js.native
  val messageQueryAwareness: `3` = js.native
  
  @JSImport("y-websocket", "messageSync")
  @js.native
  val messageSync: `0` = js.native
}
