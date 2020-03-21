package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.antd.PartialTransferLocale
import typingsJapgolly.antd.renderListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.transferListMod.TransferListProps
import typingsJapgolly.antd.transferMod.ListStyle
import typingsJapgolly.antd.transferMod.RenderResult
import typingsJapgolly.antd.transferMod.SelectAllLabel
import typingsJapgolly.antd.transferMod.TransferDirection
import typingsJapgolly.antd.transferMod.TransferItem
import typingsJapgolly.antd.transferMod.TransferProps
import typingsJapgolly.antd.transferMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transfer {
  def apply(
    dataSource: js.Array[TransferItem],
    listStyle: (js.Function1[/* style */ ListStyle, CSSProperties]) | CSSProperties,
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
    titles: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* props */ TransferListBodyProps => CallbackTo[Node] = null
  ): UnmountedWithRoot[TransferProps, default, Unit, TransferProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.transferMod.TransferProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.antd.transferMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.transferMod.TransferProps])
  }
  @JSImport("antd/lib/transfer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

