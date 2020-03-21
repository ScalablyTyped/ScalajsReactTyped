package typingsJapgolly.antdMobileRn.iconIndexNativeMod

import typingsJapgolly.antdMobileRn.antdMobileRnStrings.lg
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.md
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.sm
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xs
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.xxs
import typingsJapgolly.antdMobileRn.iconPropsTypeMod.IconPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends IconPropsType {
  var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    `type`: String,
    color: String = null,
    size: xxs | xs | sm | md | lg | Double = null,
    style: StyleProp[ViewStyle] = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

