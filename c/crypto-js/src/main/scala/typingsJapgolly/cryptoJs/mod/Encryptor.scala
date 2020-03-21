package typingsJapgolly.cryptoJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Encryptor extends js.Object {
  def process(messagePart: String): String
}

object Encryptor {
  @scala.inline
  def apply(process: String => CallbackTo[String]): Encryptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("process")(js.Any.fromFunction1((t0: java.lang.String) => process(t0).runNow()))
    __obj.asInstanceOf[Encryptor]
  }
}

