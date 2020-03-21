package typingsJapgolly.antDesignPro

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCollapseText extends js.Object {
  var collapseText: js.UndefOr[Node] = js.undefined
  var expandText: js.UndefOr[Node] = js.undefined
  var selectAllText: js.UndefOr[Node] = js.undefined
}

object AnonCollapseText {
  @scala.inline
  def apply(collapseText: VdomNode = null, expandText: VdomNode = null, selectAllText: VdomNode = null): AnonCollapseText = {
    val __obj = js.Dynamic.literal()
    if (collapseText != null) __obj.updateDynamic("collapseText")(collapseText.rawNode.asInstanceOf[js.Any])
    if (expandText != null) __obj.updateDynamic("expandText")(expandText.rawNode.asInstanceOf[js.Any])
    if (selectAllText != null) __obj.updateDynamic("selectAllText")(selectAllText.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCollapseText]
  }
}

