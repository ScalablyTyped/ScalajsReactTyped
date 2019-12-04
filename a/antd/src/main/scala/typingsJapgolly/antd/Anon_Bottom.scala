package typingsJapgolly.antd

import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.bottomLeft
import typingsJapgolly.antd.antdStrings.bottomRight
import typingsJapgolly.antd.antdStrings.click
import typingsJapgolly.antd.antdStrings.contextMenu
import typingsJapgolly.antd.antdStrings.danger
import typingsJapgolly.antd.antdStrings.dashed
import typingsJapgolly.antd.antdStrings.default
import typingsJapgolly.antd.antdStrings.focus
import typingsJapgolly.antd.antdStrings.ghost
import typingsJapgolly.antd.antdStrings.hover
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
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var disabled: Boolean
  var icon: Element
  var okType: js.UndefOr[link | default | dashed | primary | ghost | danger] = js.undefined
  var placement: js.UndefOr[
    bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom
  ] = js.undefined
  var transitionName: String
  var trigger: js.UndefOr[click | focus | contextMenu | hover] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    disabled: Boolean,
    icon: Element,
    transitionName: String,
    okType: link | default | dashed | primary | ghost | danger = null,
    placement: bottom | left | right | top | bottomRight | topLeft | topRight | bottomLeft | leftTop | leftBottom | rightTop | rightBottom = null,
    trigger: click | focus | contextMenu | hover = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], transitionName = transitionName.asInstanceOf[js.Any])
    if (okType != null) __obj.updateDynamic("okType")(okType.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

