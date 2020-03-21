package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.tableSemanticMod.ColumnOverrides
import typingsJapgolly.baseui.tableSemanticMod.TableBuilderColumnProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TableBuilderColumn {
  def apply[RowT](
    header: VdomNode = null,
    id: String = null,
    numeric: js.UndefOr[Boolean] = js.undefined,
    overrides: ColumnOverrides = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Any | RowT, js.UndefOr[Double]) => CallbackTo[Node]
  ): UnmountedWithRoot[
    TableBuilderColumnProps[RowT], 
    typingsJapgolly.baseui.tableSemanticMod.TableBuilderColumn[RowT], 
    Unit, 
    TableBuilderColumnProps[RowT]
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction2((t0: js.Any | RowT, t1: js.UndefOr[scala.Double]) => children(t0, t1).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.rawNode.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(numeric)) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.tableSemanticMod.TableBuilderColumnProps[RowT], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.baseui.tableSemanticMod.TableBuilderColumn[RowT]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.tableSemanticMod.TableBuilderColumnProps[RowT]])
  }
  @JSImport("baseui/table-semantic", "TableBuilderColumn")
  @js.native
  object componentImport extends js.Object
  
}

