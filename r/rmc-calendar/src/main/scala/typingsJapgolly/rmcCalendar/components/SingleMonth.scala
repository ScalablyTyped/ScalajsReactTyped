package typingsJapgolly.rmcCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.CellData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.MonthData
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import typingsJapgolly.rmcCalendar.singleMonthMod.PropsType
import typingsJapgolly.rmcCalendar.singleMonthMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SingleMonth {
  def apply(
    locale: Locale,
    monthData: MonthData,
    getDateExtra: /* date */ js.Date => CallbackTo[ExtraData] = null,
    onCellClick: (/* data */ CellData, /* monthData */ MonthData) => Callback = null,
    rowSize: normal | xl = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PropsType, default, Unit, PropsType] = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
  
      if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateExtra(t0).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.rmcCalendar.dataTypesMod.Models.CellData, t1: /* monthData */ typingsJapgolly.rmcCalendar.dataTypesMod.Models.MonthData) => onCellClick(t0, t1).runNow()))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcCalendar.singleMonthMod.PropsType, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcCalendar.singleMonthMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCalendar.singleMonthMod.PropsType])(children: _*)
  }
  @JSImport("rmc-calendar/lib/date/SingleMonth", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

