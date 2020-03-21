package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.guest
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.domain
*/
trait SharedPCAllowedAccountType extends js.Object

object SharedPCAllowedAccountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domain: typingsJapgolly.microsoftGraph.microsoftGraphStrings.domain = this.cast("domain")
  @scala.inline
  def guest: typingsJapgolly.microsoftGraph.microsoftGraphStrings.guest = this.cast("guest")
}

