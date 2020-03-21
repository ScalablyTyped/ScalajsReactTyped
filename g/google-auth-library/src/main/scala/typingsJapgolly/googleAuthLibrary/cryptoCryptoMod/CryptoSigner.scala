package typingsJapgolly.googleAuthLibrary.cryptoCryptoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoSigner extends js.Object {
  def sign(key: String, outputFormat: String): String
  def update(data: String): Unit
}

object CryptoSigner {
  @scala.inline
  def apply(sign: (String, String) => CallbackTo[String], update: String => Callback): CryptoSigner = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sign")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sign(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: java.lang.String) => update(t0).runNow()))
    __obj.asInstanceOf[CryptoSigner]
  }
}

