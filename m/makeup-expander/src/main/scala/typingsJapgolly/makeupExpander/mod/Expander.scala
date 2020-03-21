package typingsJapgolly.makeupExpander.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expander extends js.Object {
  var collapseOnClickOut: Boolean
  var collapseOnFocusOut: Boolean
  var collapseOnMouseOut: Boolean
  var expandOnClick: Boolean
  var expandOnFocus: Boolean
  var expandOnHover: Boolean
  def collapse(): Unit
  def expand(isKeyboard: Boolean): Unit
  def isExpanded(): Boolean
  def toggle(): Unit
}

object Expander {
  @scala.inline
  def apply(
    collapse: Callback,
    collapseOnClickOut: Boolean,
    collapseOnFocusOut: Boolean,
    collapseOnMouseOut: Boolean,
    expand: Boolean => Callback,
    expandOnClick: Boolean,
    expandOnFocus: Boolean,
    expandOnHover: Boolean,
    isExpanded: CallbackTo[Boolean],
    toggle: Callback
  ): Expander = {
    val __obj = js.Dynamic.literal(collapseOnClickOut = collapseOnClickOut.asInstanceOf[js.Any], collapseOnFocusOut = collapseOnFocusOut.asInstanceOf[js.Any], collapseOnMouseOut = collapseOnMouseOut.asInstanceOf[js.Any], expandOnClick = expandOnClick.asInstanceOf[js.Any], expandOnFocus = expandOnFocus.asInstanceOf[js.Any], expandOnHover = expandOnHover.asInstanceOf[js.Any])
    __obj.updateDynamic("collapse")(collapse.toJsFn)
    __obj.updateDynamic("expand")(js.Any.fromFunction1((t0: scala.Boolean) => expand(t0).runNow()))
    __obj.updateDynamic("isExpanded")(isExpanded.toJsFn)
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.asInstanceOf[Expander]
  }
}

