package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.notStarted_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.invalid
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notStarted_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamsAsyncOperationStatus extends js.Object

object TeamsAsyncOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def invalid: typingsJapgolly.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def succeeded: typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

