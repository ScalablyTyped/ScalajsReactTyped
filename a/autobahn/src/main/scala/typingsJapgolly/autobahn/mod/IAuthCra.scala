package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthCra extends js.Object {
  def derive_key(secret: String, salt: String, iterations: Double, keylen: Double): String
  def sign(key: String, challenge: String): String
}

object IAuthCra {
  @scala.inline
  def apply(
    derive_key: (String, String, Double, Double) => CallbackTo[String],
    sign: (String, String) => CallbackTo[String]
  ): IAuthCra = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("derive_key")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: scala.Double, t3: scala.Double) => derive_key(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("sign")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sign(t0, t1).runNow()))
    __obj.asInstanceOf[IAuthCra]
  }
}

