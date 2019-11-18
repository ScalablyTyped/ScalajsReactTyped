package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownProps extends js.Object {
  var clearFilters: js.UndefOr[js.Function1[/* selectedKeys */ js.Array[String], Unit]] = js.undefined
  var confirm: js.UndefOr[js.Function0[Unit]] = js.undefined
  var filters: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  var setSelectedKeys: js.UndefOr[js.Function1[/* selectedKeys */ js.Array[String], Unit]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object FilterDropdownProps {
  @scala.inline
  def apply(
    clearFilters: /* selectedKeys */ js.Array[String] => Callback = null,
    confirm: js.UndefOr[Callback] = js.undefined,
    filters: js.Array[ColumnFilterItem] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    prefixCls: String = null,
    selectedKeys: js.Array[Key] = null,
    setSelectedKeys: /* selectedKeys */ js.Array[String] => Callback = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): FilterDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (clearFilters != null) __obj.updateDynamic("clearFilters")(js.Any.fromFunction1((t0: /* selectedKeys */ js.Array[java.lang.String]) => clearFilters(t0).runNow()))
    confirm.foreach(p => __obj.updateDynamic("confirm")(p.toJsFn))
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (setSelectedKeys != null) __obj.updateDynamic("setSelectedKeys")(js.Any.fromFunction1((t0: /* selectedKeys */ js.Array[java.lang.String]) => setSelectedKeys(t0).runNow()))
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropdownProps]
  }
}

