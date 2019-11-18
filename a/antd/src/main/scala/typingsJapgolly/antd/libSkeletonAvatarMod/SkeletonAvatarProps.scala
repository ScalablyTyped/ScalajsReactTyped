package typingsJapgolly.antd.libSkeletonAvatarMod

import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkeletonAvatarProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[large | small | typingsJapgolly.antd.antdStrings.default | Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SkeletonAvatarProps {
  @scala.inline
  def apply(
    className: String = null,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | typingsJapgolly.antd.antdStrings.default | Double = null,
    style: js.Object = null
  ): SkeletonAvatarProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkeletonAvatarProps]
  }
}

