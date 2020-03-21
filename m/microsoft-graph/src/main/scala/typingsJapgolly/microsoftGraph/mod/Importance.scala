package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.low
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.normal
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
*/
trait Importance extends js.Object

object Importance {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def normal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.normal = this.cast("normal")
}

