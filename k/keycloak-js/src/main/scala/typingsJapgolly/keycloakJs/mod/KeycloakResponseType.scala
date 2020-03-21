package typingsJapgolly.keycloakJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.keycloakJs.keycloakJsStrings.code
  - typingsJapgolly.keycloakJs.keycloakJsStrings.`id_token token`
  - typingsJapgolly.keycloakJs.keycloakJsStrings.`code id_token token`
*/
trait KeycloakResponseType extends js.Object

object KeycloakResponseType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def code: typingsJapgolly.keycloakJs.keycloakJsStrings.code = this.cast("code")
  @scala.inline
  def `code id_token token`: typingsJapgolly.keycloakJs.keycloakJsStrings.`code id_token token` = this.cast("code id_token token")
  @scala.inline
  def `id_token token`: typingsJapgolly.keycloakJs.keycloakJsStrings.`id_token token` = this.cast("id_token token")
}

