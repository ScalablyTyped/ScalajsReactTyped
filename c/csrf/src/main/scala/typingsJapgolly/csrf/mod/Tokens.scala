package typingsJapgolly.csrf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tokens extends js.Object {
  /**
    * Create a new CSRF token.
    *
    * @param secret The secret for the token.
    */
  def create(secret: String): String = js.native
  /** Create a new secret key. */
  def secret(): js.Promise[String] = js.native
  def secret(callback: SecretCallback): js.Promise[String] = js.native
  /**
    * Create a new secret key synchronously.
    */
  def secretSync(): String = js.native
  /**
    * Verify if a given token is valid for a given secret.
    *
    */
  def verify(secret: String, token: String): Boolean = js.native
}

