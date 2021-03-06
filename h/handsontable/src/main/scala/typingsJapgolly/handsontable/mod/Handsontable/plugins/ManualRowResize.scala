package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRowResize extends Base {
  var autoresizeTimeout: js.Function0[Unit] | Unit
  var currentRow: Double | Unit
  var currentTH: HTMLElement | Unit
  var currentWidth: Double | Unit
  var dblclick: Double
  var eventManager: EventManager
  var guide: HTMLElement
  var handle: HTMLElement
  var manualRowHeights: js.Array[_]
  var newSize: Double | Unit
  var pressed: Core | Unit
  var selectedRows: js.Array[_]
  var startOffset: Double | Unit
  var startWidth: Double | Unit
  var startY: Double | Unit
  def checkIfRowHeader(element: HTMLElement): Boolean
  def clearManualSize(column: Double): Unit
  def getTHFromTargetElement(element: HTMLElement): HTMLElement
  def hideHandleAndGuide(): Unit
  def loadManualRowHeights(): Unit
  def refreshGuidePosition(): Unit
  def refreshHandlePosition(): Unit
  def saveManualRowHeights(): Unit
  def setManualSize(column: Double, width: Double): Double
  def setupGuidePosition(): Unit
  def setupHandlePosition(TH: HTMLElement): Boolean | Unit
}

object ManualRowResize {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    autoresizeTimeout: js.Function0[Unit] | Unit,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    checkIfRowHeader: HTMLElement => CallbackTo[Boolean],
    clearHooks: Callback,
    clearManualSize: Double => Callback,
    currentRow: Double | Unit,
    currentTH: HTMLElement | Unit,
    currentWidth: Double | Unit,
    dblclick: Double,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    getTHFromTargetElement: HTMLElement => CallbackTo[HTMLElement],
    guide: HTMLElement,
    handle: HTMLElement,
    hideHandleAndGuide: Callback,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadManualRowHeights: Callback,
    manualRowHeights: js.Array[_],
    newSize: Double | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    pressed: Core | Unit,
    refreshGuidePosition: Callback,
    refreshHandlePosition: Callback,
    removeHooks: String => Callback,
    saveManualRowHeights: Callback,
    selectedRows: js.Array[_],
    setManualSize: (Double, Double) => CallbackTo[Double],
    setupGuidePosition: Callback,
    setupHandlePosition: HTMLElement => CallbackTo[Boolean | Unit],
    startOffset: Double | Unit,
    startWidth: Double | Unit,
    startY: Double | Unit,
    t: RecordTranslator,
    updatePlugin: Callback
  ): ManualRowResize = {
    val __obj = js.Dynamic.literal(autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], currentRow = currentRow.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guide = guide.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], manualRowHeights = manualRowHeights.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("checkIfRowHeader")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => checkIfRowHeader(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("clearManualSize")(js.Any.fromFunction1((t0: scala.Double) => clearManualSize(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("getTHFromTargetElement")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => getTHFromTargetElement(t0).runNow()))
    __obj.updateDynamic("hideHandleAndGuide")(hideHandleAndGuide.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("loadManualRowHeights")(loadManualRowHeights.toJsFn)
    __obj.updateDynamic("refreshGuidePosition")(refreshGuidePosition.toJsFn)
    __obj.updateDynamic("refreshHandlePosition")(refreshHandlePosition.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("saveManualRowHeights")(saveManualRowHeights.toJsFn)
    __obj.updateDynamic("setManualSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setManualSize(t0, t1).runNow()))
    __obj.updateDynamic("setupGuidePosition")(setupGuidePosition.toJsFn)
    __obj.updateDynamic("setupHandlePosition")(js.Any.fromFunction1((t0: org.scalajs.dom.raw.HTMLElement) => setupHandlePosition(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[ManualRowResize]
  }
}

