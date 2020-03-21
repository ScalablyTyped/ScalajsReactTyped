package typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergedCellCoords extends js.Object {
  var col: Double
  var colspan: Double
  var removed: Boolean
  var row: Double
  var rowspan: Double
  def getLastColumn(): Double
  def getLastRow(): Double
  def getRange(): CellRange
  def includes(row: Double, column: Double): Boolean
  def includesHorizontally(column: Double): Boolean
  def includesVertically(row: Double): Boolean
  def isFarther(mergedCell: MergedCellCoords, direction: String): Boolean | Unit
  def normalize(hotInstance: Core): Unit
  def shift(shiftVector: js.Array[Double], indexOfChange: Double): Boolean
}

object MergedCellCoords {
  @scala.inline
  def apply(
    col: Double,
    colspan: Double,
    getLastColumn: CallbackTo[Double],
    getLastRow: CallbackTo[Double],
    getRange: CallbackTo[CellRange],
    includes: (Double, Double) => CallbackTo[Boolean],
    includesHorizontally: Double => CallbackTo[Boolean],
    includesVertically: Double => CallbackTo[Boolean],
    isFarther: (MergedCellCoords, String) => CallbackTo[Boolean | Unit],
    normalize: Core => Callback,
    removed: Boolean,
    row: Double,
    rowspan: Double,
    shift: (js.Array[Double], Double) => CallbackTo[Boolean]
  ): MergedCellCoords = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], colspan = colspan.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowspan = rowspan.asInstanceOf[js.Any])
    __obj.updateDynamic("getLastColumn")(getLastColumn.toJsFn)
    __obj.updateDynamic("getLastRow")(getLastRow.toJsFn)
    __obj.updateDynamic("getRange")(getRange.toJsFn)
    __obj.updateDynamic("includes")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => includes(t0, t1).runNow()))
    __obj.updateDynamic("includesHorizontally")(js.Any.fromFunction1((t0: scala.Double) => includesHorizontally(t0).runNow()))
    __obj.updateDynamic("includesVertically")(js.Any.fromFunction1((t0: scala.Double) => includesVertically(t0).runNow()))
    __obj.updateDynamic("isFarther")(js.Any.fromFunction2((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.MergedCellCoords, t1: java.lang.String) => isFarther(t0, t1).runNow()))
    __obj.updateDynamic("normalize")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod._Handsontable.Core) => normalize(t0).runNow()))
    __obj.updateDynamic("shift")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => shift(t0, t1).runNow()))
    __obj.asInstanceOf[MergedCellCoords]
  }
}

