package typingsJapgolly.antdMobileRn.whiteSpaceIndexNativeMod

import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xl
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xs
import typingsJapgolly.antdMobileRn.whiteSpacePropsTypeMod.WhiteSpacePropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null, style: StyleProp[ViewStyle] = null): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

