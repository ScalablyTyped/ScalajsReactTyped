package typingsJapgolly.antDesignReactNative.cardFooterMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.PickCardStylefooterConten
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps
  extends CardFooterPropsType
     with WithThemeStyles[PickCardStylefooterConten] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: VdomNode = null,
    extra: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PickCardStylefooterConten] = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterProps]
  }
}

