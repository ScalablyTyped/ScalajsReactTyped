package typingsJapgolly.meteor

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStop extends js.Object {
  def stop(): Unit
}

object AnonStop {
  @scala.inline
  def apply(stop: Callback): AnonStop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[AnonStop]
  }
}

