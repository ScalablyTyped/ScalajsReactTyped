package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.bottomLeft
import typingsJapgolly.antd.antdStrings.bottomRight
import typingsJapgolly.antd.antdStrings.danger
import typingsJapgolly.antd.antdStrings.dashed
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.ghost
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.leftBottom
import typingsJapgolly.antd.antdStrings.leftTop
import typingsJapgolly.antd.antdStrings.link
import typingsJapgolly.antd.antdStrings.primary
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.antdStrings.rightBottom
import typingsJapgolly.antd.antdStrings.rightTop
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.antd.antdStrings.topLeft
import typingsJapgolly.antd.antdStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIcon extends js.Object {
  var disabled: Boolean
  var icon: Element
  var okType: js.UndefOr[link | dashed | default | primary | ghost | danger] = js.undefined
  var placement: js.UndefOr[
    bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
  ] = js.undefined
  var transitionName: String
  var trigger: js.UndefOr[String] = js.undefined
}

object AnonIcon {
  @scala.inline
  def apply(
    disabled: Boolean,
    icon: VdomElement,
    transitionName: String,
    okType: link | dashed | default | primary | ghost | danger = null,
    placement: bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom = null,
    trigger: String = null
  ): AnonIcon = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.rawElement.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIcon]
  }
}

