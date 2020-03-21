package typingsJapgolly.jupyterlabMainmenu.viewMod

import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsJapgolly.jupyterlabMainmenu.viewMod.IViewMenu.IEditorViewer
import typingsJapgolly.phosphorWidgets.mod.Widget
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IKernelUsers for the Kernel menu.
    */
  val editorViewers: Set[IEditorViewer[Widget]] = js.native
}

