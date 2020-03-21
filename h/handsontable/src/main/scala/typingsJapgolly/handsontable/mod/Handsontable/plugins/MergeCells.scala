package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.AutofillCalculations
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.MergedCellsCollection
import typingsJapgolly.handsontable.mod.Handsontable.plugins.MergeCellsPlugin.SelectionCalculations
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCells extends Base {
  var autofillCalculations: AutofillCalculations
  var mergedCellsCollection: MergedCellsCollection
  var selectionCalculations: SelectionCalculations
  def clearCollections(): Unit
  def merge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit
  def mergeSelection(cellRange: CellRange): Unit
  def unmerge(startRow: Double, startColumn: Double, endRow: Double, endColumn: Double): Unit
}

object MergeCells {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    autofillCalculations: AutofillCalculations,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearCollections: Callback,
    clearHooks: Callback,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    merge: (Double, Double, Double, Double) => Callback,
    mergeSelection: CellRange => Callback,
    mergedCellsCollection: MergedCellsCollection,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    selectionCalculations: SelectionCalculations,
    t: RecordTranslator,
    unmerge: (Double, Double, Double, Double) => Callback,
    updatePlugin: Callback
  ): MergeCells = {
    val __obj = js.Dynamic.literal(autofillCalculations = autofillCalculations.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], mergedCellsCollection = mergedCellsCollection.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], selectionCalculations = selectionCalculations.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearCollections")(clearCollections.toJsFn)
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("merge")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => merge(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("mergeSelection")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange) => mergeSelection(t0).runNow()))
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("unmerge")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => unmerge(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[MergeCells]
  }
}

