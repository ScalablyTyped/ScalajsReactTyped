package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsibleColumns extends Base {
  var buttonEnabledList: js.Object
  var collapsedSections: js.Object
  var columnHeaderLevelCount: Double
  var eventManager: EventManager
  var hiddenColumnsPlugin: js.Object
  var nestedHeadersPlugin: js.Object
  var settings: Boolean | js.Array[_]
  def checkDependencies(): Unit
  def collapseAll(): Unit
  def collapseSection(coords: js.Object): Unit
  def expandAll(): Unit
  def expandSection(coords: js.Object): Unit
  def generateIndicator(col: Double, TH: HTMLElement): HTMLElement
  def markSectionAs(state: String, row: Double, column: Double, recursive: Boolean): Unit
  def meetsDependencies(): Boolean
  def parseSettings(): Unit
  def toggleAllCollapsibleSections(action: String): Unit
  def toggleCollapsibleSection(coords: js.Object, action: String): Unit
}

object CollapsibleColumns {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    buttonEnabledList: js.Object,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    checkDependencies: Callback,
    clearHooks: Callback,
    collapseAll: Callback,
    collapseSection: js.Object => Callback,
    collapsedSections: js.Object,
    columnHeaderLevelCount: Double,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    expandAll: Callback,
    expandSection: js.Object => Callback,
    generateIndicator: (Double, HTMLElement) => CallbackTo[HTMLElement],
    hiddenColumnsPlugin: js.Object,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    markSectionAs: (String, Double, Double, Boolean) => Callback,
    meetsDependencies: CallbackTo[Boolean],
    nestedHeadersPlugin: js.Object,
    parseSettings: Callback,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    settings: Boolean | js.Array[_],
    t: RecordTranslator,
    toggleAllCollapsibleSections: String => Callback,
    toggleCollapsibleSection: (js.Object, String) => Callback,
    updatePlugin: Callback
  ): CollapsibleColumns = {
    val __obj = js.Dynamic.literal(buttonEnabledList = buttonEnabledList.asInstanceOf[js.Any], collapsedSections = collapsedSections.asInstanceOf[js.Any], columnHeaderLevelCount = columnHeaderLevelCount.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], hiddenColumnsPlugin = hiddenColumnsPlugin.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], nestedHeadersPlugin = nestedHeadersPlugin.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("checkDependencies")(checkDependencies.toJsFn)
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("collapseAll")(collapseAll.toJsFn)
    __obj.updateDynamic("collapseSection")(js.Any.fromFunction1((t0: js.Object) => collapseSection(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("expandAll")(expandAll.toJsFn)
    __obj.updateDynamic("expandSection")(js.Any.fromFunction1((t0: js.Object) => expandSection(t0).runNow()))
    __obj.updateDynamic("generateIndicator")(js.Any.fromFunction2((t0: scala.Double, t1: org.scalajs.dom.raw.HTMLElement) => generateIndicator(t0, t1).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("markSectionAs")(js.Any.fromFunction4((t0: java.lang.String, t1: scala.Double, t2: scala.Double, t3: scala.Boolean) => markSectionAs(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("meetsDependencies")(meetsDependencies.toJsFn)
    __obj.updateDynamic("parseSettings")(parseSettings.toJsFn)
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("toggleAllCollapsibleSections")(js.Any.fromFunction1((t0: java.lang.String) => toggleAllCollapsibleSections(t0).runNow()))
    __obj.updateDynamic("toggleCollapsibleSection")(js.Any.fromFunction2((t0: js.Object, t1: java.lang.String) => toggleCollapsibleSection(t0, t1).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[CollapsibleColumns]
  }
}

