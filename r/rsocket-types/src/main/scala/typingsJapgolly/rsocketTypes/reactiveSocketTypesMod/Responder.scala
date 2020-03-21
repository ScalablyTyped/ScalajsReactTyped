package typingsJapgolly.rsocketTypes.reactiveSocketTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketFlowable.mod.Single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Responder[D, M] extends js.Object {
  /**
    * Fire and Forget interaction model of `ReactiveSocket`. The returned
    * Publisher resolves when the passed `payload` is successfully handled.
    */
  def fireAndForget(payload: Payload[D, M]): Unit
  /**
    * Metadata-Push interaction model of `ReactiveSocket`. The returned Publisher
    * resolves when the passed `payload` is successfully handled.
    */
  def metadataPush(payload: Payload[D, M]): Single[Unit]
  /**
    * Request-Channel interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestChannel(payloads: Flowable[Payload[D, M]]): Flowable[Payload[D, M]]
  /**
    * Request-Response interaction model of `ReactiveSocket`. The returned
    * Publisher resolves with the response.
    */
  def requestResponse(payload: Payload[D, M]): Single[Payload[D, M]]
  /**
    * Request-Stream interaction model of `ReactiveSocket`. The returned
    * Publisher returns values representing the response(s).
    */
  def requestStream(payload: Payload[D, M]): Flowable[Payload[D, M]]
}

object Responder {
  @scala.inline
  def apply[D, M](
    fireAndForget: Payload[D, M] => Callback,
    metadataPush: Payload[D, M] => CallbackTo[Single[Unit]],
    requestChannel: Flowable[Payload[D, M]] => CallbackTo[Flowable[Payload[D, M]]],
    requestResponse: Payload[D, M] => CallbackTo[Single[Payload[D, M]]],
    requestStream: Payload[D, M] => CallbackTo[Flowable[Payload[D, M]]]
  ): Responder[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fireAndForget")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => fireAndForget(t0).runNow()))
    __obj.updateDynamic("metadataPush")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => metadataPush(t0).runNow()))
    __obj.updateDynamic("requestChannel")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketFlowable.mod.Flowable[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]]) => requestChannel(t0).runNow()))
    __obj.updateDynamic("requestResponse")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => requestResponse(t0).runNow()))
    __obj.updateDynamic("requestStream")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload[D, M]) => requestStream(t0).runNow()))
    __obj.asInstanceOf[Responder[D, M]]
  }
}

