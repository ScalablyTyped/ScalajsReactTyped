package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.success
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failure
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplied
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notEnabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AppliedConditionalAccessPolicyResult extends js.Object

object AppliedConditionalAccessPolicyResult {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failure: typingsJapgolly.microsoftGraph.microsoftGraphStrings.failure = this.cast("failure")
  @scala.inline
  def notApplied: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notApplied = this.cast("notApplied")
  @scala.inline
  def notEnabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notEnabled = this.cast("notEnabled")
  @scala.inline
  def success: typingsJapgolly.microsoftGraph.microsoftGraphStrings.success = this.cast("success")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

