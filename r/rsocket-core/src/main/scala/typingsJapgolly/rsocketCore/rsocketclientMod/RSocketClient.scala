package typingsJapgolly.rsocketCore.rsocketclientMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rsocketFlowable.mod.Single
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketClient[D, M] extends js.Object {
  def close(): Unit
  def connect(): Single[ReactiveSocket[D, M]]
}

object RSocketClient {
  @scala.inline
  def apply[D, M](close: Callback, connect: CallbackTo[Single[ReactiveSocket[D, M]]]): RSocketClient[D, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.asInstanceOf[RSocketClient[D, M]]
  }
}

