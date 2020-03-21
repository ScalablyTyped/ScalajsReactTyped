package typingsJapgolly.sarif.mod.ThreadFlowLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.important
  - typingsJapgolly.sarif.sarifStrings.essential
  - typingsJapgolly.sarif.sarifStrings.unimportant
*/
trait importance extends js.Object

object importance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def essential: typingsJapgolly.sarif.sarifStrings.essential = this.cast("essential")
  @scala.inline
  def important: typingsJapgolly.sarif.sarifStrings.important = this.cast("important")
  @scala.inline
  def unimportant: typingsJapgolly.sarif.sarifStrings.unimportant = this.cast("unimportant")
}

