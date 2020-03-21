package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait hasSchedules extends js.Object {
  def getSchedules(): ExtensionSchedule
  def setSchedules(schedules: ExtensionScheduleInput): Unit
}

object hasSchedules {
  @scala.inline
  def apply(getSchedules: CallbackTo[ExtensionSchedule], setSchedules: ExtensionScheduleInput => Callback): hasSchedules = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSchedules")(getSchedules.toJsFn)
    __obj.updateDynamic("setSchedules")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.ExtensionScheduleInput) => setSchedules(t0).runNow()))
    __obj.asInstanceOf[hasSchedules]
  }
}

