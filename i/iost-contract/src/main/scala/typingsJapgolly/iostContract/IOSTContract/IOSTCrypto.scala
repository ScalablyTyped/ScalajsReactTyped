package typingsJapgolly.iostContract.IOSTContract

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOSTCrypto extends js.Object {
  def sha3(data: String): String
  def verify(algo: String, message: String, signature: String, pubkey: String): Double
}

object IOSTCrypto {
  @scala.inline
  def apply(sha3: String => CallbackTo[String], verify: (String, String, String, String) => CallbackTo[Double]): IOSTCrypto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sha3")(js.Any.fromFunction1((t0: java.lang.String) => sha3(t0).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: java.lang.String) => verify(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[IOSTCrypto]
  }
}

