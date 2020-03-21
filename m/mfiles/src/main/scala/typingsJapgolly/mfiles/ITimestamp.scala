package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimestamp extends js.Object {
  var Day: Double
  var Fraction: Double
  var Hour: Double
  var Minute: Double
  var Month: Double
  var Second: Double
  var Year: Double
  def Clone(): ITimestamp
  def GetValue(): js.Any
  def LocalTimeToUtc(): ITimestamp
  def SetValue(Value: js.Any): Unit
  def UtcToLocalTime(): ITimestamp
}

object ITimestamp {
  @scala.inline
  def apply(
    Clone: CallbackTo[ITimestamp],
    Day: Double,
    Fraction: Double,
    GetValue: CallbackTo[js.Any],
    Hour: Double,
    LocalTimeToUtc: CallbackTo[ITimestamp],
    Minute: Double,
    Month: Double,
    Second: Double,
    SetValue: js.Any => Callback,
    UtcToLocalTime: CallbackTo[ITimestamp],
    Year: Double
  ): ITimestamp = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Fraction = Fraction.asInstanceOf[js.Any], Hour = Hour.asInstanceOf[js.Any], Minute = Minute.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.updateDynamic("GetValue")(GetValue.toJsFn)
    __obj.updateDynamic("LocalTimeToUtc")(LocalTimeToUtc.toJsFn)
    __obj.updateDynamic("SetValue")(js.Any.fromFunction1((t0: js.Any) => SetValue(t0).runNow()))
    __obj.updateDynamic("UtcToLocalTime")(UtcToLocalTime.toJsFn)
    __obj.asInstanceOf[ITimestamp]
  }
}

