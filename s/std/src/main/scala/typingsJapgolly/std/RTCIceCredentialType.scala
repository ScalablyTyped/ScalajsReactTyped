package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.password
  - typings.std.stdStrings.oauth
*/
trait RTCIceCredentialType extends js.Object

object RTCIceCredentialType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def oauth: typingsJapgolly.std.stdStrings.oauth = this.cast("oauth")
  @scala.inline
  def password: typingsJapgolly.std.stdStrings.password = this.cast("password")
}

