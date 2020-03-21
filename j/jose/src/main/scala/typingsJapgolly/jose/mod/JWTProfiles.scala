package typingsJapgolly.jose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jose.joseStrings.id_token
  - typingsJapgolly.jose.joseStrings.atPlussignJWT
  - typingsJapgolly.jose.joseStrings.logout_token
*/
trait JWTProfiles extends js.Object

object JWTProfiles {
  @scala.inline
  def atPlussignJWT: typingsJapgolly.jose.joseStrings.atPlussignJWT = this.cast("at+JWT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def id_token: typingsJapgolly.jose.joseStrings.id_token = this.cast("id_token")
  @scala.inline
  def logout_token: typingsJapgolly.jose.joseStrings.logout_token = this.cast("logout_token")
}

