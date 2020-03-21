package typingsJapgolly.antd.transferMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.antd.PartialTransferLocale
import typingsJapgolly.antd.renderListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.transferListMod.TransferListProps
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps, Node]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.Array[TransferItem]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, Node]] = js.undefined
  var listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties
  var locale: js.UndefOr[PartialTransferLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* targetKeys */ js.Array[String], 
      /* direction */ String, 
      /* moveKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    js.Function2[/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLUListElement], Unit]
  ] = js.undefined
  var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.undefined
  var onSelectChange: js.UndefOr[
    js.Function2[
      /* sourceSelectedKeys */ js.Array[String], 
      /* targetSelectedKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var operationStyle: js.UndefOr[CSSProperties] = js.undefined
  var operations: js.UndefOr[js.Array[String]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[TransferRender] = js.undefined
  var rowKey: js.UndefOr[js.Function1[/* record */ TransferItem, String]] = js.undefined
  var selectAllLabels: js.UndefOr[js.Array[SelectAllLabel]] = js.undefined
  var selectedKeys: js.UndefOr[js.Array[String]] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var targetKeys: js.UndefOr[js.Array[String]] = js.undefined
  var titles: js.UndefOr[js.Array[String]] = js.undefined
}

object TransferProps {
  @scala.inline
  def apply(
    dataSource: js.Array[TransferItem],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties,
    children: /* props */ TransferListBodyProps => CallbackTo[Node] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* inputValue */ String, /* item */ TransferItem) => CallbackTo[Boolean] = null,
    footer: /* props */ TransferListProps => CallbackTo[Node] = null,
    locale: PartialTransferLocale = null,
    onChange: (/* targetKeys */ js.Array[String], /* direction */ String, /* moveKeys */ js.Array[String]) => Callback = null,
    onScroll: (/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLUListElement]) => Callback = null,
    onSearch: (/* direction */ TransferDirection, /* value */ String) => Callback = null,
    onSelectChange: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Callback = null,
    operationStyle: CSSProperties = null,
    operations: js.Array[String] = null,
    prefixCls: String = null,
    render: /* item */ TransferItem => CallbackTo[RenderResult] = null,
    rowKey: /* record */ TransferItem => CallbackTo[String] = null,
    selectAllLabels: js.Array[SelectAllLabel] = null,
    selectedKeys: js.Array[String] = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetKeys: js.Array[String] = null,
    titles: js.Array[String] = null
  ): TransferProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], listStyle = listStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.renderListBodyMod.TransferListBodyProps) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* inputValue */ java.lang.String, t1: /* item */ typingsJapgolly.antd.transferMod.TransferItem) => filterOption(t0, t1).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.transferListMod.TransferListProps) => footer(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* targetKeys */ js.Array[java.lang.String], t1: /* direction */ java.lang.String, t2: /* moveKeys */ js.Array[java.lang.String]) => onChange(t0, t1, t2).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2((t0: /* direction */ typingsJapgolly.antd.transferMod.TransferDirection, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLUListElement]) => onScroll(t0, t1).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2((t0: /* direction */ typingsJapgolly.antd.transferMod.TransferDirection, t1: /* value */ java.lang.String) => onSearch(t0, t1).runNow()))
    if (onSelectChange != null) __obj.updateDynamic("onSelectChange")(js.Any.fromFunction2((t0: /* sourceSelectedKeys */ js.Array[java.lang.String], t1: /* targetSelectedKeys */ js.Array[java.lang.String]) => onSelectChange(t0, t1).runNow()))
    if (operationStyle != null) __obj.updateDynamic("operationStyle")(operationStyle.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.antd.transferMod.TransferItem) => render(t0).runNow()))
    if (rowKey != null) __obj.updateDynamic("rowKey")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.antd.transferMod.TransferItem) => rowKey(t0).runNow()))
    if (selectAllLabels != null) __obj.updateDynamic("selectAllLabels")(selectAllLabels.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetKeys != null) __obj.updateDynamic("targetKeys")(targetKeys.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProps]
  }
}

