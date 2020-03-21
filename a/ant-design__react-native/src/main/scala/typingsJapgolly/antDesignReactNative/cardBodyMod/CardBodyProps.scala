package typingsJapgolly.antDesignReactNative.cardBodyMod

import typingsJapgolly.antDesignReactNative.PickCardStylebody
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardBodyProps extends WithThemeStyles[PickCardStylebody] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardBodyProps {
  @scala.inline
  def apply(style: StyleProp[ViewStyle] = null, styles: Partial[PickCardStylebody] = null): CardBodyProps = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardBodyProps]
  }
}

