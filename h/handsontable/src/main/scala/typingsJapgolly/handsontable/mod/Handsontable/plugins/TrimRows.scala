package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrimRows extends Base {
  var removedRows: js.Array[_]
  var rowsMapper: TrimRowsMapper
  var trimmedRows: js.Array[_]
  def isTrimmed(row: Double): Boolean
  def trimRow(row: Double): Unit
  def trimRows(rows: js.Array[Double]): Unit
  def untrimAll(): Unit
  def untrimRow(row: Double): Unit
  def untrimRows(rows: js.Array[Double]): Unit
}

object TrimRows {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    isTrimmed: Double => CallbackTo[Boolean],
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    removedRows: js.Array[_],
    rowsMapper: TrimRowsMapper,
    t: RecordTranslator,
    trimRow: Double => Callback,
    trimRows: js.Array[Double] => Callback,
    trimmedRows: js.Array[_],
    untrimAll: Callback,
    untrimRow: Double => Callback,
    untrimRows: js.Array[Double] => Callback,
    updatePlugin: Callback
  ): TrimRows = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removedRows = removedRows.asInstanceOf[js.Any], rowsMapper = rowsMapper.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], trimmedRows = trimmedRows.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("isTrimmed")(js.Any.fromFunction1((t0: scala.Double) => isTrimmed(t0).runNow()))
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("trimRow")(js.Any.fromFunction1((t0: scala.Double) => trimRow(t0).runNow()))
    __obj.updateDynamic("trimRows")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => trimRows(t0).runNow()))
    __obj.updateDynamic("untrimAll")(untrimAll.toJsFn)
    __obj.updateDynamic("untrimRow")(js.Any.fromFunction1((t0: scala.Double) => untrimRow(t0).runNow()))
    __obj.updateDynamic("untrimRows")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => untrimRows(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[TrimRows]
  }
}

