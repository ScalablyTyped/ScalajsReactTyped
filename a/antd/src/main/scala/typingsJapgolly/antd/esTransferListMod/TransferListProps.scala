package typingsJapgolly.antd.esTransferListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.esTransferMod.RenderResult
import typingsJapgolly.antd.esTransferMod.TransferDirection
import typingsJapgolly.antd.esTransferMod.TransferItem
import typingsJapgolly.antd.esTransferRenderListBodyMod.TransferListBodyProps
import typingsJapgolly.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var body: js.UndefOr[js.Function1[/* props */ TransferListProps, Node]] = js.undefined
  var checkedKeys: js.Array[String]
  var dataSource: js.Array[TransferItem]
  var direction: TransferDirection
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, Node]] = js.undefined
  var itemUnit: String
  var itemsUnit: String
  var `lazy`: js.UndefOr[Boolean | js.Object] = js.undefined
  var notFoundContent: Node
  var onScroll: js.Function
  var prefixCls: String
  var render: js.UndefOr[js.Function1[/* item */ TransferItem, RenderResult]] = js.undefined
  var renderList: js.UndefOr[RenderListFunction] = js.undefined
  var searchPlaceholder: String
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleText: String
  def handleClear(): Unit
  def handleFilter(e: ReactEventFrom[HTMLInputElement]): Unit
  def handleSelect(selectedItem: TransferItem, checked: Boolean): Unit
  /** [Legacy] Only used when `body` prop used. */
  def handleSelectAll(dataSource: js.Array[TransferItem], checkAll: Boolean): Unit
  def onItemSelect(key: String, check: Boolean): Unit
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[String],
    dataSource: js.Array[TransferItem],
    direction: TransferDirection,
    handleClear: Callback,
    handleFilter: ReactEventFrom[HTMLInputElement] => Callback,
    handleSelect: (TransferItem, Boolean) => Callback,
    handleSelectAll: (js.Array[TransferItem], Boolean) => Callback,
    itemUnit: String,
    itemsUnit: String,
    onItemSelect: (String, Boolean) => Callback,
    onItemSelectAll: (js.Array[String], Boolean) => Callback,
    onScroll: js.Function,
    prefixCls: String,
    searchPlaceholder: String,
    titleText: String,
    body: /* props */ TransferListProps => CallbackTo[Node] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* filterText */ String, /* item */ TransferItem) => CallbackTo[Boolean] = null,
    footer: /* props */ TransferListProps => CallbackTo[Node] = null,
    `lazy`: Boolean | js.Object = null,
    notFoundContent: VdomNode = null,
    render: /* item */ TransferItem => CallbackTo[RenderResult] = null,
    renderList: /* props */ TransferListBodyProps => CallbackTo[Node] = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TransferListProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], onScroll = onScroll.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.updateDynamic("handleClear")(handleClear.toJsFn)
    __obj.updateDynamic("handleFilter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => handleFilter(t0).runNow()))
    __obj.updateDynamic("handleSelect")(js.Any.fromFunction2((t0: typingsJapgolly.antd.esTransferMod.TransferItem, t1: scala.Boolean) => handleSelect(t0, t1).runNow()))
    __obj.updateDynamic("handleSelectAll")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.antd.esTransferMod.TransferItem], t1: scala.Boolean) => handleSelectAll(t0, t1).runNow()))
    __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => onItemSelect(t0, t1).runNow()))
    __obj.updateDynamic("onItemSelectAll")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: scala.Boolean) => onItemSelectAll(t0, t1).runNow()))
    if (body != null) __obj.updateDynamic("body")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferListMod.TransferListProps) => body(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* filterText */ java.lang.String, t1: /* item */ typingsJapgolly.antd.esTransferMod.TransferItem) => filterOption(t0, t1).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferListMod.TransferListProps) => footer(t0).runNow()))
    if (`lazy` != null) __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.antd.esTransferMod.TransferItem) => render(t0).runNow()))
    if (renderList != null) __obj.updateDynamic("renderList")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.esTransferRenderListBodyMod.TransferListBodyProps) => renderList(t0).runNow()))
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListProps]
  }
}

