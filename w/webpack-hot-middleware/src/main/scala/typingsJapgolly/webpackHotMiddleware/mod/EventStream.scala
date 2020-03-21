package typingsJapgolly.webpackHotMiddleware.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStream extends js.Object {
  def publish(payload: js.Any): Unit
}

object EventStream {
  @scala.inline
  def apply(publish: js.Any => Callback): EventStream = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("publish")(js.Any.fromFunction1((t0: js.Any) => publish(t0).runNow()))
    __obj.asInstanceOf[EventStream]
  }
}

