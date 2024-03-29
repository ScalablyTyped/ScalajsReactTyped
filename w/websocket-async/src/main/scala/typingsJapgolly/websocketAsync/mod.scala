package typingsJapgolly.websocketAsync

import org.scalajs.dom.CloseEvent
import org.scalajs.dom.WebSocket
import typingsJapgolly.websocketAsync.anon.Reject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("websocket-async", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with WebSocketClient
  
  @js.native
  trait WebSocketClient extends StObject {
    
    var _closeEvent: CloseEvent | Null = js.native
    
    var _receiveCallbacksQueue: js.Array[Reject] = js.native
    
    var _receiveDataQueue: js.Array[Any] = js.native
    
    /**
      * Resets the receive arrays and close events, called in the constructor
      */
    /* private */ def _reset(): Unit = js.native
    
    /**
      * Sets up the event listeners, which do the bulk of the work.
      */
    /* private */ def _setupListenersOnConnect(): js.Promise[Unit] = js.native
    
    var _socket: WebSocket = js.native
    
    /**
      * Sets up a WebSocket connection to specified url. Resolves when the
      * connection is established. Can be called again to reconnect to any url.
      */
    def connect(url: String): js.Promise[Unit] = js.native
    def connect(url: String, protocols: String): js.Promise[Unit] = js.native
    
    /**
      * Whether a connection is currently open.
      * @returns true if the connection is open.
      */
    def connected(): Boolean = js.native
    
    /**
      * The number of messages available to receive.
      * @returns The number of queued messages that can be retrieved with {@link #receive}
      */
    def dataAvailable(): Double = js.native
    
    /**
      * Initiates the close handshake if there is an active connection.
      * Returns a promise that will never reject.
      * The promise resolves once the WebSocket connection is closed.
      */
    def disconnect(): js.Promise[CloseEvent | Null] = js.native
    def disconnect(code: Double): js.Promise[CloseEvent | Null] = js.native
    def disconnect(code: Double, reason: String): js.Promise[CloseEvent | Null] = js.native
    def disconnect(code: Unit, reason: String): js.Promise[CloseEvent | Null] = js.native
    
    /**
      * Asynchronously receive data from the websocket.
      * Resolves immediately if there is buffered, unreceived data.
      * Otherwise, resolves with the next rececived message,
      * or rejects if disconnected.
      * @returns A promise that resolves with the data received.
      */
    def receive(): js.Promise[Any] = js.native
    
    /**
      * Send data through the websocket.
      * Must be connected. See {@link #connected}.
      */
    def send(data: Any): Unit = js.native
  }
}
