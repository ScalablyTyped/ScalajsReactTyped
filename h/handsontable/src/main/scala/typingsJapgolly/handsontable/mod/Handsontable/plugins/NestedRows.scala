package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedRows extends Base {
  var bindRowsWithHeadersPlugin: BindRowsWithHeaders | Unit
  var collapsingUI: js.Object | Unit
  var dataManager: DataManager | Unit
  var headersUI: js.Object | Unit
  var sourceData: js.Object | Unit
  var trimRowsPlugin: TrimRows | Unit
}

object NestedRows {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    bindRowsWithHeadersPlugin: BindRowsWithHeaders | Unit,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    collapsingUI: js.Object | Unit,
    dataManager: DataManager | Unit,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    headersUI: js.Object | Unit,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    sourceData: js.Object | Unit,
    t: RecordTranslator,
    trimRowsPlugin: TrimRows | Unit,
    updatePlugin: Callback
  ): NestedRows = {
    val __obj = js.Dynamic.literal(bindRowsWithHeadersPlugin = bindRowsWithHeadersPlugin.asInstanceOf[js.Any], collapsingUI = collapsingUI.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], headersUI = headersUI.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], sourceData = sourceData.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], trimRowsPlugin = trimRowsPlugin.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[NestedRows]
  }
}

