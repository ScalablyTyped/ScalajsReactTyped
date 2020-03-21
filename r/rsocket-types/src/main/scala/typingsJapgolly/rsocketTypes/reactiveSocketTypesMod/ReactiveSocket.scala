package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketFlowable.mod.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactiveSocket[D, M] extends Responder[D, M] {
  /**
    * Returns positive number representing the availability of RSocket requester. Higher is better, 0.0
    * means not available.
    */
  def availability(): Double
  /**
    * Close this `ReactiveSocket` and the underlying transport connection.
    */
  def close(): Unit
  /**
    * Returns a Flowable that immediately publishes the current connection
    * status and thereafter updates as it changes. Once a connection is in
    * the CLOSED or ERROR state, it may not be connected again.
    * Implementations must publish values per the comments on ConnectionStatus.
    */
  def connectionStatus(): Flowable[ConnectionStatus]
}

object ReactiveSocket {
  @scala.inline
  def apply[D, M](
    availability: CallbackTo[Double],
    close: Callback,
    connectionStatus: CallbackTo[Flowable[ConnectionStatus]],
    fireAndForget: Payload[D, M] => Callback,
    metadataPush: Payload[D, M] => CallbackTo[Single[Unit]],
    requestChannel: Flowable[Payload[D, M]] => CallbackTo[Flowable[Payload[D, M]]],
    requestResponse: Payload[D, M] => CallbackTo[Single[Payload[D, M]]],
    requestStream: Payload[D, M] => CallbackTo[Flowable[Payload[D, M]]]
  ): ReactiveSocket[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("availability")(availability.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("connectionStatus")(connectionStatus.toJsFn)
    __obj.updateDynamic("fireAndForget")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => fireAndForget(t0).runNow()))
    __obj.updateDynamic("metadataPush")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => metadataPush(t0).runNow()))
    __obj.updateDynamic("requestChannel")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketFlowable.mod.Flowable[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]]) => requestChannel(t0).runNow()))
    __obj.updateDynamic("requestResponse")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => requestResponse(t0).runNow()))
    __obj.updateDynamic("requestStream")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => requestStream(t0).runNow()))
    __obj.asInstanceOf[ReactiveSocket[D, M]]
  }
}

