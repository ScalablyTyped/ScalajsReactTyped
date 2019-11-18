package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.esTransferListMod.TransferListProps
import typingsJapgolly.antd.esTransferMod.RenderResult
import typingsJapgolly.antd.esTransferMod.TransferDirection
import typingsJapgolly.antd.esTransferMod.TransferItem
import typingsJapgolly.antd.esTransferMod.TransferProps
import typingsJapgolly.antd.esTransferMod.default
import typingsJapgolly.antd.esTransferRenderListBodyMod.TransferListBodyProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transfer {
  def apply(
    dataSource: js.Array[TransferItem],
    body: /* props */ TransferListProps => CallbackTo[Node] = null,
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
    titles: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ TransferListBodyProps => CallbackTo[Node] = null
  ): UnmountedWithRoot[TransferProps, default, Unit, TransferProps] = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any])
  
      if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferRenderListBodyMod.TransferListBodyProps) => children(t0).runNow()))
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferListMod.TransferListProps) => body(t0).runNow()))
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.esTransferMod.TransferProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antd.esTransferMod.default](js.constructorOf[typingsJapgolly.antd.esTransferMod.default])
    f(__obj.asInstanceOf[typingsJapgolly.antd.esTransferMod.TransferProps])
  }
}

