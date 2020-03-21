package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ConnectionStatus extends js.Object

object ConnectionStatus {
  @scala.inline
  def attempted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempted = this.cast("attempted")
  @scala.inline
  def blocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def succeeded: typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded = this.cast("succeeded")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

