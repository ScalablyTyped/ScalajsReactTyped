package typingsJapgolly.antd.transferMod

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLUListElement
import typingsJapgolly.antd.AnonItemsUnitNotFoundContent
import typingsJapgolly.antd.AnonLeftDataSource
import typingsJapgolly.antd.AnonTitles
import typingsJapgolly.antd.antdStrings.sourceSelectedKeys
import typingsJapgolly.antd.antdStrings.targetSelectedKeys
import typingsJapgolly.antd.collapseCollapseMod.ExpandIconPosition
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transfer
  extends Component[TransferProps, js.Any, js.Any] {
  var separatedDataSource: AnonLeftDataSource | Null = js.native
  def getLocale(
    transferLocale: TransferLocale,
    renderEmpty: js.Function1[/* componentName */ js.UndefOr[String], Node]
  ): AnonTitles | AnonItemsUnitNotFoundContent = js.native
  def getSelectedKeysName(direction: TransferDirection): sourceSelectedKeys | targetSelectedKeys = js.native
  def getTitles(transferLocale: TransferLocale): js.Array[String] = js.native
  def handleClear(direction: ExpandIconPosition): Unit = js.native
  def handleFilter(direction: ExpandIconPosition, e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleLeftClear(): Unit = js.native
  def handleLeftFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleLeftScroll(e: ReactEventFrom[HTMLUListElement]): Unit = js.native
  def handleListStyle(listStyle: js.Function1[/* style */ ListStyle, CSSProperties], direction: ExpandIconPosition): CSSProperties = js.native
  def handleListStyle(listStyle: CSSProperties, direction: ExpandIconPosition): CSSProperties = js.native
  def handleRightClear(): Unit = js.native
  def handleRightFilter(e: ReactEventFrom[HTMLInputElement]): Unit = js.native
  def handleRightScroll(e: ReactEventFrom[HTMLUListElement]): Unit = js.native
  def handleScroll(direction: ExpandIconPosition, e: ReactEventFrom[HTMLUListElement]): Unit = js.native
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
  def separateDataSource(): AnonLeftDataSource = js.native
}

