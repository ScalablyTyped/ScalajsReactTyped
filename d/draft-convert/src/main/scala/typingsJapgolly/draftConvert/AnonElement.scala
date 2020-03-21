package typingsJapgolly.draftConvert

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.draftConvert.mod._Tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElement extends _Tag {
  var element: Node
  var empty: js.UndefOr[Node] = js.undefined
}

object AnonElement {
  @scala.inline
  def apply(element: VdomNode = null, empty: VdomNode = null): AnonElement = {
    val __obj = js.Dynamic.literal()
    if (element != null) __obj.updateDynamic("element")(element.rawNode.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElement]
  }
}

