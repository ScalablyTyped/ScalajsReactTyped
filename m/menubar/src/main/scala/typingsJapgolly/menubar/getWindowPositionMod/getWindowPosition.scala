package typingsJapgolly.menubar.getWindowPositionMod

import typingsJapgolly.electron.mod.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar/lib/util/getWindowPosition", "getWindowPosition")
@js.native
object getWindowPosition extends js.Object {
  def apply(tray: Tray): WindowPosition = js.native
}

