package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import typingsJapgolly.antd.Anon_Filters
import typingsJapgolly.antd.antdStrings.center
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.libTableColumnMod.default
import typingsJapgolly.antd.libTableInterfaceMod.ColumnFilterItem
import typingsJapgolly.antd.libTableInterfaceMod.ColumnProps
import typingsJapgolly.antd.libTableInterfaceMod.CompareFn
import typingsJapgolly.antd.libTableInterfaceMod.FilterDropdownProps
import typingsJapgolly.antd.libTableInterfaceMod.SortOrder
import typingsJapgolly.antd.libTableInterfaceMod.TableEventListeners
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Column {
  def apply[T](
    align: left | right | center = null,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: String = null,
    defaultSortOrder: SortOrder = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    filterDropdown: Node | (js.Function1[/* props */ FilterDropdownProps, Node]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: Node | (js.Function1[/* filtered */ Boolean, Node]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[_] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: Boolean | left | right = null,
    onCell: (T, /* rowIndex */ Double) => CallbackTo[TableEventListeners] = null,
    onCellClick: (T, /* event */ Event) => Callback = null,
    onFilter: (/* value */ js.Any, T) => CallbackTo[Boolean] = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Callback = null,
    onHeaderCell: /* props */ ColumnProps[T] => CallbackTo[TableEventListeners] = null,
    render: (/* text */ js.Any, T, /* index */ Double) => CallbackTo[Node] = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder | Boolean = null,
    sorter: Boolean | CompareFn[T] = null,
    title: Node | (js.Function1[/* options */ Anon_Filters[T], Node]) = null,
    width: String | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: js.Array[ColumnProps[T]] = null
  ): UnmountedWithRoot[ColumnProps[T], default[T], Unit, ColumnProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (defaultSortOrder != null) __obj.updateDynamic("defaultSortOrder")(defaultSortOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(ellipsis)) __obj.updateDynamic("ellipsis")(ellipsis.asInstanceOf[js.Any])
    if (filterDropdown != null) __obj.updateDynamic("filterDropdown")(filterDropdown.asInstanceOf[js.Any])
    if (!js.isUndefined(filterDropdownVisible)) __obj.updateDynamic("filterDropdownVisible")(filterDropdownVisible.asInstanceOf[js.Any])
    if (filterIcon != null) __obj.updateDynamic("filterIcon")(filterIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(filterMultiple)) __obj.updateDynamic("filterMultiple")(filterMultiple.asInstanceOf[js.Any])
    if (filteredValue != null) __obj.updateDynamic("filteredValue")(filteredValue.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (fixed != null) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2((t0: T, t1: /* rowIndex */ scala.Double) => onCell(t0, t1).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: T, t1: /* event */ org.scalajs.dom.raw.Event) => onCellClick(t0, t1).runNow()))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: T) => onFilter(t0, t1).runNow()))
    if (onFilterDropdownVisibleChange != null) __obj.updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onFilterDropdownVisibleChange(t0).runNow()))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T]) => onHeaderCell(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3((t0: /* text */ js.Any, t1: T, t2: /* index */ scala.Double) => render(t0, t1, t2).runNow()))
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antd.libTableColumnMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T]])
  }
  @JSImport("antd/lib/table/Column", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

