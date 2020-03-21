package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.alwaysEnabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.scheduled
*/
trait AutomaticRepliesStatus extends js.Object

object AutomaticRepliesStatus {
  @scala.inline
  def alwaysEnabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.alwaysEnabled = this.cast("alwaysEnabled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def disabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def scheduled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.scheduled = this.cast("scheduled")
}

