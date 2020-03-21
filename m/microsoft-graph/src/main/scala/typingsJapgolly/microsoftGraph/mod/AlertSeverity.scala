package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.informational
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.low
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertSeverity extends js.Object

object AlertSeverity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def informational: typingsJapgolly.microsoftGraph.microsoftGraphStrings.informational = this.cast("informational")
  @scala.inline
  def low: typingsJapgolly.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

