package typingsJapgolly.nodeJose.mod.JWE

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decryptor extends js.Object {
  def decrypt(input: String): js.Promise[DecryptResult]
}

object Decryptor {
  @scala.inline
  def apply(decrypt: String => CallbackTo[js.Promise[DecryptResult]]): Decryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrypt")(js.Any.fromFunction1((t0: java.lang.String) => decrypt(t0).runNow()))
    __obj.asInstanceOf[Decryptor]
  }
}

