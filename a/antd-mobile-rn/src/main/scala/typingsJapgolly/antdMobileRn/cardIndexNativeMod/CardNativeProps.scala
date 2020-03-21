package typingsJapgolly.antdMobileRn.cardIndexNativeMod

import typingsJapgolly.antdMobileRn.cardPropsTypeMod.CardPropsType
import typingsJapgolly.antdMobileRn.cardStyleIndexNativeMod.ICardStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardNativeProps extends CardPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[ICardStyle] = js.undefined
}

object CardNativeProps {
  @scala.inline
  def apply(
    full: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: ICardStyle = null
  ): CardNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNativeProps]
  }
}

