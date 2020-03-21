package typingsJapgolly.antDesignReactNative.resultPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsJapgolly.reactNative.mod.ImagePropertiesSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPropsType extends js.Object {
  var buttonText: js.UndefOr[String] = js.undefined
  var buttonType: js.UndefOr[primary | ghost] = js.undefined
  var img: js.UndefOr[Node] = js.undefined
  var imgUrl: js.UndefOr[ImagePropertiesSourceOptions] = js.undefined
  var message: js.UndefOr[Node] = js.undefined
  var onButtonClick: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object ResultPropsType {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: VdomNode = null,
    imgUrl: ImagePropertiesSourceOptions = null,
    message: VdomNode = null,
    onButtonClick: /* e */ js.Any => Callback = null,
    title: VdomNode = null
  ): ResultPropsType = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1((t0: /* e */ js.Any) => onButtonClick(t0).runNow()))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultPropsType]
  }
}

