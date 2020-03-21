package typingsJapgolly.antdMobile.resultMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.antdMobileStrings.ghost
import typingsJapgolly.antdMobile.antdMobileStrings.primary
import typingsJapgolly.antdMobile.resultPropsTypeMod.ResultPropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultProps extends ResultPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ResultProps {
  @scala.inline
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    className: String = null,
    img: VdomNode = null,
    imgUrl: String = null,
    message: VdomNode = null,
    onButtonClick: js.UndefOr[Callback] = js.undefined,
    prefixCls: String = null,
    style: CSSProperties = null,
    title: VdomNode = null
  ): ResultProps = {
    val __obj = js.Dynamic.literal()
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    onButtonClick.foreach(p => __obj.updateDynamic("onButtonClick")(p.toJsFn))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultProps]
  }
}

