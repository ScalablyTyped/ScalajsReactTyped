package typingsJapgolly.antdMobileRn.wingBlankIndexNativeMod

import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.wingBlankPropsTypeMod.WingBlankPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps extends WingBlankPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(size: sm | md | lg = null, style: StyleProp[ViewStyle] = null): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankProps]
  }
}

