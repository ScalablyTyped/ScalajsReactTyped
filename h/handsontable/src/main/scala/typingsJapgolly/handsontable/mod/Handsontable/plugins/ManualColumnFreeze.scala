package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnFreeze extends Base {
  var frozenColumnsBasePositions: js.Array[_]
  var manualColumnMovePlugin: ManualColumnMove
  def freezeColumn(column: Double): Unit
  def unfreezeColumn(column: Double): Unit
}

object ManualColumnFreeze {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    freezeColumn: Double => Callback,
    frozenColumnsBasePositions: js.Array[_],
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    manualColumnMovePlugin: ManualColumnMove,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    t: RecordTranslator,
    unfreezeColumn: Double => Callback,
    updatePlugin: Callback
  ): ManualColumnFreeze = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], frozenColumnsBasePositions = frozenColumnsBasePositions.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], manualColumnMovePlugin = manualColumnMovePlugin.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("freezeColumn")(js.Any.fromFunction1((t0: scala.Double) => freezeColumn(t0).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("unfreezeColumn")(js.Any.fromFunction1((t0: scala.Double) => unfreezeColumn(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[ManualColumnFreeze]
  }
}

