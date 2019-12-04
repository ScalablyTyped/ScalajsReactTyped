package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Event
import typingsJapgolly.antd.Anon_Filters
import typingsJapgolly.antd.antdStrings.center
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnProps[T] extends js.Object {
  var align: js.UndefOr[left | right | center] = js.undefined
  var children: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var dataIndex: js.UndefOr[String] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  var filterDropdown: js.UndefOr[Node | (js.Function1[/* props */ FilterDropdownProps, Node])] = js.undefined
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  var filterIcon: js.UndefOr[Node | (js.Function1[/* filtered */ Boolean, Node])] = js.undefined
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[_] | Null] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var fixed: js.UndefOr[Boolean | left | right] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var onCell: js.UndefOr[js.Function2[/* record */ T, /* rowIndex */ Double, TableEventListeners]] = js.undefined
  var onCellClick: js.UndefOr[js.Function2[/* record */ T, /* event */ Event, Unit]] = js.undefined
  var onFilter: js.UndefOr[js.Function2[/* value */ js.Any, /* record */ T, Boolean]] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onHeaderCell: js.UndefOr[js.Function1[/* props */ ColumnProps[T], TableEventListeners]] = js.undefined
  var render: js.UndefOr[js.Function3[/* text */ js.Any, /* record */ T, /* index */ Double, Node]] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder | Boolean] = js.undefined
  var sorter: js.UndefOr[Boolean | CompareFn[T]] = js.undefined
  var title: js.UndefOr[Node | (js.Function1[/* options */ Anon_Filters[T], Node])] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object ColumnProps {
  @scala.inline
  def apply[T](
    align: left | right | center = null,
    children: js.Array[ColumnProps[T]] = null,
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
    key: Key = null,
    onCell: (/* record */ T, /* rowIndex */ Double) => CallbackTo[TableEventListeners] = null,
    onCellClick: (/* record */ T, /* event */ Event) => Callback = null,
    onFilter: (/* value */ js.Any, /* record */ T) => CallbackTo[Boolean] = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Callback = null,
    onHeaderCell: /* props */ ColumnProps[T] => CallbackTo[TableEventListeners] = null,
    render: (/* text */ js.Any, /* record */ T, /* index */ Double) => CallbackTo[Node] = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder | Boolean = null,
    sorter: Boolean | CompareFn[T] = null,
    title: Node | (js.Function1[/* options */ Anon_Filters[T], Node]) = null,
    width: String | Double = null
  ): ColumnProps[T] = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2((t0: /* record */ T, t1: /* rowIndex */ scala.Double) => onCell(t0, t1).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* record */ T, t1: /* event */ org.scalajs.dom.raw.Event) => onCellClick(t0, t1).runNow()))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* record */ T) => onFilter(t0, t1).runNow()))
    if (onFilterDropdownVisibleChange != null) __obj.updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onFilterDropdownVisibleChange(t0).runNow()))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T]) => onHeaderCell(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3((t0: /* text */ js.Any, t1: /* record */ T, t2: /* index */ scala.Double) => render(t0, t1, t2).runNow()))
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnProps[T]]
  }
}

