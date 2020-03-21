package typingsJapgolly.phosphorWidgets.menuMod.Menu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for a menu item type.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.command
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.submenu
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.separator
*/
trait ItemType extends js.Object

object ItemType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def command: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.command = this.cast("command")
  @scala.inline
  def separator: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.separator = this.cast("separator")
  @scala.inline
  def submenu: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.submenu = this.cast("submenu")
}

