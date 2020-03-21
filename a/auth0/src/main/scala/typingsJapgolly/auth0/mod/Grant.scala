package typingsJapgolly.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.auth0.auth0Strings.authorization_code
  - typingsJapgolly.auth0.auth0Strings.client_credentials
  - typingsJapgolly.auth0.auth0Strings.`implicit`
  - typingsJapgolly.auth0.auth0Strings.password
  - typingsJapgolly.auth0.auth0Strings.refresh_token
*/
trait Grant extends js.Object

object Grant {
  @scala.inline
  def authorization_code: typingsJapgolly.auth0.auth0Strings.authorization_code = this.cast("authorization_code")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def client_credentials: typingsJapgolly.auth0.auth0Strings.client_credentials = this.cast("client_credentials")
  @scala.inline
  def `implicit`: typingsJapgolly.auth0.auth0Strings.`implicit` = this.cast("implicit")
  @scala.inline
  def password: typingsJapgolly.auth0.auth0Strings.password = this.cast("password")
  @scala.inline
  def refresh_token: typingsJapgolly.auth0.auth0Strings.refresh_token = this.cast("refresh_token")
}

