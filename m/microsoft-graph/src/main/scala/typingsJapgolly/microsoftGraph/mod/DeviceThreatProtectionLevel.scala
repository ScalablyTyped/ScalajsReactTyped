package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unavailable
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.secured
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.low
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notSet
*/
trait DeviceThreatProtectionLevel extends js.Object

object DeviceThreatProtectionLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def notSet: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notSet = this.cast("notSet")
  @scala.inline
  def secured: typingsJapgolly.microsoftGraph.microsoftGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unavailable: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
}

