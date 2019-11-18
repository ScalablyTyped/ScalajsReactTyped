package typingsJapgolly.antd.esTableInterfaceMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuProps[T] extends js.Object {
  var column: ColumnProps[T]
  var dropdownPrefixCls: String
  var getPopupContainer: js.UndefOr[GetPopupContainer] = js.undefined
  var locale: TableLocale
  var prefixCls: String
  var selectedKeys: js.Array[String]
  def confirmFilter(column: ColumnProps[T], selectedKeys: js.Array[Key]): js.Any
}

object FilterMenuProps {
  @scala.inline
  def apply[T](
    column: ColumnProps[T],
    confirmFilter: (ColumnProps[T], js.Array[Key]) => CallbackTo[js.Any],
    dropdownPrefixCls: String,
    locale: TableLocale,
    prefixCls: String,
    selectedKeys: js.Array[String],
    getPopupContainer: /* triggerNode */ js.UndefOr[HTMLElement] => CallbackTo[HTMLElement] = null
  ): FilterMenuProps[T] = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dropdownPrefixCls = dropdownPrefixCls.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("confirmFilter")(js.Any.fromFunction2((t0: typingsJapgolly.antd.esTableInterfaceMod.ColumnProps[T], t1: js.Array[typingsJapgolly.react.reactMod.Key]) => confirmFilter(t0, t1).runNow()))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ js.UndefOr[org.scalajs.dom.raw.HTMLElement]) => getPopupContainer(t0).runNow()))
    __obj.asInstanceOf[FilterMenuProps[T]]
  }
}

