package typingsJapgolly.reactOnsenui.mod

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabbarRenderTab extends js.Object {
  var content: Element
  var tab: Element
}

object TabbarRenderTab {
  @scala.inline
  def apply(content: VdomElement, tab: VdomElement): TabbarRenderTab = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.rawElement.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabbarRenderTab]
  }
}

