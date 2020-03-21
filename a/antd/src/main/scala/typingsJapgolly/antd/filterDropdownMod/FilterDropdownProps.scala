package typingsJapgolly.antd.filterDropdownMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.tableInterfaceMod.ColumnType
import typingsJapgolly.antd.tableInterfaceMod.GetPopupContainer
import typingsJapgolly.antd.tableInterfaceMod.Key
import typingsJapgolly.antd.tableInterfaceMod.TableLocale
import typingsJapgolly.antd.useFilterMod.FilterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps[RecordType] extends js.Object {
  var children: Node
  var column: ColumnType[RecordType]
  var columnKey: Key
  var dropdownPrefixCls: String
  var filterMultiple: Boolean
  var filterState: js.UndefOr[FilterState[RecordType]] = js.undefined
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: String
  def triggerFilter(filterState: FilterState[RecordType]): Unit
}

object FilterDropdownProps {
  @scala.inline
  def apply[RecordType](
    column: ColumnType[RecordType],
    columnKey: Key,
    dropdownPrefixCls: String,
    filterMultiple: Boolean,
    locale: TableLocale,
    prefixCls: String,
    triggerFilter: FilterState[RecordType] => Callback,
    children: VdomNode = null,
    filterState: FilterState[RecordType] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null
  ): FilterDropdownProps[RecordType] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnKey = columnKey.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], filterMultiple = filterMultiple.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("triggerFilter")(js.Any.fromFunction1((t0: typingsJapgolly.antd.useFilterMod.FilterState[RecordType]) => triggerFilter(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (filterState != null) __obj.updateDynamic("filterState")(filterState.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    __obj.asInstanceOf[FilterDropdownProps[RecordType]]
  }
}

