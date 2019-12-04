package typingsJapgolly.antd.libTransferListMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.Anon_FilteredItems
import typingsJapgolly.antd.antdNumbers.`false`
import typingsJapgolly.antd.antdStrings.all
import typingsJapgolly.antd.antdStrings.none
import typingsJapgolly.antd.antdStrings.part
import typingsJapgolly.antd.libTransferMod.TransferItem
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
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
  def getFilteredItems(dataSource: js.Array[TransferItem], filterValue: String): Anon_FilteredItems = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: Node,
    bodyDom: Node,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String]
  ): Node = js.native
  def getListBody(
    prefixCls: String,
    searchPlaceholder: String,
    filterValue: String,
    filteredItems: js.Array[TransferItem],
    notFoundContent: Node,
    bodyDom: Node,
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
    bodyDom: Node,
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
    bodyDom: Node,
    filteredRenderItems: js.Array[RenderedItem],
    checkedKeys: js.Array[String],
    renderList: RenderListFunction,
    showSearch: Boolean,
    disabled: Boolean
  ): Node = js.native
  def handleClear(): Unit = js.native
  def handleFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def matchFilter(text: String, item: TransferItem): Boolean = js.native
  def renderItem(item: TransferItem): RenderedItem = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTransferList(args: js.Any*): js.Any = js.native
}

