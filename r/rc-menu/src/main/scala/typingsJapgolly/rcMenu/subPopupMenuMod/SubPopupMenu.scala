package typingsJapgolly.rcMenu.subPopupMenuMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcMenu.AnonFocusable
import typingsJapgolly.rcMenu.interfaceMod.DestroyEventHandler
import typingsJapgolly.rcMenu.interfaceMod.HoverEventHandler
import typingsJapgolly.rcMenu.interfaceMod.MenuClickEventHandler
import typingsJapgolly.rcMenu.interfaceMod.OpenEventHandler
import typingsJapgolly.rcMenu.interfaceMod.SelectEventHandler
import typingsJapgolly.rcMenu.menuItemMod.MenuItem
import typingsJapgolly.rcMenu.menuItemMod.MenuItemProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-menu/lib/SubPopupMenu", "SubPopupMenu")
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
@JSImport("rc-menu/lib/SubPopupMenu", "SubPopupMenu")
@js.native
object SubPopupMenu extends js.Object {
  var defaultProps: AnonFocusable = js.native
}

