package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueComponent extends BaseComponent {
  def getMenuItemDescriptor(): js.Object
  def getMultipleSelectElement(): MultipleSelectUI
  def getState(): js.Object
  def setState(value: js.Object): Unit
  def updateState(stateInfo: js.Object): Unit
}

object ValueComponent {
  @scala.inline
  def apply(
    destroy: CallbackTo[Boolean],
    elements: js.Array[_],
    getMenuItemDescriptor: CallbackTo[js.Object],
    getMultipleSelectElement: CallbackTo[MultipleSelectUI],
    getState: CallbackTo[js.Object],
    hidden: Boolean,
    hide: Callback,
    isHidden: CallbackTo[Boolean],
    reset: Callback,
    setState: js.Object => Callback,
    show: Callback,
    updateState: js.Object => Callback
  ): ValueComponent = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getMenuItemDescriptor")(getMenuItemDescriptor.toJsFn)
    __obj.updateDynamic("getMultipleSelectElement")(getMultipleSelectElement.toJsFn)
    __obj.updateDynamic("getState")(getState.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isHidden")(isHidden.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: js.Object) => setState(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.updateDynamic("updateState")(js.Any.fromFunction1((t0: js.Object) => updateState(t0).runNow()))
    __obj.asInstanceOf[ValueComponent]
  }
}

