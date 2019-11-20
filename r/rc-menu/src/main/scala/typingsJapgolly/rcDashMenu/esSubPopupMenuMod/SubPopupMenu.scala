package typingsJapgolly.rcDashMenu.esSubPopupMenuMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDashMenu.Anon_ClassName
import typingsJapgolly.rcDashMenu.esInterfaceMod.DestroyEventHandler
import typingsJapgolly.rcDashMenu.esInterfaceMod.HoverEventHandler
import typingsJapgolly.rcDashMenu.esInterfaceMod.MenuClickEventHandler
import typingsJapgolly.rcDashMenu.esInterfaceMod.OpenEventHandler
import typingsJapgolly.rcDashMenu.esInterfaceMod.SelectEventHandler
import typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItem
import typingsJapgolly.rcDashMenu.esMenuItemMod.MenuItemProps
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu")
@js.native
class SubPopupMenu protected ()
  extends Component[SubPopupMenuProps, js.Object, js.Any] {
  def this(props: SubPopupMenuProps) = this()
  var instanceArray: js.Array[MenuItem] = js.native
  var onClick: MenuClickEventHandler = js.native
  var onDeselect: SelectEventHandler = js.native
  var onDestroy: DestroyEventHandler = js.native
  var onItemHover: HoverEventHandler = js.native
  var onOpenChange: OpenEventHandler = js.native
  var onSelect: SelectEventHandler = js.native
  @JSName("componentDidMount")
  def componentDidMount_MSubPopupMenu(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSubPopupMenu(prevProps: SubPopupMenuProps): Unit = js.native
  def getFlatInstanceArray(): js.Array[MenuItem] = js.native
  /**
    * all keyboard events callbacks run from here at first
    *
    * note:
    *  This legacy code that `onKeyDown` is called by parent instead of dom self.
    *  which need return code to check if this event is handled
    */
  def onKeyDown(e: ReactKeyboardEventFrom[HTMLElement], callback: js.Function1[/* item */ MenuItem, Unit]): Double = js.native
  def renderCommonMenuItem(child: Element, i: Double, extraProps: MenuItemProps): Element = js.native
  def renderMenuItem(c: Element, i: Double, subMenuKey: String): Element = js.native
  def renderMenuItem(c: Element, i: Double, subMenuKey: Double): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MSubPopupMenu(nextProps: SubPopupMenuProps): Boolean = js.native
  def step(direction: Double): MenuItem = js.native
}

/* static members */
@JSImport("rc-menu/es/SubPopupMenu", "SubPopupMenu")
@js.native
object SubPopupMenu extends js.Object {
  var defaultProps: Anon_ClassName = js.native
}

