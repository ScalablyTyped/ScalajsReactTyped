package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.confirmedSafe
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.remediated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.dismissed
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.atRisk
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.confirmedCompromised
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RiskState extends js.Object

object RiskState {
  @scala.inline
  def atRisk: typingsJapgolly.microsoftGraph.microsoftGraphStrings.atRisk = this.cast("atRisk")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def confirmedCompromised: typingsJapgolly.microsoftGraph.microsoftGraphStrings.confirmedCompromised = this.cast("confirmedCompromised")
  @scala.inline
  def confirmedSafe: typingsJapgolly.microsoftGraph.microsoftGraphStrings.confirmedSafe = this.cast("confirmedSafe")
  @scala.inline
  def dismissed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.dismissed = this.cast("dismissed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def remediated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.remediated = this.cast("remediated")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

