package typingsJapgolly.reactCountup

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUpdate extends js.Object {
  def pauseResume(): Unit
  def start(): Unit
  def update(): Unit
}

object AnonUpdate {
  @scala.inline
  def apply(pauseResume: Callback, start: Callback, update: Callback): AnonUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pauseResume")(pauseResume.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[AnonUpdate]
  }
}

