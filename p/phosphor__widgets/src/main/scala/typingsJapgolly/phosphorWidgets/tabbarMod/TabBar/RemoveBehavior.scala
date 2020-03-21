package typingsJapgolly.phosphorWidgets.tabbarMod.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the selection behavior on tab remove.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.none
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.`select-tab-after`
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.`select-tab-before`
  - typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.`select-previous-tab`
*/
trait RemoveBehavior extends js.Object

object RemoveBehavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.none = this.cast("none")
  @scala.inline
  def `select-previous-tab`: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.`select-previous-tab` = this.cast("select-previous-tab")
  @scala.inline
  def `select-tab-after`: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.`select-tab-after` = this.cast("select-tab-after")
  @scala.inline
  def `select-tab-before`: typingsJapgolly.phosphorWidgets.phosphorWidgetsStrings.`select-tab-before` = this.cast("select-tab-before")
}

