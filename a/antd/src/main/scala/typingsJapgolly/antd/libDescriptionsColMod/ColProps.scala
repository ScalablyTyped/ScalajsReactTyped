package typingsJapgolly.antd.libDescriptionsColMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.antd.antdStrings.content
import typingsJapgolly.antd.antdStrings.horizontal
import typingsJapgolly.antd.antdStrings.label
import typingsJapgolly.antd.antdStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColProps extends js.Object {
  var bordered: Boolean
  var child: Element
  var colon: Boolean
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  var `type`: js.UndefOr[label | content] = js.undefined
}

object ColProps {
  @scala.inline
  def apply(
    bordered: Boolean,
    child: VdomElement,
    colon: Boolean,
    layout: horizontal | vertical = null,
    `type`: label | content = null
  ): ColProps = {
    val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], colon = colon.asInstanceOf[js.Any])
    if (child != null) __obj.updateDynamic("child")(child.rawElement.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColProps]
  }
}

