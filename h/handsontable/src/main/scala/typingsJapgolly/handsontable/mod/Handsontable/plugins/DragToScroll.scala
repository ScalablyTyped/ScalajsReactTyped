package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragToScroll extends Base {
  var boundaries: js.Object | Unit
  var callback: js.Function0[Unit] | Unit
  def check(x: Double, y: Double): Unit
  def setBoundaries(boundaries: js.Object): Unit
  def setCallback(callback: js.Function0[Unit]): Unit
}

object DragToScroll {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    boundaries: js.Object | Unit,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    callback: js.Function0[Unit] | Unit,
    check: (Double, Double) => Callback,
    clearHooks: Callback,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    setBoundaries: js.Object => Callback,
    setCallback: js.Function0[Unit] => Callback,
    t: RecordTranslator,
    updatePlugin: Callback
  ): DragToScroll = {
    val __obj = js.Dynamic.literal(boundaries = boundaries.asInstanceOf[js.Any], callback = callback.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("check")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => check(t0, t1).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("setBoundaries")(js.Any.fromFunction1((t0: js.Object) => setBoundaries(t0).runNow()))
    __obj.updateDynamic("setCallback")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => setCallback(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[DragToScroll]
  }
}

