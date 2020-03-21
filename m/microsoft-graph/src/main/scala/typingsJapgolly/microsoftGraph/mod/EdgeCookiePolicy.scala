package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allow
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blockThirdParty
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blockAll
*/
trait EdgeCookiePolicy extends js.Object

object EdgeCookiePolicy {
  @scala.inline
  def allow: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allow = this.cast("allow")
  @scala.inline
  def blockAll: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blockAll = this.cast("blockAll")
  @scala.inline
  def blockThirdParty: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blockThirdParty = this.cast("blockThirdParty")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def userDefined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userDefined = this.cast("userDefined")
}

