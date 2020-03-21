package typingsJapgolly.antdMobile.resultPropsTypeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.ghost
import typingsJapgolly.antdMobile.antdMobileStrings.primary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPropsType extends js.Object {
  var buttonText: js.UndefOr[String] = js.undefined
  var buttonType: js.UndefOr[primary | ghost] = js.undefined
  var img: js.UndefOr[Node] = js.undefined
  var imgUrl: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[Node] = js.undefined
  var onButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object ResultPropsType {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: VdomNode = null,
    imgUrl: String = null,
    message: VdomNode = null,
    onButtonClick: js.UndefOr[Callback] = js.undefined,
    title: VdomNode = null
  ): ResultPropsType = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    onButtonClick.foreach(p => __obj.updateDynamic("onButtonClick")(p.toJsFn))
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultPropsType]
  }
}

