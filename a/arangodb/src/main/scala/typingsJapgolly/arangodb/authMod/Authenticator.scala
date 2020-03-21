package typingsJapgolly.arangodb.authMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Authenticator extends js.Object {
  def create(password: String): AuthData = js.native
  def verify(): Boolean = js.native
  def verify(hash: AuthData): Boolean = js.native
  def verify(hash: AuthData, password: String): Boolean = js.native
}

