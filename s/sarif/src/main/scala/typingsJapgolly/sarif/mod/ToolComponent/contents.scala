package typingsJapgolly.sarif.mod.ToolComponent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.localizedData
  - typingsJapgolly.sarif.sarifStrings.nonLocalizedData
*/
trait contents extends js.Object

object contents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def localizedData: typingsJapgolly.sarif.sarifStrings.localizedData = this.cast("localizedData")
  @scala.inline
  def nonLocalizedData: typingsJapgolly.sarif.sarifStrings.nonLocalizedData = this.cast("nonLocalizedData")
}

