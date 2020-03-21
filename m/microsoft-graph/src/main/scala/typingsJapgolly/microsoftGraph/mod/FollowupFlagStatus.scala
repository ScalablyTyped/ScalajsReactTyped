package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notFlagged
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.complete
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.flagged
*/
trait FollowupFlagStatus extends js.Object

object FollowupFlagStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typingsJapgolly.microsoftGraph.microsoftGraphStrings.complete = this.cast("complete")
  @scala.inline
  def flagged: typingsJapgolly.microsoftGraph.microsoftGraphStrings.flagged = this.cast("flagged")
  @scala.inline
  def notFlagged: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notFlagged = this.cast("notFlagged")
}

