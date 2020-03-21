package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.primereact.AnonNode
import typingsJapgolly.primereact.organizationChartMod.OrganizationChartNodeData
import typingsJapgolly.primereact.organizationChartMod.OrganizationChartProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OrganizationChart {
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
    value: js.Array[OrganizationChartNodeData] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    OrganizationChartProps, 
    typingsJapgolly.primereact.primereactOrganizationchartMod.OrganizationChart, 
    Unit, 
    OrganizationChartProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.primereact.organizationChartMod.OrganizationChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.primereact.primereactOrganizationchartMod.OrganizationChart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.primereact.organizationChartMod.OrganizationChartProps])(children: _*)
  }
  @JSImport("primereact/organizationchart", "OrganizationChart")
  @js.native
  object componentImport extends js.Object
  
}

