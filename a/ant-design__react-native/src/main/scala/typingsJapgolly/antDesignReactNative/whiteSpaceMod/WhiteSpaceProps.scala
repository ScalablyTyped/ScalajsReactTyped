package typingsJapgolly.antDesignReactNative.whiteSpaceMod

import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.md
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.xl
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.xs
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends js.Object {
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
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

