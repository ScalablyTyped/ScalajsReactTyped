package typingsJapgolly.handsontable.mod.Handsontable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.handsontableStrings.all
import typingsJapgolly.handsontable.handsontableStrings.last
import typingsJapgolly.handsontable.handsontableStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewportColumnsCalculator extends js.Object {
  var count: Double
  var endColumn: Double | Null
  var endRow: js.UndefOr[Double] = js.undefined
  var needVerifyLastColumnWidth: Boolean
  var startColumn: Double | Null
  var startPosition: Double
  var startRow: js.UndefOr[Double] = js.undefined
  var stretch: none | all | last
  var stretchAllColumnsWidth: js.Array[Double]
  var stretchAllRatio: Double
  var stretchLastWidth: Double
  var totalTargetWidth: Double
  def calculate(): Unit
  def getStretchedColumnWidth(column: Double, baseWidth: Double): Double | Null
  def refreshStretching(totalWidth: Double): Unit
}

object ViewportColumnsCalculator {
  @scala.inline
  def apply(
    calculate: Callback,
    count: Double,
    getStretchedColumnWidth: (Double, Double) => CallbackTo[Double | Null],
    needVerifyLastColumnWidth: Boolean,
    refreshStretching: Double => Callback,
    startPosition: Double,
    stretch: none | all | last,
    stretchAllColumnsWidth: js.Array[Double],
    stretchAllRatio: Double,
    stretchLastWidth: Double,
    totalTargetWidth: Double,
    endColumn: Int | Double = null,
    endRow: Int | Double = null,
    startColumn: Int | Double = null,
    startRow: Int | Double = null
  ): ViewportColumnsCalculator = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], needVerifyLastColumnWidth = needVerifyLastColumnWidth.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], stretch = stretch.asInstanceOf[js.Any], stretchAllColumnsWidth = stretchAllColumnsWidth.asInstanceOf[js.Any], stretchAllRatio = stretchAllRatio.asInstanceOf[js.Any], stretchLastWidth = stretchLastWidth.asInstanceOf[js.Any], totalTargetWidth = totalTargetWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("calculate")(calculate.toJsFn)
    __obj.updateDynamic("getStretchedColumnWidth")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getStretchedColumnWidth(t0, t1).runNow()))
    __obj.updateDynamic("refreshStretching")(js.Any.fromFunction1((t0: scala.Double) => refreshStretching(t0).runNow()))
    if (endColumn != null) __obj.updateDynamic("endColumn")(endColumn.asInstanceOf[js.Any])
    if (endRow != null) __obj.updateDynamic("endRow")(endRow.asInstanceOf[js.Any])
    if (startColumn != null) __obj.updateDynamic("startColumn")(startColumn.asInstanceOf[js.Any])
    if (startRow != null) __obj.updateDynamic("startRow")(startRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewportColumnsCalculator]
  }
}

