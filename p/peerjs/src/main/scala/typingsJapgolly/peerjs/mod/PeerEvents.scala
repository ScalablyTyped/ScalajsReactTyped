package typingsJapgolly.peerjs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerEvents extends StObject {
  
  /**
    * Emitted when a remote peer attempts to call you.
    */
  def call(mediaConnection: MediaConnection): Unit
  
  /**
    * Emitted when the peer is destroyed and can no longer accept or create any new connections.
    */
  def close(): Unit
  
  /**
    * Emitted when a new data connection is established from a remote peer.
    */
  def connection(dataConnection: DataConnection): Unit
  
  /**
    * Emitted when the peer is disconnected from the signalling server
    */
  def disconnected(currentId: String): Unit
  
  /**
    * Errors on the peer are almost always fatal and will destroy the peer.
    */
  def error(error: js.Error): Unit
  
  /**
    * Emitted when a connection to the PeerServer is established.
    */
  def open(id: String): Unit
}
object PeerEvents {
  
  inline def apply(
    call: MediaConnection => Callback,
    close: Callback,
    connection: DataConnection => Callback,
    disconnected: String => Callback,
    error: js.Error => Callback,
    open: String => Callback
  ): PeerEvents = {
    val __obj = js.Dynamic.literal(call = js.Any.fromFunction1((t0: MediaConnection) => call(t0).runNow()), close = close.toJsFn, connection = js.Any.fromFunction1((t0: DataConnection) => connection(t0).runNow()), disconnected = js.Any.fromFunction1((t0: String) => disconnected(t0).runNow()), error = js.Any.fromFunction1((t0: js.Error) => error(t0).runNow()), open = js.Any.fromFunction1((t0: String) => open(t0).runNow()))
    __obj.asInstanceOf[PeerEvents]
  }
  
  extension [Self <: PeerEvents](x: Self) {
    
    inline def setCall(value: MediaConnection => Callback): Self = StObject.set(x, "call", js.Any.fromFunction1((t0: MediaConnection) => value(t0).runNow()))
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConnection(value: DataConnection => Callback): Self = StObject.set(x, "connection", js.Any.fromFunction1((t0: DataConnection) => value(t0).runNow()))
    
    inline def setDisconnected(value: String => Callback): Self = StObject.set(x, "disconnected", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setError(value: js.Error => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setOpen(value: String => Callback): Self = StObject.set(x, "open", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
