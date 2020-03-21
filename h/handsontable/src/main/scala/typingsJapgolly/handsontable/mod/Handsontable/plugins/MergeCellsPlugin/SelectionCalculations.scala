package typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionCalculations extends js.Object {
  def getUpdatedSelectionRange(oldSelectionRange: CellRange, delta: js.Object): CellRange
  def snapDelta(delta: js.Object, selectionRange: CellRange, mergedCell: MergedCellCoords): Unit
}

object SelectionCalculations {
  @scala.inline
  def apply(
    getUpdatedSelectionRange: (CellRange, js.Object) => CallbackTo[CellRange],
    snapDelta: (js.Object, CellRange, MergedCellCoords) => Callback
  ): SelectionCalculations = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getUpdatedSelectionRange")(js.Any.fromFunction2((t0: typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t1: js.Object) => getUpdatedSelectionRange(t0, t1).runNow()))
    __obj.updateDynamic("snapDelta")(js.Any.fromFunction3((t0: js.Object, t1: typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t2: typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.MergedCellCoords) => snapDelta(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SelectionCalculations]
  }
}

