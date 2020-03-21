package typingsJapgolly.jupyterlabMainmenu.editMod

import typingsJapgolly.jupyterlabMainmenu.editMod.IEditMenu.IClearer
import typingsJapgolly.jupyterlabMainmenu.editMod.IEditMenu.IGoToLiner
import typingsJapgolly.jupyterlabMainmenu.editMod.IEditMenu.IUndoer
import typingsJapgolly.jupyterlabMainmenu.labmenuMod.IJupyterLabMenu
import typingsJapgolly.phosphorWidgets.mod.Widget
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditMenu_ extends IJupyterLabMenu {
  /**
    * A set storing IClearers for the Edit menu.
    */
  val clearers: Set[IClearer[Widget]] = js.native
  /**
    * A set storing IGoToLiners for the Edit menu.
    */
  val goToLiners: Set[IGoToLiner[Widget]] = js.native
  /**
    * A set storing IUndoers for the Edit menu.
    */
  val undoers: Set[IUndoer[Widget]] = js.native
}

