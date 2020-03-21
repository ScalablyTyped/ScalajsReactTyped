package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.low
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumLow
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumHigh
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
*/
trait SiteSecurityLevel extends js.Object

object SiteSecurityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def low: typingsJapgolly.microsoftGraph.microsoftGraphStrings.low = this.cast("low")
  @scala.inline
  def medium: typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def mediumHigh: typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumHigh = this.cast("mediumHigh")
  @scala.inline
  def mediumLow: typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumLow = this.cast("mediumLow")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

