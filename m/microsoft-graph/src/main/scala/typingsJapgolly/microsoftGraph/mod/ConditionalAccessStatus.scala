package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.success
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failure
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplied
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConditionalAccessStatus extends js.Object

object ConditionalAccessStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsJapgolly.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def success: typingsJapgolly.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

