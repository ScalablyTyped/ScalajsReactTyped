package typingsJapgolly.antdMobile.wingBlankMod

import typingsJapgolly.antdMobile.antdMobileStrings.lg
import typingsJapgolly.antdMobile.antdMobileStrings.md
import typingsJapgolly.antdMobile.antdMobileStrings.sm
import typingsJapgolly.antdMobile.wingBlankPropsTypeMod.WingBlankPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps extends WingBlankPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(
    className: String = null,
    prefixCls: String = null,
    size: sm | md | lg = null,
    style: CSSProperties = null
  ): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankProps]
  }
}

