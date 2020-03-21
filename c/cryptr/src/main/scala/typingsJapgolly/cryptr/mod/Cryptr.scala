package typingsJapgolly.cryptr.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cryptr extends js.Object {
  /** Decrypt a string. */
  def decrypt(value: String): String
  /** Encrypt a string. */
  def encrypt(value: String): String
}

object Cryptr {
  @scala.inline
  def apply(decrypt: String => CallbackTo[String], encrypt: String => CallbackTo[String]): Cryptr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(js.Any.fromFunction1((t0: java.lang.String) => decrypt(t0).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction1((t0: java.lang.String) => encrypt(t0).runNow()))
    __obj.asInstanceOf[Cryptr]
  }
}

