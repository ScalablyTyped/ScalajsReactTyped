package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autofill extends Base {
  var addingStarted: Boolean
  var autoInsertRow: Boolean
  var directions: js.Array[String]
  var eventManager: EventManager
  var handleDraggedCells: Double
  var mouseDownOnCellCorner: Boolean
  var mouseDragOutside: Boolean
}

object Autofill {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    addingStarted: Boolean,
    autoInsertRow: Boolean,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    destroy: Callback,
    directions: js.Array[String],
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    handleDraggedCells: Double,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    mouseDownOnCellCorner: Boolean,
    mouseDragOutside: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    t: RecordTranslator,
    updatePlugin: Callback
  ): Autofill = {
    val __obj = js.Dynamic.literal(addingStarted = addingStarted.asInstanceOf[js.Any], autoInsertRow = autoInsertRow.asInstanceOf[js.Any], directions = directions.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], handleDraggedCells = handleDraggedCells.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], mouseDownOnCellCorner = mouseDownOnCellCorner.asInstanceOf[js.Any], mouseDragOutside = mouseDragOutside.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[Autofill]
  }
}

