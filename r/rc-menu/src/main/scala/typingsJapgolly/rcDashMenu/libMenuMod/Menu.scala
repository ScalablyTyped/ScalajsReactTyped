package typingsJapgolly.rcDashMenu.libMenuMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.ComponentClassP
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDashMenu.Anon_GetWrappedInstanceSubPopupMenu
import typingsJapgolly.rcDashMenu.libInterfaceMod.MenuClickEventHandler
import typingsJapgolly.rcDashMenu.libInterfaceMod.MiniStore
import typingsJapgolly.rcDashMenu.libInterfaceMod.SelectInfo
import typingsJapgolly.rcDashMenu.libSubPopupMenuMod.SubPopupMenuProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menu
  extends Component[MenuProps, js.Object, js.Any] {
  var innerMenu: (ComponentClassP[SubPopupMenuProps with js.Object]) with Anon_GetWrappedInstanceSubPopupMenu = js.native
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

