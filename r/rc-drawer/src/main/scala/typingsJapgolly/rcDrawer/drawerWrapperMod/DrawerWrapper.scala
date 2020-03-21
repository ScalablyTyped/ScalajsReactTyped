package typingsJapgolly.rcDrawer.drawerWrapperMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcDrawer.idrawerproptypesMod.IDrawerProps
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerWrapper
  extends Component[IDrawerProps, IState, js.Any] {
  var dom: HTMLElement | Null = js.native
  var onClose: js.Any = js.native
  var onHandleClick: js.Any = js.native
}

