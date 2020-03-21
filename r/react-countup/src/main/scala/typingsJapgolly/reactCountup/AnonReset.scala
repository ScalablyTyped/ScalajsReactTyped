package typingsJapgolly.reactCountup

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReset extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def update(): Unit
}

object AnonReset {
  @scala.inline
  def apply(pauseResume: Callback, reset: Callback, update: Callback): AnonReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pauseResume")(pauseResume.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[AnonReset]
  }
}

