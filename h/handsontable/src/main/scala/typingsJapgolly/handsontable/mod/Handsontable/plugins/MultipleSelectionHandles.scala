package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords
import typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleSelectionHandles extends Base {
  var dragged: js.Array[_]
  var eventManager: EventManager
  var lastSetCell: HTMLElement | Unit
  def getCurrentRangeCoords(
    selectedRange: CellRange,
    currentTouch: CellCoords,
    touchStartDirection: String,
    currentDirection: String,
    draggedHandle: String
  ): js.Object
  def isDragged(): Boolean
}

object MultipleSelectionHandles {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    destroy: Callback,
    disablePlugin: Callback,
    dragged: js.Array[_],
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    getCurrentRangeCoords: (CellRange, CellCoords, String, String, String) => CallbackTo[js.Object],
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isDragged: CallbackTo[Boolean],
    isPluginsReady: Boolean,
    lastSetCell: HTMLElement | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    t: RecordTranslator,
    updatePlugin: Callback
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(dragged = dragged.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("getCurrentRangeCoords")(js.Any.fromFunction5((t0: typingsJapgolly.handsontable.mod.Handsontable.wot.CellRange, t1: typingsJapgolly.handsontable.mod.Handsontable.wot.CellCoords, t2: java.lang.String, t3: java.lang.String, t4: java.lang.String) => getCurrentRangeCoords(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("isDragged")(isDragged.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
}

