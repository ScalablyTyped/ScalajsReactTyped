package typingsJapgolly.jupyterlabMainmenu.kernelMod

import typingsJapgolly.jupyterlabMainmenu.kernelMod.IKernelMenu.IKernelUser
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsJapgolly.phosphorWidgets.mod.Widget
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IKernelMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val kernelUsers: Set[IKernelUser[Widget]] = js.native
}

