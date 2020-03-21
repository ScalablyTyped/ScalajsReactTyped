package typingsJapgolly.antDesignReactNative.resultMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.antDesignReactNative.resultPropsTypeMod.ResultPropsType
import typingsJapgolly.antDesignReactNative.resultStyleMod.ResultStyle
import typingsJapgolly.reactNative.mod.ImagePropertiesSourceOptions
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultNativeProps
  extends ResultPropsType
     with WithThemeStyles[ResultStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ResultNativeProps {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: VdomNode = null,
    imgUrl: ImagePropertiesSourceOptions = null,
    message: VdomNode = null,
    onButtonClick: /* e */ js.Any => Callback = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ResultStyle] = null,
    title: VdomNode = null
  ): ResultNativeProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1((t0: /* e */ js.Any) => onButtonClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultNativeProps]
  }
}

