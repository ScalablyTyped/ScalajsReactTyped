package typingsJapgolly.antd.useFilterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.tableInterfaceMod.ColumnsType
import typingsJapgolly.antd.tableInterfaceMod.GetPopupContainer
import typingsJapgolly.antd.tableInterfaceMod.Key
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterConfig[RecordType] extends js.Object {
  var columns: ColumnsType[RecordType]
  var dropdownPrefixCls: js.UndefOr[String] = js.undefined
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var prefixCls: String
  def onFilterChange(filters: Record[String, js.Array[Key] | Null], filterStates: js.Array[FilterState[RecordType]]): Unit
}

object FilterConfig {
  @scala.inline
  def apply[RecordType](
    columns: ColumnsType[RecordType],
    onFilterChange: (Record[String, js.Array[Key] | Null], js.Array[FilterState[RecordType]]) => Callback,
    prefixCls: String,
    dropdownPrefixCls: String = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null
  ): FilterConfig[RecordType] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.updateDynamic("onFilterChange")(js.Any.fromFunction2((t0: typingsJapgolly.std.Record[
  java.lang.String, 
  js.Array[typingsJapgolly.antd.tableInterfaceMod.Key] | scala.Null], t1: js.Array[typingsJapgolly.antd.useFilterMod.FilterState[RecordType]]) => onFilterChange(t0, t1).runNow()))
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    __obj.asInstanceOf[FilterConfig[RecordType]]
  }
}

