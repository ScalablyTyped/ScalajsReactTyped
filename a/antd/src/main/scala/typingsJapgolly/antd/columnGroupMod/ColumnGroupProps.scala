package typingsJapgolly.antd.columnGroupMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.AnonCompare
import typingsJapgolly.antd.tableInterfaceMod.ColumnFilterItem
import typingsJapgolly.antd.tableInterfaceMod.ColumnTitle
import typingsJapgolly.antd.tableInterfaceMod.CompareFn
import typingsJapgolly.antd.tableInterfaceMod.FilterDropdownProps
import typingsJapgolly.antd.tableInterfaceMod.Key
import typingsJapgolly.antd.tableInterfaceMod.SortOrder
import typingsJapgolly.rcTable.interfaceMod.AlignType
import typingsJapgolly.rcTable.interfaceMod.DataIndex
import typingsJapgolly.rcTable.interfaceMod.FixedType
import typingsJapgolly.rcTable.interfaceMod.GetComponentProps
import typingsJapgolly.rcTable.interfaceMod.RenderedCell
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Omit<antd.antd/lib/table/interface.ColumnType<RecordType>, 'children'> */
trait ColumnGroupProps[RecordType] extends js.Object {
  var align: js.UndefOr[AlignType] = js.undefined
  var children: Element | js.Array[Element]
  var className: js.UndefOr[String] = js.undefined
  var colSpan: js.UndefOr[Double] = js.undefined
  var dataIndex: js.UndefOr[DataIndex] = js.undefined
  var defaultFilteredValue: js.UndefOr[js.Array[Key]] = js.undefined
  var defaultSortOrder: js.UndefOr[SortOrder] = js.undefined
  var ellipsis: js.UndefOr[Boolean] = js.undefined
  var filterDropdown: js.UndefOr[Node | (js.Function1[/* props */ FilterDropdownProps, Node])] = js.undefined
  var filterDropdownVisible: js.UndefOr[Boolean] = js.undefined
  var filterIcon: js.UndefOr[Node | (js.Function1[/* filtered */ Boolean, Node])] = js.undefined
  var filterMultiple: js.UndefOr[Boolean] = js.undefined
  var filteredValue: js.UndefOr[js.Array[Key]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var fixed: js.UndefOr[FixedType] = js.undefined
  var key: js.UndefOr[typingsJapgolly.rcTable.interfaceMod.Key] = js.undefined
  var onCell: js.UndefOr[GetComponentProps[RecordType]] = js.undefined
  var onCellClick: js.UndefOr[
    js.Function2[/* record */ RecordType, /* e */ ReactMouseEventFrom[HTMLElement], Unit]
  ] = js.undefined
  var onFilter: js.UndefOr[js.Function2[/* value */ js.Any, /* record */ RecordType, Boolean]] = js.undefined
  var onFilterDropdownVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onHeaderCell: js.UndefOr[
    GetComponentProps[
      /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any
    ]
  ] = js.undefined
  var render: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* record */ RecordType, 
      /* index */ Double, 
      Node | RenderedCell[RecordType]
    ]
  ] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
  var sorter: js.UndefOr[Boolean | CompareFn[RecordType] | AnonCompare[RecordType]] = js.undefined
  var title: js.UndefOr[ColumnTitle[RecordType]] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply[RecordType](
    children: Element | js.Array[Element],
    align: AlignType = null,
    className: String = null,
    colSpan: Int | Double = null,
    dataIndex: DataIndex = null,
    defaultFilteredValue: js.Array[Key] = null,
    defaultSortOrder: SortOrder = null,
    ellipsis: js.UndefOr[Boolean] = js.undefined,
    filterDropdown: Node | (js.Function1[/* props */ FilterDropdownProps, Node]) = null,
    filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
    filterIcon: Node | (js.Function1[/* filtered */ Boolean, Node]) = null,
    filterMultiple: js.UndefOr[Boolean] = js.undefined,
    filteredValue: js.Array[Key] = null,
    filters: js.Array[ColumnFilterItem] = null,
    fixed: FixedType = null,
    key: typingsJapgolly.rcTable.interfaceMod.Key = null,
    onCell: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]] = null,
    onCellClick: (/* record */ RecordType, /* e */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    onFilter: (/* value */ js.Any, /* record */ RecordType) => CallbackTo[Boolean] = null,
    onFilterDropdownVisibleChange: /* visible */ Boolean => Callback = null,
    onHeaderCell: (/* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]] = null,
    render: (/* value */ js.Any, /* record */ RecordType, /* index */ Double) => CallbackTo[Node | RenderedCell[RecordType]] = null,
    rowSpan: Int | Double = null,
    sortDirections: js.Array[SortOrder] = null,
    sortOrder: SortOrder = null,
    sorter: Boolean | CompareFn[RecordType] | AnonCompare[RecordType] = null,
    title: ColumnTitle[RecordType] = null,
    width: Double | String = null
  ): ColumnGroupProps[RecordType] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (colSpan != null) __obj.updateDynamic("colSpan")(colSpan.asInstanceOf[js.Any])
    if (dataIndex != null) __obj.updateDynamic("dataIndex")(dataIndex.asInstanceOf[js.Any])
    if (defaultFilteredValue != null) __obj.updateDynamic("defaultFilteredValue")(defaultFilteredValue.asInstanceOf[js.Any])
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
    if (onCell != null) __obj.updateDynamic("onCell")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => onCell(t0, t1).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(js.Any.fromFunction2((t0: /* record */ RecordType, t1: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onCellClick(t0, t1).runNow()))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction2((t0: /* value */ js.Any, t1: /* record */ RecordType) => onFilter(t0, t1).runNow()))
    if (onFilterDropdownVisibleChange != null) __obj.updateDynamic("onFilterDropdownVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onFilterDropdownVisibleChange(t0).runNow()))
    if (onHeaderCell != null) __obj.updateDynamic("onHeaderCell")(js.Any.fromFunction2((t0: /* import warning: importer.ImportType#apply Failed type conversion: rc-table.rc-table/lib/interface.ColumnsType<RecordType>[number] */ js.Any, t1: /* index */ js.UndefOr[scala.Double]) => onHeaderCell(t0, t1).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3((t0: /* value */ js.Any, t1: /* record */ RecordType, t2: /* index */ scala.Double) => render(t0, t1, t2).runNow()))
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    if (sorter != null) __obj.updateDynamic("sorter")(sorter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps[RecordType]]
  }
}

