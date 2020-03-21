package typingsJapgolly.fullcalendar.dayTableMixinMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DayTableInterface extends js.Object {
  var colCnt: js.Any
  var dayDates: js.Any
  var daysPerRow: js.Any
  var rowCnt: js.Any
  def bookendCells(trEl: js.Any): js.Any
  def getCellDate(row: js.Any, col: js.Any): js.Any
  def getCellRange(row: js.Any, col: js.Any): js.Any
  def renderBgTrHtml(row: js.Any): js.Any
  def renderHeadHtml(): js.Any
  def renderIntroHtml(): js.Any
  def sliceRangeByDay(unzonedRange: js.Any): js.Any
  def sliceRangeByRow(unzonedRange: js.Any): js.Any
  def updateDayTable(): js.Any
}

object DayTableInterface {
  @scala.inline
  def apply(
    bookendCells: js.Any => CallbackTo[js.Any],
    colCnt: js.Any,
    dayDates: js.Any,
    daysPerRow: js.Any,
    getCellDate: (js.Any, js.Any) => CallbackTo[js.Any],
    getCellRange: (js.Any, js.Any) => CallbackTo[js.Any],
    renderBgTrHtml: js.Any => CallbackTo[js.Any],
    renderHeadHtml: CallbackTo[js.Any],
    renderIntroHtml: CallbackTo[js.Any],
    rowCnt: js.Any,
    sliceRangeByDay: js.Any => CallbackTo[js.Any],
    sliceRangeByRow: js.Any => CallbackTo[js.Any],
    updateDayTable: CallbackTo[js.Any]
  ): DayTableInterface = {
    val __obj = js.Dynamic.literal(colCnt = colCnt.asInstanceOf[js.Any], dayDates = dayDates.asInstanceOf[js.Any], daysPerRow = daysPerRow.asInstanceOf[js.Any], rowCnt = rowCnt.asInstanceOf[js.Any])
    __obj.updateDynamic("bookendCells")(js.Any.fromFunction1((t0: js.Any) => bookendCells(t0).runNow()))
    __obj.updateDynamic("getCellDate")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getCellDate(t0, t1).runNow()))
    __obj.updateDynamic("getCellRange")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => getCellRange(t0, t1).runNow()))
    __obj.updateDynamic("renderBgTrHtml")(js.Any.fromFunction1((t0: js.Any) => renderBgTrHtml(t0).runNow()))
    __obj.updateDynamic("renderHeadHtml")(renderHeadHtml.toJsFn)
    __obj.updateDynamic("renderIntroHtml")(renderIntroHtml.toJsFn)
    __obj.updateDynamic("sliceRangeByDay")(js.Any.fromFunction1((t0: js.Any) => sliceRangeByDay(t0).runNow()))
    __obj.updateDynamic("sliceRangeByRow")(js.Any.fromFunction1((t0: js.Any) => sliceRangeByRow(t0).runNow()))
    __obj.updateDynamic("updateDayTable")(updateDayTable.toJsFn)
    __obj.asInstanceOf[DayTableInterface]
  }
}

