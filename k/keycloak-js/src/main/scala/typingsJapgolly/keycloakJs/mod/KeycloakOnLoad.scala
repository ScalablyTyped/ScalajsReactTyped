package typingsJapgolly.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.keycloakJs.keycloakJsStrings.`login-required`
  - typingsJapgolly.keycloakJs.keycloakJsStrings.`check-sso`
*/
trait KeycloakOnLoad extends js.Object

object KeycloakOnLoad {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `check-sso`: typingsJapgolly.keycloakJs.keycloakJsStrings.`check-sso` = this.cast("check-sso")
  @scala.inline
  def `login-required`: typingsJapgolly.keycloakJs.keycloakJsStrings.`login-required` = this.cast("login-required")
}

