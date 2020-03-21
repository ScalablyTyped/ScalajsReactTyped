package typingsJapgolly.jupyterlabMainmenu.fileMod

import typingsJapgolly.jupyterlabMainmenu.fileMod.IFileMenu.ICloseAndCleaner
import typingsJapgolly.jupyterlabMainmenu.fileMod.IFileMenu.IConsoleCreator
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsJapgolly.phosphorWidgets.mod.Widget
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileMenu_ extends IJupyterLabMenu {
  /**
    * The close and cleanup extension point.
    */
  val closeAndCleaners: Set[ICloseAndCleaner[Widget]] = js.native
  /**
    * A set storing IConsoleCreators for the File menu.
    */
  val consoleCreators: Set[IConsoleCreator[Widget]] = js.native
  /**
    * A submenu for creating new files/launching new activities.
    */
  val newMenu: IJupyterLabMenu = js.native
  /**
    * Option to add a `Quit` entry in the File menu
    */
  var quitEntry: Boolean = js.native
}

