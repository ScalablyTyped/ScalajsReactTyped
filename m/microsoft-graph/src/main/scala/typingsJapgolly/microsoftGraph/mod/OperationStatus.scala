package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.NotStarted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Running
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Completed
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.Failed
*/
trait OperationStatus extends js.Object

object OperationStatus {
  @scala.inline
  def Completed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Completed = this.cast("Completed")
  @scala.inline
  def Failed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Failed = this.cast("Failed")
  @scala.inline
  def NotStarted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.NotStarted = this.cast("NotStarted")
  @scala.inline
  def Running: typingsJapgolly.microsoftGraph.microsoftGraphStrings.Running = this.cast("Running")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

