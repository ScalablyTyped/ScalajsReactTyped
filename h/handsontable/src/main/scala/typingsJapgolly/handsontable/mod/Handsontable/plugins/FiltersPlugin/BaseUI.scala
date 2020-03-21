package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.handsontable.mod.Handsontable.plugins.EventManager
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseUI extends js.Object {
  var buildState: Boolean
  var eventManager: EventManager
  var hot: Core
  var options: js.Object
  def build(): Unit
  def destroy(): Unit
  def element(): Element
  def focus(): Unit
  def getValue(): js.Any
  def hide(): Unit
  def isBuilt(): Boolean
  def reset(): Unit
  def setValue(value: js.Any): js.Any
  def show(): Unit
  def update(): Unit
}

object BaseUI {
  @scala.inline
  def apply(
    build: Callback,
    buildState: Boolean,
    destroy: Callback,
    element: CallbackTo[Element],
    eventManager: EventManager,
    focus: Callback,
    getValue: CallbackTo[js.Any],
    hide: Callback,
    hot: Core,
    isBuilt: CallbackTo[Boolean],
    options: js.Object,
    reset: Callback,
    setValue: js.Any => CallbackTo[js.Any],
    show: Callback,
    update: Callback
  ): BaseUI = {
    val __obj = js.Dynamic.literal(buildState = buildState.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("build")(build.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("element")(element.toJsFn)
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isBuilt")(isBuilt.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.Any) => setValue(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("update")(update.toJsFn)
    __obj.asInstanceOf[BaseUI]
  }
}

