package typingsJapgolly.baseui.menuMod

import japgolly.scalajs.react.raw.React.Ref
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/menu", "NestedMenus")
@js.native
class NestedMenus ()
  extends Component[NestedMenuProps, NestedMenuState, js.Any] {
  def addMenuToNesting(ref: Ref): Unit = js.native
  def findMenuIndexByRef(ref: Ref): Double = js.native
  def getChildMenu(ref: Ref): Ref = js.native
  def getParentMenu(ref: Ref): Ref = js.native
  def removeMenuFromNesting(ref: Ref): Unit = js.native
}

