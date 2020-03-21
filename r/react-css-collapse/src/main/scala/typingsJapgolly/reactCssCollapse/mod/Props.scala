package typingsJapgolly.reactCssCollapse.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String | Null] = js.undefined
  var isOpen: Boolean
  var onRest: js.UndefOr[js.Function0[Unit]] = js.undefined
  var transition: js.UndefOr[String | Null] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    isOpen: Boolean,
    className: String = null,
    onRest: js.UndefOr[Callback] = js.undefined,
    transition: String = null
  ): Props = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onRest.foreach(p => __obj.updateDynamic("onRest")(p.toJsFn))
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

