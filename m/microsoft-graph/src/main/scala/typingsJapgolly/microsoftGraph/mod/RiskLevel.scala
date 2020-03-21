package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.low
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.hidden
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskLevel extends js.Object

object RiskLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hidden: typingsJapgolly.microsoftGraph.microsoftGraphStrings.hidden = this.cast("hidden")
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

