package typingsJapgolly.reactBigScheduler.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerProps extends js.Object {
  var schedulerData: SchedulerData
  def nextClick(schedulerData: SchedulerData): Unit
  def onSelectDate(schedulerData: SchedulerData, date: String): Unit
  def onViewChange(schedulerData: SchedulerData, view: View): Unit
  def prevClick(schedulerData: SchedulerData): Unit
}

object SchedulerProps {
  @scala.inline
  def apply(
    nextClick: SchedulerData => Callback,
    onSelectDate: (SchedulerData, String) => Callback,
    onViewChange: (SchedulerData, View) => Callback,
    prevClick: SchedulerData => Callback,
    schedulerData: SchedulerData
  ): SchedulerProps = {
    val __obj = js.Dynamic.literal(schedulerData = schedulerData.asInstanceOf[js.Any])
    __obj.updateDynamic("nextClick")(js.Any.fromFunction1((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData) => nextClick(t0).runNow()))
    __obj.updateDynamic("onSelectDate")(js.Any.fromFunction2((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData, t1: java.lang.String) => onSelectDate(t0, t1).runNow()))
    __obj.updateDynamic("onViewChange")(js.Any.fromFunction2((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData, t1: typingsJapgolly.reactBigScheduler.mod.View) => onViewChange(t0, t1).runNow()))
    __obj.updateDynamic("prevClick")(js.Any.fromFunction1((t0: typingsJapgolly.reactBigScheduler.mod.SchedulerData) => prevClick(t0).runNow()))
    __obj.asInstanceOf[SchedulerProps]
  }
}

