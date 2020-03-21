package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarComponent extends BaseComponent {
  def accept(): Unit
  def cancel(): Unit
  def getMenuItemDescriptor(): js.Object
}

object ActionBarComponent {
  @scala.inline
  def apply(
    accept: Callback,
    cancel: Callback,
    destroy: CallbackTo[Boolean],
    elements: js.Array[_],
    getMenuItemDescriptor: CallbackTo[js.Object],
    hidden: Boolean,
    hide: Callback,
    isHidden: CallbackTo[Boolean],
    reset: Callback,
    show: Callback
  ): ActionBarComponent = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.updateDynamic("accept")(accept.toJsFn)
    __obj.updateDynamic("cancel")(cancel.toJsFn)
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getMenuItemDescriptor")(getMenuItemDescriptor.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isHidden")(isHidden.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[ActionBarComponent]
  }
}

