package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.handsontable.mod.Handsontable.plugins.EventManager
import typingsJapgolly.handsontable.mod.Handsontable.plugins.Menu
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectUI extends BaseUI {
  var items: js.Array[_]
  var menu: Menu | Unit
  def closeOptions(): Unit
  def openOptions(): Unit
  def setItems(items: js.Array[_]): Unit
}

object SelectUI {
  @scala.inline
  def apply(
    build: Callback,
    buildState: Boolean,
    closeOptions: Callback,
    destroy: Callback,
    element: CallbackTo[Element],
    eventManager: EventManager,
    focus: Callback,
    getValue: CallbackTo[js.Any],
    hide: Callback,
    hot: Core,
    isBuilt: CallbackTo[Boolean],
    items: js.Array[_],
    menu: Menu | Unit,
    openOptions: Callback,
    options: js.Object,
    reset: Callback,
    setItems: js.Array[js.Any] => Callback,
    setValue: js.Any => CallbackTo[js.Any],
    show: Callback,
    update: Callback
  ): SelectUI = {
    val __obj = js.Dynamic.literal(buildState = buildState.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("closeOptions")(closeOptions.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("element")(element.toJsFn)
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isBuilt")(isBuilt.toJsFn)
    __obj.updateDynamic("openOptions")(openOptions.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setItems")(js.Any.fromFunction1((t0: js.Array[js.Any]) => setItems(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.Any) => setValue(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[SelectUI]
  }
}

