package typingsJapgolly.baseui.listMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelPropsT extends js.Object {
  var children: Node
  var description: js.UndefOr[Node] = js.undefined
  var sublist: js.UndefOr[Boolean] = js.undefined
}

object LabelPropsT {
  @scala.inline
  def apply(
    children: VdomNode = null,
    description: VdomNode = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): LabelPropsT = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPropsT]
  }
}

