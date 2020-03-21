package typingsJapgolly.antd.tableInterfaceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var prefixCls: String
  var selectedKeys: js.Array[typingsJapgolly.react.mod.Key]
  var visible: Boolean
  def confirm(): Unit
  def setSelectedKeys(selectedKeys: js.Array[String]): Unit
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    confirm: Callback,
    prefixCls: String,
    selectedKeys: js.Array[typingsJapgolly.react.mod.Key],
    setSelectedKeys: js.Array[String] => Callback,
    visible: Boolean,
    clearFilters: js.UndefOr[Callback] = js.undefined,
    filters: js.Array[ColumnFilterItem] = null
  ): FilterDropdownProps = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("confirm")(confirm.toJsFn)
    __obj.updateDynamic("setSelectedKeys")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setSelectedKeys(t0).runNow()))
    clearFilters.foreach(p => __obj.updateDynamic("clearFilters")(p.toJsFn))
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropdownProps]
  }
}

