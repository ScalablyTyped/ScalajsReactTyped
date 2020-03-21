package typingsJapgolly.ydnDb

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPush extends js.Object {
  def push(value: js.Any): Unit
}

object AnonPush {
  @scala.inline
  def apply(push: js.Any => Callback): AnonPush = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: js.Any) => push(t0).runNow()))
    __obj.asInstanceOf[AnonPush]
  }
}

