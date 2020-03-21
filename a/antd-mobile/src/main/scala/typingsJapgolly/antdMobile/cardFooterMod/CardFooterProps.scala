package typingsJapgolly.antdMobile.cardFooterMod

import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antdMobile.cardPropsTypeMod.CardFooterPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterProps extends CardFooterPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object CardFooterProps {
  @scala.inline
  def apply(
    className: String = null,
    content: VdomNode = null,
    extra: VdomNode = null,
    prefixCls: String = null
  ): CardFooterProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.rawNode.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterProps]
  }
}

