package typingsJapgolly.menubar.mod

import typingsJapgolly.electron.mod.Tray
import typingsJapgolly.menubar.getWindowPositionMod.TaskbarLocation_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("menubar", "taskbarLocation")
@js.native
object taskbarLocation extends js.Object {
  def apply(tray: Tray): TaskbarLocation_ = js.native
}

