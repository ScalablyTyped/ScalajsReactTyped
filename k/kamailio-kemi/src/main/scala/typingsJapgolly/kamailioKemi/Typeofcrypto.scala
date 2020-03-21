package typingsJapgolly.kamailioKemi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcrypto extends js.Object {
  def aes_decrypt(ins: String, keys: String, dpv: String): Double
  def aes_encrypt(ins: String, keys: String, dpv: String): Double
}

object Typeofcrypto {
  @scala.inline
  def apply(
    aes_decrypt: (String, String, String) => CallbackTo[Double],
    aes_encrypt: (String, String, String) => CallbackTo[Double]
  ): Typeofcrypto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aes_decrypt")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => aes_decrypt(t0, t1, t2).runNow()))
    __obj.updateDynamic("aes_encrypt")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => aes_encrypt(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Typeofcrypto]
  }
}

