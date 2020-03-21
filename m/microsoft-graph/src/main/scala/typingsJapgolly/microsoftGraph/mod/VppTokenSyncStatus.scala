package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.completed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.completed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
*/
trait VppTokenSyncStatus extends js.Object

object VppTokenSyncStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def completed: completed_ = this.cast("completed")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def inProgress: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def none: none_ = this.cast("none")
}

