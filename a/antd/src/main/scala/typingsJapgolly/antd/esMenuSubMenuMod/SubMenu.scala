package typingsJapgolly.antd.esMenuSubMenuMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubMenu
  extends Component[SubMenuProps, js.Any, js.Any] {
  var subMenu: js.Any = js.native
  def onKeyDown(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def saveSubMenu(subMenu: js.Any): Unit = js.native
}

