package typingsJapgolly.antd.esTransferMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.antd.Anon_ItemUnit
import typingsJapgolly.antd.Anon_LeftDataSource
import typingsJapgolly.antd.antdStrings.sourceSelectedKeys
import typingsJapgolly.antd.antdStrings.targetSelectedKeys
import typingsJapgolly.antd.esCollapseCollapseMod.ExpandIconPosition
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: Anon_LeftDataSource | Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], Node]
  ): Anon_ItemUnit = js.native
  def getSelectedKeysName(direction: TransferDirection): sourceSelectedKeys | targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  def handleClear(direction: ExpandIconPosition): Unit = js.native
  def handleFilter(direction: ExpandIconPosition, e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleLeftClear(): Unit = js.native
  def handleLeftFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleLeftScroll(e: ReactEventFrom[HTMLDivElement]): Unit = js.native
  def handleLeftSelect(selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleLeftSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleRightClear(): Unit = js.native
  def handleRightFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleRightScroll(e: ReactEventFrom[HTMLDivElement]): Unit = js.native
  def handleRightSelect(selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleRightSelectAll(filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleScroll(direction: ExpandIconPosition, e: ReactEventFrom[HTMLDivElement]): Unit = js.native
  def handleSelect(direction: ExpandIconPosition, selectedItem: TransferItem, checked: Boolean): Unit = js.native
  def handleSelectAll(direction: ExpandIconPosition, filteredDataSource: js.Array[TransferItem], checkAll: Boolean): Unit = js.native
  def handleSelectChange(direction: TransferDirection, holder: js.Array[String]): Unit = js.native
  def moveTo(direction: ExpandIconPosition): Unit = js.native
  def moveToLeft(): Unit = js.native
  def moveToRight(): Unit = js.native
  def onItemSelect(direction: ExpandIconPosition, selectedKey: String, checked: Boolean): Unit = js.native
  def onItemSelectAll(direction: ExpandIconPosition, selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onLeftItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onLeftItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def onRightItemSelect(selectedKey: String, checked: Boolean): Unit = js.native
  def onRightItemSelectAll(selectedKeys: js.Array[String], checkAll: Boolean): Unit = js.native
  def renderTransfer(transferLocale: TransferLocale): Element = js.native
  def separateDataSource(): Anon_LeftDataSource = js.native
}

