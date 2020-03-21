package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Video
// Non-entity
trait ExtensionSchedule extends js.Object {
  def getDayOfWeek(): DayOfWeekString
  def getEndHour(): Double
  def getEndMinute(): Double
  def getStartHour(): Double
  def getStartMinute(): Double
}

object ExtensionSchedule {
  @scala.inline
  def apply(
    getDayOfWeek: CallbackTo[DayOfWeekString],
    getEndHour: CallbackTo[Double],
    getEndMinute: CallbackTo[Double],
    getStartHour: CallbackTo[Double],
    getStartMinute: CallbackTo[Double]
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDayOfWeek")(getDayOfWeek.toJsFn)
    __obj.updateDynamic("getEndHour")(getEndHour.toJsFn)
    __obj.updateDynamic("getEndMinute")(getEndMinute.toJsFn)
    __obj.updateDynamic("getStartHour")(getStartHour.toJsFn)
    __obj.updateDynamic("getStartMinute")(getStartMinute.toJsFn)
    __obj.asInstanceOf[ExtensionSchedule]
  }
}

