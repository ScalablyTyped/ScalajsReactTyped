package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestedHeaders extends Base {
  var colspanArray: js.Array[_]
  var columnHeaderLevelCount: Double
  var ghostTable: GhostTableNestedHeaders
  var settings: js.Array[_]
  def checkForFixedColumnsCollision(): Unit
  def checkForOverlappingHeaders(): Unit
  def fillColspanArrayWithDummies(colspan: Double, level: Double): Unit
  def fillTheRemainingColspans(): Unit
  def getChildHeaders(row: Double, column: Double): js.Array[_]
  def getColspan(row: Double, column: Double): Double
  def getNestedParent(level: Double, column: Double): js.Any
  def headerRendererFactory(headerRow: Double): js.Function0[Unit]
  def levelToRowCoords(level: Double): Double
  def rowCoordsToLevel(row: Double): Double
  def setupColspanArray(): Unit
}

object NestedHeaders {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    checkForFixedColumnsCollision: Callback,
    checkForOverlappingHeaders: Callback,
    clearHooks: Callback,
    colspanArray: js.Array[_],
    columnHeaderLevelCount: Double,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    fillColspanArrayWithDummies: (Double, Double) => Callback,
    fillTheRemainingColspans: Callback,
    getChildHeaders: (Double, Double) => CallbackTo[js.Array[js.Any]],
    getColspan: (Double, Double) => CallbackTo[Double],
    getNestedParent: (Double, Double) => CallbackTo[js.Any],
    ghostTable: GhostTableNestedHeaders,
    headerRendererFactory: Double => CallbackTo[js.Function0[Unit]],
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    levelToRowCoords: Double => CallbackTo[Double],
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    rowCoordsToLevel: Double => CallbackTo[Double],
    settings: js.Array[_],
    setupColspanArray: Callback,
    t: RecordTranslator,
    updatePlugin: Callback
  ): NestedHeaders = {
    val __obj = js.Dynamic.literal(colspanArray = colspanArray.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], ghostTable = ghostTable.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("checkForFixedColumnsCollision")(checkForFixedColumnsCollision.toJsFn)
    __obj.updateDynamic("checkForOverlappingHeaders")(checkForOverlappingHeaders.toJsFn)
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("fillColspanArrayWithDummies")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => fillColspanArrayWithDummies(t0, t1).runNow()))
    __obj.updateDynamic("fillTheRemainingColspans")(fillTheRemainingColspans.toJsFn)
    __obj.updateDynamic("getChildHeaders")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getChildHeaders(t0, t1).runNow()))
    __obj.updateDynamic("getColspan")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getColspan(t0, t1).runNow()))
    __obj.updateDynamic("getNestedParent")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => getNestedParent(t0, t1).runNow()))
    __obj.updateDynamic("headerRendererFactory")(js.Any.fromFunction1((t0: scala.Double) => headerRendererFactory(t0).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("levelToRowCoords")(js.Any.fromFunction1((t0: scala.Double) => levelToRowCoords(t0).runNow()))
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("rowCoordsToLevel")(js.Any.fromFunction1((t0: scala.Double) => rowCoordsToLevel(t0).runNow()))
    __obj.updateDynamic("setupColspanArray")(setupColspanArray.toJsFn)
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[NestedHeaders]
  }
}

