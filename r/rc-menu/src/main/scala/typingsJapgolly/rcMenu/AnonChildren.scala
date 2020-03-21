package typingsJapgolly.rcMenu

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var defaultActiveFirst: js.UndefOr[Boolean] = js.undefined
  var eventKey: js.UndefOr[Key] = js.undefined
}

object AnonChildren {
  @scala.inline
  def apply(
    children: VdomNode = null,
    defaultActiveFirst: js.UndefOr[Boolean] = js.undefined,
    eventKey: Key = null
  ): AnonChildren = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultActiveFirst)) __obj.updateDynamic("defaultActiveFirst")(defaultActiveFirst.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChildren]
  }
}

