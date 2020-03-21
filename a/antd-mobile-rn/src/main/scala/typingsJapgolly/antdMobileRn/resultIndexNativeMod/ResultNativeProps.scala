package typingsJapgolly.antdMobileRn.resultIndexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.ghost
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.primary
import typingsJapgolly.antdMobileRn.resultPropsTypeMod.ResultPropsType
import typingsJapgolly.antdMobileRn.resultStyleIndexNativeMod.IResultStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultNativeProps extends ResultPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[IResultStyle] = js.undefined
}

object ResultNativeProps {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: VdomNode = null,
    imgUrl: String = null,
    message: VdomNode = null,
    onButtonClick: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: IResultStyle = null,
    title: VdomNode = null
  ): ResultNativeProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    onButtonClick.foreach(p => __obj.updateDynamic("onButtonClick")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultNativeProps]
  }
}

