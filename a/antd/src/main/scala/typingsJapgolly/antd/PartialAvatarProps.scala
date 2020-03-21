package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/skeleton/Avatar.AvatarProps> */
trait PartialAvatarProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[large | small | default | Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object PartialAvatarProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | default | Double = null,
    style: js.Object = null
  ): PartialAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialAvatarProps]
  }
}

