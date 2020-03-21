package typingsJapgolly.reactSortableTree.mod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeItem
  extends /* x */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[TreeItem] | GetTreeItemChildrenFn] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var subtitle: js.UndefOr[Node] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object TreeItem {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    children: js.Array[TreeItem] | GetTreeItemChildrenFn = null,
    expanded: js.UndefOr[Boolean] = js.undefined,
    subtitle: VdomNode = null,
    title: VdomNode = null
  ): TreeItem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.asInstanceOf[js.Any])
    if (subtitle != null) __obj.updateDynamic("subtitle")(subtitle.rawNode.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItem]
  }
}

