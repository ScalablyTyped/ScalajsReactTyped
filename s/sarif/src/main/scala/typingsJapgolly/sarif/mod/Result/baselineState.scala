package typingsJapgolly.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.`new`
  - typingsJapgolly.sarif.sarifStrings.unchanged
  - typingsJapgolly.sarif.sarifStrings.updated
  - typingsJapgolly.sarif.sarifStrings.absent
*/
trait baselineState extends js.Object

object baselineState {
  @scala.inline
  def absent: typingsJapgolly.sarif.sarifStrings.absent = this.cast("absent")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `new`: typingsJapgolly.sarif.sarifStrings.`new` = this.cast("new")
  @scala.inline
  def unchanged: typingsJapgolly.sarif.sarifStrings.unchanged = this.cast("unchanged")
  @scala.inline
  def updated: typingsJapgolly.sarif.sarifStrings.updated = this.cast("updated")
}

