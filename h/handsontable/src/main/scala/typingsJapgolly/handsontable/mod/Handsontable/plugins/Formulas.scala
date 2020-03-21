package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formulas extends Base {
  var dataProvider: DataProvider
  var eventManager: EventManager
  var sheet: Sheet
  var undoRedoSnapshot: UndoRedoSnapshot
  def getCellValue(row: Double, column: Double): js.Any
  def getVariable(name: String): js.Any
  def hasComputedCellValue(row: Double, column: Double): Boolean
  def recalculate(): Unit
  def recalculateFull(): Unit
  def recalculateOptimized(): Unit
  def setVariable(name: String, value: js.Any): Unit
}

object Formulas {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    dataProvider: DataProvider,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    getCellValue: (Double, Double) => CallbackTo[js.Any],
    getVariable: String => CallbackTo[js.Any],
    hasComputedCellValue: (Double, Double) => CallbackTo[Boolean],
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    recalculate: Callback,
    recalculateFull: Callback,
    recalculateOptimized: Callback,
    removeHooks: String => Callback,
    setVariable: (String, js.Any) => Callback,
    sheet: Sheet,
    t: RecordTranslator,
    undoRedoSnapshot: UndoRedoSnapshot,
    updatePlugin: Callback
  ): Formulas = {
    val __obj = js.Dynamic.literal(dataProvider = dataProvider.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], sheet = sheet.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], undoRedoSnapshot = undoRedoSnapshot.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("getCellValue")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getCellValue(t0, t1).runNow()))
    __obj.updateDynamic("getVariable")(js.Any.fromFunction1((t0: java.lang.String) => getVariable(t0).runNow()))
    __obj.updateDynamic("hasComputedCellValue")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => hasComputedCellValue(t0, t1).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("recalculate")(recalculate.toJsFn)
    __obj.updateDynamic("recalculateFull")(recalculateFull.toJsFn)
    __obj.updateDynamic("recalculateOptimized")(recalculateOptimized.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("setVariable")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setVariable(t0, t1).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[Formulas]
  }
}

