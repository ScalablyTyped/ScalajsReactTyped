package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSummary extends Base {
  var endpoints: Endpoints | Unit
  def calculate(endpoint: Endpoints): Unit
  def calculateAverage(endpoint: Endpoints): Double
  def calculateMinMax(endpoint: Endpoints, `type`: String): Double
  def calculateSum(endpoint: Endpoints): Unit
  def countEmpty(rowRange: js.Array[_], col: Double): Double
  def countEntries(endpoint: Endpoints): Double
  def getCellValue(row: Double, col: Double): String
  def getPartialMinMax(rowRange: js.Array[_], col: Double, `type`: String): Double
  def getPartialSum(rowRange: js.Array[_], col: Double): Double
}

object ColumnSummary {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    calculate: Endpoints => Callback,
    calculateAverage: Endpoints => CallbackTo[Double],
    calculateMinMax: (Endpoints, String) => CallbackTo[Double],
    calculateSum: Endpoints => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    countEmpty: (js.Array[js.Any], Double) => CallbackTo[Double],
    countEntries: Endpoints => CallbackTo[Double],
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    endpoints: Endpoints | Unit,
    getCellValue: (Double, Double) => CallbackTo[String],
    getPartialMinMax: (js.Array[js.Any], Double, String) => CallbackTo[Double],
    getPartialSum: (js.Array[js.Any], Double) => CallbackTo[Double],
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    t: RecordTranslator,
    updatePlugin: Callback
  ): ColumnSummary = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("calculate")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoints) => calculate(t0).runNow()))
    __obj.updateDynamic("calculateAverage")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoints) => calculateAverage(t0).runNow()))
    __obj.updateDynamic("calculateMinMax")(js.Any.fromFunction2((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoints, t1: java.lang.String) => calculateMinMax(t0, t1).runNow()))
    __obj.updateDynamic("calculateSum")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoints) => calculateSum(t0).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("countEmpty")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: scala.Double) => countEmpty(t0, t1).runNow()))
    __obj.updateDynamic("countEntries")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.Endpoints) => countEntries(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("getCellValue")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getCellValue(t0, t1).runNow()))
    __obj.updateDynamic("getPartialMinMax")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: scala.Double, t2: java.lang.String) => getPartialMinMax(t0, t1, t2).runNow()))
    __obj.updateDynamic("getPartialSum")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: scala.Double) => getPartialSum(t0, t1).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[ColumnSummary]
  }
}

