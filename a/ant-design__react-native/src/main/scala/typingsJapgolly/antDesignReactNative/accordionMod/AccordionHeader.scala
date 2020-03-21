package typingsJapgolly.antDesignReactNative.accordionMod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionHeader extends js.Object {
  var content: Element
  var style: StyleProp[ViewStyle]
  var title: String
}

object AccordionHeader {
  @scala.inline
  def apply(content: VdomElement, title: String, style: StyleProp[ViewStyle] = null): AccordionHeader = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawElement.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionHeader]
  }
}

