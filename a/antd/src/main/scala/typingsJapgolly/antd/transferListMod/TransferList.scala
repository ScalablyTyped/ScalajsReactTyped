package typingsJapgolly.antd.transferListMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.AnonFilteredItems
import typingsJapgolly.antd.antdBooleans.`false`
import typingsJapgolly.antd.antdStrings.all
import typingsJapgolly.antd.antdStrings.none
import typingsJapgolly.antd.antdStrings.part
import typingsJapgolly.antd.transferMod.TransferItem
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferList
  extends Component[TransferListProps, TransferListState, js.Any] {
  var timer: Double = js.native
  var triggerScrollTimer: Double = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MTransferList(): Unit = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit]
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean
  ): `false` | Element = js.native
  def getCheckBox(
    filteredItems: js.Array[TransferItem],
    onItemSelectAll: js.Function2[/* dataSource */ js.Array[String], /* checkAll */ Boolean, Unit],
    showSelectAll: Boolean,
    disabled: Boolean
  ): `false` | Element = js.native
  def getCheckStatus(filteredItems: js.Array[TransferItem]): none | all | part = js.native
  def getFilteredItems(dataSource: js.Array[TransferItem], filterValue: String): AnonFilteredItems = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: Node,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String]
  ): Node = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: Node,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction
  ): Node = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: Node,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean
  ): Node = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: Node,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean,
    disabled: Boolean
  ): Node = js.native
  def getSelectAllLabel(selectedCount: Double, totalCount: Double): Node = js.native
  def handleClear(): Unit = js.native
  def handleFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def matchFilter(text: String, item: TransferItem): Boolean = js.native
  def renderItem(item: TransferItem): RenderedItem = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransferList(args: js.Any*): js.Any = js.native
}

