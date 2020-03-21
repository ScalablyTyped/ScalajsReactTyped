package typingsJapgolly.rmcCalendar.singleMonthMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.CellData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.ExtraData
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.Locale
import typingsJapgolly.rmcCalendar.dataTypesMod.Models.MonthData
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.normal
import typingsJapgolly.rmcCalendar.rmcCalendarStrings.xl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var getDateExtra: js.UndefOr[js.Function1[/* date */ js.Date, ExtraData]] = js.undefined
  var locale: Locale
  var monthData: MonthData
  var onCellClick: js.UndefOr[js.Function2[/* data */ CellData, /* monthData */ MonthData, Unit]] = js.undefined
  var rowSize: js.UndefOr[normal | xl] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    locale: Locale,
    monthData: MonthData,
    getDateExtra: /* date */ js.Date => CallbackTo[ExtraData] = null,
    onCellClick: (/* data */ CellData, /* monthData */ MonthData) => Callback = null,
    rowSize: normal | xl = null
  ): PropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], monthData = monthData.asInstanceOf[js.Any])
    if (getDateExtra != null) __obj.updateDynamic("getDateExtra")(js.Any.fromFunction1((t0: /* date */ js.Date) => getDateExtra(t0).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.rmcCalendar.dataTypesMod.Models.CellData, t1: /* monthData */ typingsJapgolly.rmcCalendar.dataTypesMod.Models.MonthData) => onCellClick(t0, t1).runNow()))
    if (rowSize != null) __obj.updateDynamic("rowSize")(rowSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

