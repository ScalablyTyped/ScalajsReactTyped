package typingsJapgolly.antDesignProLayout.themeColorMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends js.Object {
  var check: Boolean
  var className: js.UndefOr[String] = js.undefined
  var color: String
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    check: Boolean,
    color: String,
    className: String = null,
    onClick: js.UndefOr[Callback] = js.undefined
  ): TagProps = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    __obj.asInstanceOf[TagProps]
  }
}

