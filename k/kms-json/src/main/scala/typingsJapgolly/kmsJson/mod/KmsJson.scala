package typingsJapgolly.kmsJson.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KmsJson extends js.Object {
  def decrypt(cipherText: String): js.Object
  def encrypt(inputJson: js.Object): String
}

object KmsJson {
  @scala.inline
  def apply(decrypt: String => CallbackTo[js.Object], encrypt: js.Object => CallbackTo[String]): KmsJson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(js.Any.fromFunction1((t0: java.lang.String) => decrypt(t0).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction1((t0: js.Object) => encrypt(t0).runNow()))
    __obj.asInstanceOf[KmsJson]
  }
}

