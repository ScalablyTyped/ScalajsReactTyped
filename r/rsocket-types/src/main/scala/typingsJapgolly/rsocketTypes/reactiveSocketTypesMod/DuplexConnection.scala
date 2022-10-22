package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DuplexConnection extends StObject {
  
  /**
    * Close the underlying connection, emitting `onComplete` on the receive()
    * Publisher.
    */
  def close(): Unit
  
  /**
    * Open the underlying connection. Throws if the connection is already in
    * the CLOSED or ERROR state.
    */
  def connect(): Unit
  
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  def connectionStatus(): Any
  
  /**
    * Returns a stream of all `Frame`s received on this connection.
    *
    * Notes:
    * - Implementations must call `onComplete` if the underlying connection is
    *   closed by the peer or by calling `close()`.
    * - Implementations must call `onError` if there are any errors
    *   sending/receiving frames.
    * - Implemenations may optionally support multi-cast receivers. Those that do
    *   not should throw if `receive` is called more than once.
    */
  def receive(): Any
  
  /**
    * Send all the `input` frames on this connection.
    *
    * Notes:
    * - Implementations must not cancel the subscription.
    * - Implementations must signal any errors by calling `onError` on the
    *   `receive()` Publisher.
    */
  def send(
    input: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Frame> */ Any
  ): Unit
  
  /**
    * Send a single frame on the connection.
    */
  def sendOne(frame: Frame): Unit
}
object DuplexConnection {
  
  inline def apply(
    close: Callback,
    connect: Callback,
    connectionStatus: CallbackTo[Any],
    receive: CallbackTo[Any],
    send: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Frame> */ Any => Callback,
    sendOne: Frame => Callback
  ): DuplexConnection = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, connect = connect.toJsFn, connectionStatus = connectionStatus.toJsFn, receive = receive.toJsFn, send = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Frame> */ Any) => send(t0).runNow()), sendOne = js.Any.fromFunction1((t0: Frame) => sendOne(t0).runNow()))
    __obj.asInstanceOf[DuplexConnection]
  }
  
  extension [Self <: DuplexConnection](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setConnect(value: Callback): Self = StObject.set(x, "connect", value.toJsFn)
    
    inline def setConnectionStatus(value: CallbackTo[Any]): Self = StObject.set(x, "connectionStatus", value.toJsFn)
    
    inline def setReceive(value: CallbackTo[Any]): Self = StObject.set(x, "receive", value.toJsFn)
    
    inline def setSend(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Frame> */ Any => Callback
    ): Self = StObject.set(x, "send", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Flowable<Frame> */ Any) => value(t0).runNow()))
    
    inline def setSendOne(value: Frame => Callback): Self = StObject.set(x, "sendOne", js.Any.fromFunction1((t0: Frame) => value(t0).runNow()))
  }
}
