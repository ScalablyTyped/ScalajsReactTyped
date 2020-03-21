package typingsJapgolly.baseui.sideNavigationMod

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/side-navigation", "NavItem")
@js.native
class NavItem ()
  extends Component[NavItemProps, js.Object, js.Any] {
  def handleClick(event: ReactMouseEventFrom[Element]): Unit = js.native
  def handleKeyDown(event: ReactKeyboardEventFrom[Element]): Unit = js.native
}

