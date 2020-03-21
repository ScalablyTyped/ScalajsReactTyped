package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import typingsJapgolly.handsontable.mod._Handsontable.Core
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownMenu extends Base {
  var SEPARATOR: SeparatorObject
  var commandExecutor: CommandExecutor
  var eventManager: EventManager
  var itemsFactory: ItemsFactory | Unit
  var menu: Menu | Unit
  def close(): Unit
  def executeCommand(commandName: String, params: js.Any*): Unit
  def open(event: Event_): Unit
}

object DropdownMenu {
  @scala.inline
  def apply(
    SEPARATOR: SeparatorObject,
    addHook: (String, js.Function1[/* repeated */ js.Any, js.Any]) => Callback,
    callOnPluginsReady: js.Function0[Unit] => Callback,
    clearHooks: Callback,
    close: Callback,
    commandExecutor: CommandExecutor,
    destroy: Callback,
    disablePlugin: Callback,
    enablePlugin: Callback,
    enabled: Boolean,
    eventManager: EventManager,
    executeCommand: (String, /* repeated */ js.Any) => Callback,
    hot: Core,
    init: Callback,
    initialized: Boolean,
    isPluginsReady: Boolean,
    itemsFactory: ItemsFactory | Unit,
    menu: Menu | Unit,
    open: Event_ => Callback,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Callback,
    t: RecordTranslator,
    updatePlugin: Callback
  ): DropdownMenu = {
    val __obj = js.Dynamic.literal(SEPARATOR = SEPARATOR.asInstanceOf[js.Any], commandExecutor = commandExecutor.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], itemsFactory = itemsFactory.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.updateDynamic("addHook")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, js.Any]) => addHook(t0, t1).runNow()))
    __obj.updateDynamic("callOnPluginsReady")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => callOnPluginsReady(t0).runNow()))
    __obj.updateDynamic("clearHooks")(clearHooks.toJsFn)
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("disablePlugin")(disablePlugin.toJsFn)
    __obj.updateDynamic("enablePlugin")(enablePlugin.toJsFn)
    __obj.updateDynamic("executeCommand")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => executeCommand(t0, t1).runNow()))
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => open(t0).runNow()))
    __obj.updateDynamic("removeHooks")(js.Any.fromFunction1((t0: java.lang.String) => removeHooks(t0).runNow()))
    __obj.updateDynamic("updatePlugin")(updatePlugin.toJsFn)
    __obj.asInstanceOf[DropdownMenu]
  }
}

