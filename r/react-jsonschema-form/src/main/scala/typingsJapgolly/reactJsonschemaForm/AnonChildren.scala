package typingsJapgolly.reactJsonschemaForm

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: Element
  var className: String
  var disabled: Boolean
  var hasMoveDown: Boolean
  var hasMoveUp: Boolean
  var hasRemove: Boolean
  var hasToolbar: Boolean
  var index: Double
  var key: String
  var readonly: Boolean
  def onDropIndexClick(index: Double): js.Function1[/* event */ js.Any, Unit]
  def onReorderClick(index: Double, newIndex: Double): js.Function1[/* event */ js.Any, Unit]
}

object AnonChildren {
  @scala.inline
  def apply(
    children: VdomElement,
    className: String,
    disabled: Boolean,
    hasMoveDown: Boolean,
    hasMoveUp: Boolean,
    hasRemove: Boolean,
    hasToolbar: Boolean,
    index: Double,
    key: String,
    onDropIndexClick: Double => CallbackTo[js.Function1[/* event */ js.Any, Unit]],
    onReorderClick: (Double, Double) => CallbackTo[js.Function1[/* event */ js.Any, Unit]],
    readonly: Boolean
  ): AnonChildren = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], hasMoveDown = hasMoveDown.asInstanceOf[js.Any], hasMoveUp = hasMoveUp.asInstanceOf[js.Any], hasRemove = hasRemove.asInstanceOf[js.Any], hasToolbar = hasToolbar.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], readonly = readonly.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.updateDynamic("onDropIndexClick")(js.Any.fromFunction1((t0: scala.Double) => onDropIndexClick(t0).runNow()))
    __obj.updateDynamic("onReorderClick")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => onReorderClick(t0, t1).runNow()))
    __obj.asInstanceOf[AnonChildren]
  }
}

