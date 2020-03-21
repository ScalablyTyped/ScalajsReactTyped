package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITriggerType extends js.Object {
  val Daily: IDailyTrigger
  val MonthlyDOW: IMonthlyDOWTrigger
  val MonthlyDate: IMonthlyDateTrigger
  var Type: MFTriggerType
  val Weekly: IWeeklyTrigger
  def Clone(): ITriggerType
  def SetDailyTrigger(DailyTrigger: IDailyTrigger): Unit
  def SetMonthlyDOW(MonthlyDOWTrigger: IMonthlyDOWTrigger): Unit
  def SetMonthlyDate(MonthlyDateTrigger: IMonthlyDateTrigger): Unit
  def SetWeekly(WeeklyTrigger: IWeeklyTrigger): Unit
}

object ITriggerType {
  @scala.inline
  def apply(
    Clone: CallbackTo[ITriggerType],
    Daily: IDailyTrigger,
    MonthlyDOW: IMonthlyDOWTrigger,
    MonthlyDate: IMonthlyDateTrigger,
    SetDailyTrigger: IDailyTrigger => Callback,
    SetMonthlyDOW: IMonthlyDOWTrigger => Callback,
    SetMonthlyDate: IMonthlyDateTrigger => Callback,
    SetWeekly: IWeeklyTrigger => Callback,
    Type: MFTriggerType,
    Weekly: IWeeklyTrigger
  ): ITriggerType = {
    val __obj = js.Dynamic.literal(Daily = Daily.asInstanceOf[js.Any], MonthlyDOW = MonthlyDOW.asInstanceOf[js.Any], MonthlyDate = MonthlyDate.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Weekly = Weekly.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("SetDailyTrigger")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IDailyTrigger) => SetDailyTrigger(t0).runNow()))
    __obj.updateDynamic("SetMonthlyDOW")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IMonthlyDOWTrigger) => SetMonthlyDOW(t0).runNow()))
    __obj.updateDynamic("SetMonthlyDate")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IMonthlyDateTrigger) => SetMonthlyDate(t0).runNow()))
    __obj.updateDynamic("SetWeekly")(js.Any.fromFunction1((t0: typingsJapgolly.mfiles.IWeeklyTrigger) => SetWeekly(t0).runNow()))
    __obj.asInstanceOf[ITriggerType]
  }
}

