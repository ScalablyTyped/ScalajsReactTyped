package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.notStarted_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.running_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notStarted_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.running_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.complete
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait DataPolicyOperationStatus extends js.Object

object DataPolicyOperationStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.microsoftGraph.microsoftGraphStrings.complete = this.cast("complete")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def notStarted: notStarted_ = this.cast("notStarted")
  @scala.inline
  def running: running_ = this.cast("running")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

