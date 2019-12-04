package typingsJapgolly.antd.libAvatarMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antd.antdStrings.circle
import typingsJapgolly.antd.antdStrings.large
import typingsJapgolly.antd.antdStrings.small
import typingsJapgolly.antd.antdStrings.square
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarProps extends js.Object {
  var alt: js.UndefOr[String] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  /** Type of the Icon to be used in avatar */
  var icon: js.UndefOr[String | Node] = js.undefined
  var onError: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  /** Shape of avatar, options:`circle`, `square` */
  var shape: js.UndefOr[circle | square] = js.undefined
  var size: js.UndefOr[large | small | typingsJapgolly.antd.antdStrings.default | Double] = js.undefined
  /** Src of image avatar */
  var src: js.UndefOr[String] = js.undefined
  /** Srcset of image avatar */
  var srcSet: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AvatarProps {
  @scala.inline
  def apply(
    alt: String = null,
    children: VdomNode = null,
    className: String = null,
    icon: String | Node = null,
    onError: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    prefixCls: String = null,
    shape: circle | square = null,
    size: large | small | typingsJapgolly.antd.antdStrings.default | Double = null,
    src: String = null,
    srcSet: String = null,
    style: CSSProperties = null
  ): AvatarProps = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (srcSet != null) __obj.updateDynamic("srcSet")(srcSet.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarProps]
  }
}

