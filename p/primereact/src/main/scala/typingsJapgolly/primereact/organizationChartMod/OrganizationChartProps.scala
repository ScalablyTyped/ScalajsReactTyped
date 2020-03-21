package typingsJapgolly.primereact.organizationChartMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.primereact.AnonNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationChartProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var nodeTemplate: js.UndefOr[js.Function1[/* node */ OrganizationChartNodeData, Node]] = js.undefined
  var onNodeSelect: js.UndefOr[js.Function1[/* e */ AnonNode, Unit]] = js.undefined
  var onNodeUnselect: js.UndefOr[js.Function1[/* e */ AnonNode, Unit]] = js.undefined
  var selection: js.UndefOr[js.Any] = js.undefined
  var selectionChange: js.UndefOr[js.Function1[/* data */ js.Any, Unit]] = js.undefined
  var selectionMode: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var value: js.UndefOr[js.Array[OrganizationChartNodeData]] = js.undefined
}

object OrganizationChartProps {
  @scala.inline
  def apply(
    className: String = null,
    id: String = null,
    nodeTemplate: /* node */ OrganizationChartNodeData => CallbackTo[Node] = null,
    onNodeSelect: /* e */ AnonNode => Callback = null,
    onNodeUnselect: /* e */ AnonNode => Callback = null,
    selection: js.Any = null,
    selectionChange: /* data */ js.Any => Callback = null,
    selectionMode: String = null,
    style: js.Object = null,
    value: js.Array[OrganizationChartNodeData] = null
  ): OrganizationChartProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (nodeTemplate != null) __obj.updateDynamic("nodeTemplate")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.primereact.organizationChartMod.OrganizationChartNodeData) => nodeTemplate(t0).runNow()))
    if (onNodeSelect != null) __obj.updateDynamic("onNodeSelect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNode) => onNodeSelect(t0).runNow()))
    if (onNodeUnselect != null) __obj.updateDynamic("onNodeUnselect")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.primereact.AnonNode) => onNodeUnselect(t0).runNow()))
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionChange != null) __obj.updateDynamic("selectionChange")(js.Any.fromFunction1((t0: /* data */ js.Any) => selectionChange(t0).runNow()))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationChartProps]
  }
}

