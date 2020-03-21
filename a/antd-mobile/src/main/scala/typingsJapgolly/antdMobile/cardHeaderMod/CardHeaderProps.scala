package typingsJapgolly.antdMobile.cardHeaderMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.cardPropsTypeMod.CardHeaderPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends CardHeaderPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    className: String = null,
    extra: VdomNode = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    thumb: VdomNode = null,
    thumbStyle: CSSProperties = null,
    title: VdomNode = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

