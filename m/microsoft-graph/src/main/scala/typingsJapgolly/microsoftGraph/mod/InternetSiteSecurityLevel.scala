package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumHigh
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.high
*/
trait InternetSiteSecurityLevel extends js.Object

object InternetSiteSecurityLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def high: typingsJapgolly.microsoftGraph.microsoftGraphStrings.high = this.cast("high")
  @scala.inline
  def medium: typingsJapgolly.microsoftGraph.microsoftGraphStrings.medium = this.cast("medium")
  @scala.inline
  def mediumHigh: typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumHigh = this.cast("mediumHigh")
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

