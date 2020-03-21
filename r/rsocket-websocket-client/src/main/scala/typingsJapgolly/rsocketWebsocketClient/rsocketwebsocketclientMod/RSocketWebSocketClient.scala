package typingsJapgolly.rsocketWebsocketClient.rsocketwebsocketclientMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketFlowable.mod.Flowable
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ConnectionStatus
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketWebSocketClient extends DuplexConnection

object RSocketWebSocketClient {
  @scala.inline
  def apply(
    close: Callback,
    connect: Callback,
    connectionStatus: CallbackTo[Flowable[ConnectionStatus]],
    receive: CallbackTo[Flowable[Frame]],
    send: Flowable[Frame] => Callback,
    sendOne: Frame => Callback
  ): RSocketWebSocketClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.updateDynamic("connectionStatus")(connectionStatus.toJsFn)
    __obj.updateDynamic("receive")(receive.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketFlowable.mod.Flowable[typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame]) => send(t0).runNow()))
    __obj.updateDynamic("sendOne")(js.Any.fromFunction1((t0: typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame) => sendOne(t0).runNow()))
    __obj.asInstanceOf[RSocketWebSocketClient]
  }
}

