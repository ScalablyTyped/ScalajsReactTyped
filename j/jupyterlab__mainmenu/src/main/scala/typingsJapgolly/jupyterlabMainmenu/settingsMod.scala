package typingsJapgolly.jupyterlabMainmenu

import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.JupyterLabMenu
import typingsJapgolly.phosphorWidgets.menuMod.Menu.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mainmenu/lib/settings", JSImport.Namespace)
@js.native
object settingsMod extends js.Object {
  @js.native
  class SettingsMenu protected () extends JupyterLabMenu {
    /**
      * Construct the settings menu.
      */
    def this(options: IOptions) = this()
  }
  
  type ISettingsMenu = IJupyterLabMenu
}

