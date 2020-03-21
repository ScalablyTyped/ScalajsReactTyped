package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.standard
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.power
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.administrator
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait UserAccountSecurityType extends js.Object

object UserAccountSecurityType {
  @scala.inline
  def administrator: typingsJapgolly.microsoftGraph.microsoftGraphStrings.administrator = this.cast("administrator")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def power: typingsJapgolly.microsoftGraph.microsoftGraphStrings.power = this.cast("power")
  @scala.inline
  def standard: typingsJapgolly.microsoftGraph.microsoftGraphStrings.standard = this.cast("standard")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

