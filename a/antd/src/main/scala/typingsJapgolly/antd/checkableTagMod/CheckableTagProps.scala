package typingsJapgolly.antd.checkableTagMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckableTagProps extends js.Object {
  var checked: Boolean
  var className: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object CheckableTagProps {
  @scala.inline
  def apply(
    checked: Boolean,
    className: String = null,
    onChange: /* checked */ Boolean => Callback = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): CheckableTagProps = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* checked */ scala.Boolean) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckableTagProps]
  }
}

