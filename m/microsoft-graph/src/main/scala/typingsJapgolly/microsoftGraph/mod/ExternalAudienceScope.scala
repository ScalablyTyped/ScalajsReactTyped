package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.contactsOnly
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.all
*/
trait ExternalAudienceScope extends js.Object

object ExternalAudienceScope {
  @scala.inline
  def all: typingsJapgolly.microsoftGraph.microsoftGraphStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def contactsOnly: typingsJapgolly.microsoftGraph.microsoftGraphStrings.contactsOnly = this.cast("contactsOnly")
  @scala.inline
  def none: none_ = this.cast("none")
}

