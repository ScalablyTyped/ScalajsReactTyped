package typingsJapgolly.antdMobileRn.cardFooterNativeMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.cardPropsTypeMod.CardFooterPropsType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps extends CardFooterPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    content: VdomNode = null,
    extra: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterProps]
  }
}

