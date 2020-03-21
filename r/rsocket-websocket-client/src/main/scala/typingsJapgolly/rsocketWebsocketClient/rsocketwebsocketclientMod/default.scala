package typingsJapgolly.rsocketWebsocketClient.rsocketwebsocketclientMod

import typingsJapgolly.rsocketCore.rsocketencodingMod.Encoders
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-client/RSocketWebSocketClient", JSImport.Default)
@js.native
class default protected () extends RSocketWebSocketClient {
  def this(options: ClientOptions) = this()
  def this(options: ClientOptions, encoders: Encoders[_]) = this()
  /**
    * Close the underlying connection, emitting `onComplete` on the receive()
    * Publisher.
    */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Open the underlying connection. Throws if the connection is already in
    * the CLOSED or ERROR state.
    */
  /* CompleteClass */
  override def connect(): Unit = js.native
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  /* CompleteClass */
  override def connectionStatus(): Flowable[ConnectionStatus] = js.native
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
  /* CompleteClass */
  override def receive(): Flowable[Frame] = js.native
  /**
    * Send all the `input` frames on this connection.
    *
    * Notes:
    * - Implementations must not cancel the subscription.
    * - Implementations must signal any errors by calling `onError` on the
    *   `receive()` Publisher.
    */
  /* CompleteClass */
  override def send(input: Flowable[Frame]): Unit = js.native
  /**
    * Send a single frame on the connection.
    */
  /* CompleteClass */
  override def sendOne(frame: Frame): Unit = js.native
}

