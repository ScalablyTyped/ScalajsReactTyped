package typingsJapgolly.menubar.getWindowPositionMod

import typingsJapgolly.electron.mod.Tray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar/lib/util/getWindowPosition", "taskbarLocation")
@js.native
object taskbarLocation extends js.Object {
  def apply(tray: Tray): TaskbarLocation_ = js.native
}

