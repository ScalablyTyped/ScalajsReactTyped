package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.newAlert
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.resolved
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.dismissed
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertStatus extends js.Object

object AlertStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dismissed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def inProgress: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress = this.cast("inProgress")
  @scala.inline
  def newAlert: typingsJapgolly.microsoftGraph.microsoftGraphStrings.newAlert = this.cast("newAlert")
  @scala.inline
  def resolved: typingsJapgolly.microsoftGraph.microsoftGraphStrings.resolved = this.cast("resolved")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

