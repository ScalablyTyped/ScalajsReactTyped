package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0.auth0Strings.link
  - typingsJapgolly.auth0.auth0Strings.code
*/
trait SendType extends js.Object

object SendType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsJapgolly.auth0.auth0Strings.code = this.cast("code")
  @scala.inline
  def link: typingsJapgolly.auth0.auth0Strings.link = this.cast("link")
}

