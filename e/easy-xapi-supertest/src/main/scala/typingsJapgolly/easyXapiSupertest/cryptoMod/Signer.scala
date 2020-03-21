package typingsJapgolly.easyXapiSupertest.cryptoMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Signer extends js.Object {
  def sign(private_key: String, output_format: String): String
  def update(data: js.Any): Unit
}

object Signer {
  @scala.inline
  def apply(sign: (String, String) => CallbackTo[String], update: js.Any => Callback): Signer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sign")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => sign(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: js.Any) => update(t0).runNow()))
    __obj.asInstanceOf[Signer]
  }
}

