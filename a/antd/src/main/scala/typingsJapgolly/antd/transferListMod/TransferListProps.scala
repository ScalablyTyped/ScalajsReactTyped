package typingsJapgolly.antd.transferListMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactUIEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.antd.renderListBodyMod.TransferListBodyProps
import typingsJapgolly.antd.transferMod.RenderResult
import typingsJapgolly.antd.transferMod.SelectAllLabel
import typingsJapgolly.antd.transferMod.TransferDirection
import typingsJapgolly.antd.transferMod.TransferItem
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferListProps extends js.Object {
  var checkedKeys: js.Array[String]
  var dataSource: js.Array[TransferItem]
  var direction: TransferDirection
  var disabled: js.UndefOr[Boolean] = js.undefined
  var filterOption: js.UndefOr[js.Function2[/* filterText */ String, /* item */ TransferItem, Boolean]] = js.undefined
  var footer: js.UndefOr[js.Function1[/* props */ TransferListProps, Node]] = js.undefined
  var itemUnit: String
  var itemsUnit: String
  var notFoundContent: Node
  var prefixCls: String
  var render: js.UndefOr[js.Function1[/* item */ TransferItem, RenderResult]] = js.undefined
  var renderList: js.UndefOr[RenderListFunction] = js.undefined
  var searchPlaceholder: String
  var selectAllLabel: js.UndefOr[SelectAllLabel] = js.undefined
  var showSearch: js.UndefOr[Boolean] = js.undefined
  var showSelectAll: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var titleText: String
  def handleClear(): Unit
  def handleFilter(e: ReactEventFrom[HTMLInputElement]): Unit
  def onItemSelect(key: String, check: Boolean): Unit
  def onItemSelectAll(dataSource: js.Array[String], checkAll: Boolean): Unit
  def onScroll(e: ReactUIEventFrom[HTMLUListElement]): Unit
}

object TransferListProps {
  @scala.inline
  def apply(
    checkedKeys: js.Array[String],
    dataSource: js.Array[TransferItem],
    direction: TransferDirection,
    handleClear: Callback,
    handleFilter: ReactEventFrom[HTMLInputElement] => Callback,
    itemUnit: String,
    itemsUnit: String,
    onItemSelect: (String, Boolean) => Callback,
    onItemSelectAll: (js.Array[String], Boolean) => Callback,
    onScroll: ReactUIEventFrom[HTMLUListElement] => Callback,
    prefixCls: String,
    searchPlaceholder: String,
    titleText: String,
    disabled: js.UndefOr[Boolean] = js.undefined,
    filterOption: (/* filterText */ String, /* item */ TransferItem) => CallbackTo[Boolean] = null,
    footer: /* props */ TransferListProps => CallbackTo[Node] = null,
    notFoundContent: VdomNode = null,
    render: /* item */ TransferItem => CallbackTo[RenderResult] = null,
    renderList: /* props */ TransferListBodyProps => CallbackTo[Node] = null,
    selectAllLabel: SelectAllLabel = null,
    showSearch: js.UndefOr[Boolean] = js.undefined,
    showSelectAll: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): TransferListProps = {
    val __obj = js.Dynamic.literal(checkedKeys = checkedKeys.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.updateDynamic("handleClear")(handleClear.toJsFn)
    __obj.updateDynamic("handleFilter")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => handleFilter(t0).runNow()))
    __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => onItemSelect(t0, t1).runNow()))
    __obj.updateDynamic("onItemSelectAll")(js.Any.fromFunction2((t0: js.Array[java.lang.String], t1: scala.Boolean) => onItemSelectAll(t0, t1).runNow()))
    __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactUIEventFrom[org.scalajs.dom.raw.HTMLUListElement]) => onScroll(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2((t0: /* filterText */ java.lang.String, t1: /* item */ typingsJapgolly.antd.transferMod.TransferItem) => filterOption(t0, t1).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.transferListMod.TransferListProps) => footer(t0).runNow()))
    if (notFoundContent != null) __obj.updateDynamic("notFoundContent")(notFoundContent.rawNode.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* item */ typingsJapgolly.antd.transferMod.TransferItem) => render(t0).runNow()))
    if (renderList != null) __obj.updateDynamic("renderList")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.renderListBodyMod.TransferListBodyProps) => renderList(t0).runNow()))
    if (selectAllLabel != null) __obj.updateDynamic("selectAllLabel")(selectAllLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showSearch)) __obj.updateDynamic("showSearch")(showSearch.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectAll)) __obj.updateDynamic("showSelectAll")(showSelectAll.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferListProps]
  }
}

