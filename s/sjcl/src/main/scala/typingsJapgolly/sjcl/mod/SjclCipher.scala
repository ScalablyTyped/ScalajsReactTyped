package typingsJapgolly.sjcl.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SjclCipher extends js.Object {
  def decrypt(data: js.Array[Double]): js.Array[Double]
  def encrypt(data: js.Array[Double]): js.Array[Double]
}

object SjclCipher {
  @scala.inline
  def apply(
    decrypt: js.Array[Double] => CallbackTo[js.Array[Double]],
    encrypt: js.Array[Double] => CallbackTo[js.Array[Double]]
  ): SjclCipher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => decrypt(t0).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => encrypt(t0).runNow()))
    __obj.asInstanceOf[SjclCipher]
  }
}

