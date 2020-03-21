package typingsJapgolly.electron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron", "Tray")
@js.native
class Tray protected ()
  extends typingsJapgolly.electron.Electron.Tray {
  def this(image: String) = this()
  def this(image: typingsJapgolly.electron.Electron.NativeImage_) = this()
}

