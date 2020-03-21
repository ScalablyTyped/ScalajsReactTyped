package typingsJapgolly.electronWindowState.mod

import typingsJapgolly.electronWindowState.mod.ElectronWindowState.WindowState
import typingsJapgolly.electronWindowState.mod.ElectronWindowState.WindowStateKeeperOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-window-state", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /*
    * Load the previous state with fallback to defaults
    */
  def apply(opts: WindowStateKeeperOptions): WindowState = js.native
}

