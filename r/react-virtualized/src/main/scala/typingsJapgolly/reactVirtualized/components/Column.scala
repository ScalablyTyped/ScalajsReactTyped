package typingsJapgolly.reactVirtualized.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactVirtualized.esTableMod.ColumnProps
import typingsJapgolly.reactVirtualized.esTableMod.SortDirectionType
import typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetterParams
import typingsJapgolly.reactVirtualized.esTableMod.TableCellProps
import typingsJapgolly.reactVirtualized.esTableMod.TableHeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  def apply(
    dataKey: js.Any,
    width: Double,
    `aria-label`: String = null,
    cellDataGetter: /* params */ TableCellDataGetterParams => CallbackTo[js.Any] = null,
    cellRenderer: /* props */ TableCellProps => CallbackTo[Node] = null,
    className: String = null,
    columnData: js.Any = null,
    defaultSortDirection: SortDirectionType = null,
    disableSort: js.UndefOr[Boolean] = js.undefined,
    flexGrow: Int | Double = null,
    flexShrink: Int | Double = null,
    headerClassName: String = null,
    headerRenderer: /* props */ TableHeaderProps => CallbackTo[Node] = null,
    headerStyle: CSSProperties = null,
    id: String = null,
    label: VdomNode = null,
    maxWidth: Int | Double = null,
    minWidth: Int | Double = null,
    style: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ColumnProps, typingsJapgolly.reactVirtualized.mod.Column, Unit, ColumnProps] = {
    val __obj = js.Dynamic.literal(dataKey = dataKey.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (cellDataGetter != null) __obj.updateDynamic("cellDataGetter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactVirtualized.esTableMod.TableCellDataGetterParams) => cellDataGetter(t0).runNow()))
    if (cellRenderer != null) __obj.updateDynamic("cellRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableCellProps) => cellRenderer(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columnData != null) __obj.updateDynamic("columnData")(columnData.asInstanceOf[js.Any])
    if (defaultSortDirection != null) __obj.updateDynamic("defaultSortDirection")(defaultSortDirection.asInstanceOf[js.Any])
    if (!js.isUndefined(disableSort)) __obj.updateDynamic("disableSort")(disableSort.asInstanceOf[js.Any])
    if (flexGrow != null) __obj.updateDynamic("flexGrow")(flexGrow.asInstanceOf[js.Any])
    if (flexShrink != null) __obj.updateDynamic("flexShrink")(flexShrink.asInstanceOf[js.Any])
    if (headerClassName != null) __obj.updateDynamic("headerClassName")(headerClassName.asInstanceOf[js.Any])
    if (headerRenderer != null) __obj.updateDynamic("headerRenderer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactVirtualized.esTableMod.TableHeaderProps) => headerRenderer(t0).runNow()))
    if (headerStyle != null) __obj.updateDynamic("headerStyle")(headerStyle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.rawNode.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactVirtualized.esTableMod.ColumnProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactVirtualized.mod.Column](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactVirtualized.esTableMod.ColumnProps])(children: _*)
  }
  @JSImport("react-virtualized", "Column")
  @js.native
  object componentImport extends js.Object
  
}

