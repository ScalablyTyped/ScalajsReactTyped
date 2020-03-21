package typingsJapgolly.storybookReadme

import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildrenElement extends js.Object {
  var children: Element
}

object AnonChildrenElement {
  @scala.inline
  def apply(children: VdomElement): AnonChildrenElement = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildrenElement]
  }
}

