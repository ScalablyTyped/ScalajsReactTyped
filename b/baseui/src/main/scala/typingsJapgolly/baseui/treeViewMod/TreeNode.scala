package typingsJapgolly.baseui.treeViewMod

import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNode
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[TreeNode]] = js.undefined
  var id: js.UndefOr[Double | String] = js.undefined
  var info: js.UndefOr[js.Any] = js.undefined
  var isExpanded: js.UndefOr[Boolean] = js.undefined
  var label: (js.Function1[/* node */ this.type, Node]) | String
}

object TreeNode {
  @scala.inline
  def apply(
    label: (js.Function1[TreeNode, Node]) | String,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    children: js.Array[TreeNode] = null,
    id: Double | String = null,
    info: js.Any = null,
    isExpanded: js.UndefOr[Boolean] = js.undefined
  ): TreeNode = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(isExpanded)) __obj.updateDynamic("isExpanded")(isExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNode]
  }
}

