package typingsJapgolly.antd.libPaginationPaginationMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antd.Anon_GoButton
import typingsJapgolly.antd.antdStrings.`jump-next`
import typingsJapgolly.antd.antdStrings.`jump-prev`
import typingsJapgolly.antd.antdStrings.both
import typingsJapgolly.antd.antdStrings.bottom
import typingsJapgolly.antd.antdStrings.next
import typingsJapgolly.antd.antdStrings.page
import typingsJapgolly.antd.antdStrings.prev
import typingsJapgolly.antd.antdStrings.top
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationConfig extends PaginationProps {
  var position: js.UndefOr[top | bottom | both] = js.undefined
}

object PaginationConfig {
  @scala.inline
  def apply(
    className: String = null,
    current: Int | Double = null,
    defaultCurrent: Int | Double = null,
    defaultPageSize: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideOnSinglePage: js.UndefOr[Boolean] = js.undefined,
    itemRender: (/* page */ Double, /* type */ page | prev | next | `jump-prev` | `jump-next`, /* originalElement */ Element) => CallbackTo[Node] = null,
    locale: js.Object = null,
    onChange: (/* page */ Double, /* pageSize */ js.UndefOr[Double]) => Callback = null,
    onShowSizeChange: (/* current */ Double, /* size */ Double) => Callback = null,
    pageSize: Int | Double = null,
    pageSizeOptions: js.Array[String] = null,
    position: top | bottom | both = null,
    prefixCls: String = null,
    role: String = null,
    selectPrefixCls: String = null,
    showLessItems: js.UndefOr[Boolean] = js.undefined,
    showQuickJumper: Boolean | Anon_GoButton = null,
    showSizeChanger: js.UndefOr[Boolean] = js.undefined,
    showTotal: (/* total */ Double, /* range */ js.Tuple2[Double, Double]) => CallbackTo[Node] = null,
    simple: js.UndefOr[Boolean] = js.undefined,
    size: String = null,
    style: CSSProperties = null,
    total: Int | Double = null
  ): PaginationConfig = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (defaultCurrent != null) __obj.updateDynamic("defaultCurrent")(defaultCurrent.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideOnSinglePage)) __obj.updateDynamic("hideOnSinglePage")(hideOnSinglePage.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction3((t0: /* page */ scala.Double, t1: /* type */ typingsJapgolly.antd.antdStrings.page | typingsJapgolly.antd.antdStrings.prev | typingsJapgolly.antd.antdStrings.next | typingsJapgolly.antd.antdStrings.`jump-prev` | typingsJapgolly.antd.antdStrings.`jump-next`, t2: /* originalElement */ japgolly.scalajs.react.raw.React.Element) => itemRender(t0, t1, t2).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* page */ scala.Double, t1: /* pageSize */ js.UndefOr[scala.Double]) => onChange(t0, t1).runNow()))
    if (onShowSizeChange != null) __obj.updateDynamic("onShowSizeChange")(js.Any.fromFunction2((t0: /* current */ scala.Double, t1: /* size */ scala.Double) => onShowSizeChange(t0, t1).runNow()))
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizeOptions != null) __obj.updateDynamic("pageSizeOptions")(pageSizeOptions.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (selectPrefixCls != null) __obj.updateDynamic("selectPrefixCls")(selectPrefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showLessItems)) __obj.updateDynamic("showLessItems")(showLessItems.asInstanceOf[js.Any])
    if (showQuickJumper != null) __obj.updateDynamic("showQuickJumper")(showQuickJumper.asInstanceOf[js.Any])
    if (!js.isUndefined(showSizeChanger)) __obj.updateDynamic("showSizeChanger")(showSizeChanger.asInstanceOf[js.Any])
    if (showTotal != null) __obj.updateDynamic("showTotal")(js.Any.fromFunction2((t0: /* total */ scala.Double, t1: /* range */ js.Tuple2[scala.Double, scala.Double]) => showTotal(t0, t1).runNow()))
    if (!js.isUndefined(simple)) __obj.updateDynamic("simple")(simple.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationConfig]
  }
}

