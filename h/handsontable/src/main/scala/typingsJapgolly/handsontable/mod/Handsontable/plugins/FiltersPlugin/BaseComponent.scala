package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComponent extends js.Object {
  var elements: js.Array[_]
  var hidden: Boolean
  def destroy(): Boolean
  def hide(): Unit
  def isHidden(): Boolean
  def reset(): Unit
  def show(): Unit
}

object BaseComponent {
  @scala.inline
  def apply(
    destroy: CallbackTo[Boolean],
    elements: js.Array[_],
    hidden: Boolean,
    hide: Callback,
    isHidden: CallbackTo[Boolean],
    reset: Callback,
    show: Callback
  ): BaseComponent = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("isHidden")(isHidden.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[BaseComponent]
  }
}

