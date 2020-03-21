package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/skeleton/Input.SkeletonInputProps> */
trait PartialSkeletonInputProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small | default] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object PartialSkeletonInputProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    size: large | small | default = null,
    style: js.Object = null
  ): PartialSkeletonInputProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSkeletonInputProps]
  }
}

