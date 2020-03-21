package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod.Handsontable.plugins.moveUI.BacklightUI
import typingsJapgolly.handsontable.mod.Handsontable.plugins.moveUI.GuidelineUI
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnMove extends Base {
  var backlight: BacklightUI
  var columnsMapper: MoveColumnsMapper
  var eventManager: EventManager
  var guideline: GuidelineUI
  var removedColumns: js.Array[_]
  def moveColumn(column: Double, target: Double): Unit
  def moveColumns(columns: js.Array[Double], target: Double): Unit
  def persistentStateLoad(): Unit
  def persistentStateSave(): Unit
}

object ManualColumnMove {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    backlight: BacklightUI,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    columnsMapper: MoveColumnsMapper,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    guideline: GuidelineUI,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    moveColumn: (Double, Double) => Callback,
    moveColumns: (js.Array[Double], Double) => Callback,
    persistentStateLoad: Callback,
    persistentStateSave: Callback,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    removedColumns: js.Array[_],
    t: RecordTranslator,
    updatePlugin: Callback
  ): ManualColumnMove = {
    val __obj = js.Dynamic.literal(backlight = backlight.asInstanceOf[js.Any], columnsMapper = columnsMapper.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guideline = guideline.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removedColumns = removedColumns.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("moveColumn")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => moveColumn(t0, t1).runNow()))
    __obj.updateDynamic("moveColumns")(js.Any.fromFunction2((t0: js.Array[scala.Double], t1: scala.Double) => moveColumns(t0, t1).runNow()))
    __obj.updateDynamic("persistentStateLoad")(persistentStateLoad.toJsFn)
    __obj.updateDynamic("persistentStateSave")(persistentStateSave.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[ManualColumnMove]
  }
}

