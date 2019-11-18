package typingsJapgolly.antd.esTransferMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.esTransferListMod.TransferListProps
import typingsJapgolly.antd.esTransferRenderListBodyMod.TransferListBodyProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, Node]] = js.undefined
  var children: js.UndefOr[js.Function1[/* props */ TransferListBodyProps, Node]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.Array[TransferItem]
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* inputValue */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, Node]] = js.undefined
  var `lazy`: js.UndefOr[js.Object | Boolean] = js.undefined
  var listStyle: js.UndefOr[CSSProperties] = js.undefined
  var locale: js.UndefOr[js.Object] = js.undefined
  var notFoundContent: js.UndefOr[Node] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* targetKeys */ js.Array[String], 
      /* direction */ String, 
      /* moveKeys */ js.Array[String], 
      Unit
    ]
  ] = js.undefined
  var onScroll: js.UndefOr[
    js.Function2[/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLDivElement], Unit]
  ] = js.undefined
  var onSearch: js.UndefOr[js.Function2[/* direction */ TransferDirection, /* value */ String, Unit]] = js.undefined
  var onSearchChange: js.UndefOr[
    js.Function2[/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLInputElement], Unit]
  ] = js.undefined
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
  var searchPlaceholder: js.UndefOr[String] = js.undefined
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
    body: /* props */ TransferListProps => CallbackTo[Node] = null,
    children: /* props */ TransferListBodyProps => CallbackTo[Node] = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* inputValue */ String, /* item */ TransferItem) => CallbackTo[Boolean] = null,
    footer: /* props */ TransferListProps => CallbackTo[Node] = null,
    `lazy`: js.Object | Boolean = null,
    listStyle: CSSProperties = null,
    locale: js.Object = null,
    notFoundContent: VdomNode = null,
    onChange: (/* targetKeys */ js.Array[String], /* direction */ String, /* moveKeys */ js.Array[String]) => Callback = null,
    onScroll: (/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLDivElement]) => Callback = null,
    onSearch: (/* direction */ TransferDirection, /* value */ String) => Callback = null,
    onSearchChange: (/* direction */ TransferDirection, /* e */ ReactEventFrom[HTMLInputElement]) => Callback = null,
    onSelectChange: (/* sourceSelectedKeys */ js.Array[String], /* targetSelectedKeys */ js.Array[String]) => Callback = null,
    operationStyle: CSSProperties = null,
    operations: js.Array[String] = null,
    prefixCls: String = null,
    render: /* item */ TransferItem => CallbackTo[RenderResult] = null,
    rowKey: /* record */ TransferItem => CallbackTo[String] = null,
    searchPlaceholder: String = null,
    selectedKeys: js.Array[String] = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetKeys: js.Array[String] = null,
    titles: js.Array[String] = null
  ): TransferProps = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferListMod.TransferListProps) => body(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferRenderListBodyMod.TransferListBodyProps) => children(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* inputValue */ java.lang.String, t1: /* item */ typingsJapgolly.antd.esTransferMod.TransferItem) => filterOption(t0, t1).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferListMod.TransferListProps) => footer(t0).runNow()))
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (listStyle != null) __obj.updateDynamic("listStyle")(listStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* targetKeys */ js.Array[java.lang.String], t1: /* direction */ java.lang.String, t2: /* moveKeys */ js.Array[java.lang.String]) => onChange(t0, t1, t2).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction2((t0: /* direction */ typingsJapgolly.antd.esTransferMod.TransferDirection, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onScroll(t0, t1).runNow()))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction2((t0: /* direction */ typingsJapgolly.antd.esTransferMod.TransferDirection, t1: /* value */ java.lang.String) => onSearch(t0, t1).runNow()))
    if (onSearchChange != null) __obj.updateDynamic("onSearchChange")(js.Any.fromFunction2((t0: /* direction */ typingsJapgolly.antd.esTransferMod.TransferDirection, t1: /* e */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onSearchChange(t0, t1).runNow()))
    if (onSelectChange != null) __obj.updateDynamic("onSelectChange")(js.Any.fromFunction2((t0: /* sourceSelectedKeys */ js.Array[java.lang.String], t1: /* targetSelectedKeys */ js.Array[java.lang.String]) => onSelectChange(t0, t1).runNow()))
    if (operationStyle != null) __obj.updateDynamic("operationStyle")(operationStyle.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.antd.esTransferMod.TransferItem) => render(t0).runNow()))
    if (rowKey != null) __obj.updateDynamic("rowKey")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.antd.esTransferMod.TransferItem) => rowKey(t0).runNow()))
    if (searchPlaceholder != null) __obj.updateDynamic("searchPlaceholder")(searchPlaceholder.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetKeys != null) __obj.updateDynamic("targetKeys")(targetKeys.asInstanceOf[js.Any])
    if (titles != null) __obj.updateDynamic("titles")(titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferProps]
  }
}

