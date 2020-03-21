package typingsJapgolly.menubar.mod

import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.menubar.getWindowPositionMod.WindowPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", "getWindowPosition")
@js.native
object getWindowPosition extends js.Object {
  def apply(tray: Tray): WindowPosition = js.native
}

