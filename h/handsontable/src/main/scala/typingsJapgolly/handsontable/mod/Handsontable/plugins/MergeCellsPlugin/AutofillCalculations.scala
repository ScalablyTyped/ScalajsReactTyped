package typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCells
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutofillCalculations extends js.Object {
  var currentFillData: js.Object
  var mergedCellsCollection: MergedCellsCollection
  var plugin: MergeCells
  def correctSelectionAreaSize(selectionArea: js.Array[Double]): Unit
  def dragAreaOverlapsCollections(baseArea: js.Array[Double], fullArea: js.Array[Double], direction: String): Boolean
  def getDirection(selectionArea: js.Array[Double], finalArea: js.Array[Double]): String
  def recreateAfterDataPopulation(changes: js.Array[_]): Unit
  def snapDragArea(
    baseArea: js.Array[Double],
    dragArea: js.Array[Double],
    dragDirection: String,
    foundMergedCells: js.Array[MergedCellCoords]
  ): js.Array[Double]
}

object AutofillCalculations {
  @scala.inline
  def apply(
    correctSelectionAreaSize: js.Array[Double] => Callback,
    currentFillData: js.Object,
    dragAreaOverlapsCollections: (js.Array[Double], js.Array[Double], String) => CallbackTo[Boolean],
    getDirection: (js.Array[Double], js.Array[Double]) => CallbackTo[String],
    mergedCellsCollection: MergedCellsCollection,
    plugin: MergeCells,
    recreateAfterDataPopulation: js.Array[js.Any] => Callback,
    snapDragArea: (js.Array[Double], js.Array[Double], String, js.Array[MergedCellCoords]) => CallbackTo[js.Array[Double]]
  ): AutofillCalculations = {
    val __obj = js.Dynamic.literal(currentFillData = currentFillData.asInstanceOf[js.Any], mergedCellsCollection = mergedCellsCollection.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.updateDynamic("correctSelectionAreaSize")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => correctSelectionAreaSize(t0).runNow()))
    __obj.updateDynamic("dragAreaOverlapsCollections")(js.Any.fromFunction3((t0: js.Array[scala.Double], t1: js.Array[scala.Double], t2: java.lang.String) => dragAreaOverlapsCollections(t0, t1, t2).runNow()))
    __obj.updateDynamic("getDirection")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: js.Array[scala.Double]) => getDirection(t0, t1).runNow()))
    __obj.updateDynamic("recreateAfterDataPopulation")(js.Any.fromFunction1((t0: js.Array[js.Any]) => recreateAfterDataPopulation(t0).runNow()))
    __obj.updateDynamic("snapDragArea")(js.Any.fromFunction4((t0: js.Array[scala.Double], t1: js.Array[scala.Double], t2: java.lang.String, t3: js.Array[
  typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.MergedCellCoords]) => snapDragArea(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[AutofillCalculations]
  }
}

