package typingsJapgolly.rcMenu.menuMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcMenu.ComponentClassSubPopupMen
import typingsJapgolly.rcMenu.interfaceMod.MenuClickEventHandler
import typingsJapgolly.rcMenu.interfaceMod.MiniStore
import typingsJapgolly.rcMenu.interfaceMod.SelectInfo
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends Component[MenuProps, js.Object, js.Any] {
  var innerMenu: ComponentClassSubPopupMen = js.native
  var isRootMenu: Boolean = js.native
  var onClick: MenuClickEventHandler = js.native
  var store: MiniStore = js.native
  @JSName("componentDidMount")
  def componentDidMount_MMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMenu(): Unit = js.native
  def getOpenTransitionName(): String = js.native
  def onDeselect(selectInfo: SelectInfo): Unit = js.native
  def onKeyDown(e: ReactKeyboardEventFrom[HTMLElement], callback: js.Any): Unit = js.native
  def onOpenChange(event: js.Any): Unit = js.native
  def onSelect(selectInfo: SelectInfo): Unit = js.native
  def setInnerMenu(node: js.Any): Unit = js.native
  def updateMiniStore(): Unit = js.native
}

