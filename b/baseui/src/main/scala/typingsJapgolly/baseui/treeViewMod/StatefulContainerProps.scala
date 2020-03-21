package typingsJapgolly.baseui.treeViewMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/tree-view.TreeViewProps & {children (props : baseui.baseui/tree-view.TreeViewProps): react.react.ReactNode} */
trait StatefulContainerProps extends js.Object {
  var data: js.Array[TreeNode]
  var onToggle: js.UndefOr[js.Function1[/* node */ TreeNode, Unit]] = js.undefined
  var overrides: js.UndefOr[TreeViewOverrides] = js.undefined
  var renderAll: js.UndefOr[Boolean] = js.undefined
  var singleExpanded: js.UndefOr[Boolean] = js.undefined
  def children(props: TreeViewProps): Node
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    children: TreeViewProps => CallbackTo[Node],
    data: js.Array[TreeNode],
    onToggle: /* node */ TreeNode => Callback = null,
    overrides: TreeViewOverrides = null,
    renderAll: js.UndefOr[Boolean] = js.undefined,
    singleExpanded: js.UndefOr[Boolean] = js.undefined
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.baseui.treeViewMod.TreeViewProps) => children(t0).runNow()))
    if (onToggle != null) __obj.updateDynamic("onToggle")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.baseui.treeViewMod.TreeNode) => onToggle(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAll)) __obj.updateDynamic("renderAll")(renderAll.asInstanceOf[js.Any])
    if (!js.isUndefined(singleExpanded)) __obj.updateDynamic("singleExpanded")(singleExpanded.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

