package typingsJapgolly.jupyterlabMainmenu.runMod

import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsJapgolly.jupyterlabMainmenu.runMod.IRunMenu.ICodeRunner
import typingsJapgolly.phosphorWidgets.mod.Widget
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRunMenu_ extends IJupyterLabMenu {
  /**
    * A set storing ICodeRunner for the Run menu.
    *
    * ### Notes
    * The key for the set may be used in menu labels.
    */
  val codeRunners: Set[ICodeRunner[Widget]] = js.native
}

