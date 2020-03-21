package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.truePositive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.falsePositive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.benignPositive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait AlertFeedback extends js.Object

object AlertFeedback {
  @scala.inline
  def benignPositive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.benignPositive = this.cast("benignPositive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def falsePositive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.falsePositive = this.cast("falsePositive")
  @scala.inline
  def truePositive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.truePositive = this.cast("truePositive")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

