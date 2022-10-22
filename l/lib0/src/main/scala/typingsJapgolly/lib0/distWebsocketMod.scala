package typingsJapgolly.lib0

import org.scalajs.dom.WebSocket
import typingsJapgolly.lib0.anon.BinaryType
import typingsJapgolly.lib0.distObservableMod.Observable
import typingsJapgolly.lib0.lib0Strings.arraybuffer
import typingsJapgolly.lib0.lib0Strings.blob
import typingsJapgolly.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebsocketMod {
  
  @JSImport("lib0/dist/websocket", "WebsocketClient")
  @js.native
  open class WebsocketClient protected () extends Observable[String] {
    /**
      * @param {string} url
      * @param {object} [opts]
      * @param {'arraybuffer' | 'blob' | null} [opts.binaryType] Set `ws.binaryType`
      */
    def this(url: String) = this()
    def this(url: String, hasBinaryType: BinaryType) = this()
    
    var _checkInterval: Timer = js.native
    
    var binaryType: arraybuffer | blob | Null = js.native
    
    def connect(): Unit = js.native
    
    var connected: Boolean = js.native
    
    var connecting: Boolean = js.native
    
    def disconnect(): Unit = js.native
    
    var lastMessageReceived: Double = js.native
    
    /**
      * @param {any} message
      */
    def send(message: Any): Unit = js.native
    
    /**
      * Whether to connect to other peers or not
      * @type {boolean}
      */
    var shouldConnect: Boolean = js.native
    
    var unsuccessfulReconnects: Double = js.native
    
    var url: String = js.native
    
    /**
      * @type {WebSocket?}
      */
    var ws: WebSocket | Null = js.native
  }
}
