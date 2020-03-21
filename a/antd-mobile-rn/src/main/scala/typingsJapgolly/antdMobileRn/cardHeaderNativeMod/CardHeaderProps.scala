package typingsJapgolly.antdMobileRn.cardHeaderNativeMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.cardPropsTypeMod.CardHeaderPropsType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardHeaderProps extends CardHeaderPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var thumbStyle: js.UndefOr[StyleProp[ImageStyle]] = js.undefined
}

object CardHeaderProps {
  @scala.inline
  def apply(
    extra: VdomNode = null,
    style: StyleProp[ViewStyle] = null,
    styles: js.Any = null,
    thumb: VdomNode = null,
    thumbStyle: StyleProp[ImageStyle] = null,
    title: VdomNode = null
  ): CardHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.rawNode.asInstanceOf[js.Any])
    if (thumbStyle != null) __obj.updateDynamic("thumbStyle")(thumbStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardHeaderProps]
  }
}

