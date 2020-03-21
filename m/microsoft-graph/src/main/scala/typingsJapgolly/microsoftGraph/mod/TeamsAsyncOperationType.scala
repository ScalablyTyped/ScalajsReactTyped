package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.invalid
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.cloneTeam
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.archiveTeam
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unarchiveTeam
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.createTeam
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait TeamsAsyncOperationType extends js.Object

object TeamsAsyncOperationType {
  @scala.inline
  def archiveTeam: typingsJapgolly.microsoftGraph.microsoftGraphStrings.archiveTeam = this.cast("archiveTeam")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cloneTeam: typingsJapgolly.microsoftGraph.microsoftGraphStrings.cloneTeam = this.cast("cloneTeam")
  @scala.inline
  def createTeam: typingsJapgolly.microsoftGraph.microsoftGraphStrings.createTeam = this.cast("createTeam")
  @scala.inline
  def invalid: typingsJapgolly.microsoftGraph.microsoftGraphStrings.invalid = this.cast("invalid")
  @scala.inline
  def unarchiveTeam: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unarchiveTeam = this.cast("unarchiveTeam")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

