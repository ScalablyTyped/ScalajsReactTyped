package typingsJapgolly.antd.libMenuMenuItemMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.libLayoutSiderMod.SiderContextProps
import typingsJapgolly.react.reactMod.Component
import typingsJapgolly.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem
  extends Component[MenuItemProps, js.Object, js.Any] {
  var menuItem: js.Any = js.native
  def onKeyDown(e: ReactMouseEventFrom[HTMLElement]): Unit = js.native
  def renderItem(hasSiderCollapsed: SiderContextProps): Element = js.native
  def saveMenuItem(menuItem: this.type): Unit = js.native
}

