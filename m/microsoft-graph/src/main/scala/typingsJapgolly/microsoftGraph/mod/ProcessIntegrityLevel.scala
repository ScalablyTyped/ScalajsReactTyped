package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.untrusted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.low
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.system
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait ProcessIntegrityLevel extends js.Object

object ProcessIntegrityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def system: typingsJapgolly.microsoftGraph.microsoftGraphStrings.system = this.cast("system")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
  @scala.inline
  def untrusted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.untrusted = this.cast("untrusted")
}

