package typingsJapgolly.rcMenu.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcMenu.rcMenuStrings.horizontal
  - typingsJapgolly.rcMenu.rcMenuStrings.vertical
  - typingsJapgolly.rcMenu.rcMenuStrings.`vertical-left`
  - typingsJapgolly.rcMenu.rcMenuStrings.`vertical-right`
  - typingsJapgolly.rcMenu.rcMenuStrings.`inline`
*/
trait MenuMode extends js.Object

object MenuMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def horizontal: typingsJapgolly.rcMenu.rcMenuStrings.horizontal = this.cast("horizontal")
  @scala.inline
  def `inline`: typingsJapgolly.rcMenu.rcMenuStrings.`inline` = this.cast("inline")
  @scala.inline
  def vertical: typingsJapgolly.rcMenu.rcMenuStrings.vertical = this.cast("vertical")
  @scala.inline
  def `vertical-left`: typingsJapgolly.rcMenu.rcMenuStrings.`vertical-left` = this.cast("vertical-left")
  @scala.inline
  def `vertical-right`: typingsJapgolly.rcMenu.rcMenuStrings.`vertical-right` = this.cast("vertical-right")
}

