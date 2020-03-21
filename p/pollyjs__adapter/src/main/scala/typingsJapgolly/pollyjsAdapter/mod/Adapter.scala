package typingsJapgolly.pollyjsAdapter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.pollyjsAdapter.AnonBody
import typingsJapgolly.pollyjsCore.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adapter extends js.Object {
  def connect(): Unit
  def disconnect(): Unit
  def passthroughRequest(pollyRequest: Request): js.Promise[AnonBody]
}

object Adapter {
  @scala.inline
  def apply(
    connect: Callback,
    disconnect: Callback,
    passthroughRequest: Request => CallbackTo[js.Promise[AnonBody]]
  ): Adapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connect")(connect.toJsFn)
    __obj.updateDynamic("disconnect")(disconnect.toJsFn)
    __obj.updateDynamic("passthroughRequest")(js.Any.fromFunction1((t0: typingsJapgolly.pollyjsCore.mod.Request) => passthroughRequest(t0).runNow()))
    __obj.asInstanceOf[Adapter]
  }
}

