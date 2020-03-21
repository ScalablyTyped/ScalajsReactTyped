package typingsJapgolly.reactCountup

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPauseResumeReset extends js.Object {
  def pauseResume(): Unit
  def reset(): Unit
  def start(): Unit
}

object AnonPauseResumeReset {
  @scala.inline
  def apply(pauseResume: Callback, reset: Callback, start: Callback): AnonPauseResumeReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pauseResume")(pauseResume.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[AnonPauseResumeReset]
  }
}

