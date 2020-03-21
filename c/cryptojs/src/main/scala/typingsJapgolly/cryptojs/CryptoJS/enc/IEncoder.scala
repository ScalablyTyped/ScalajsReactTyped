package typingsJapgolly.cryptojs.CryptoJS.enc

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEncoder extends js.Object {
  def stringify(wordArray: WordArray): String
}

object IEncoder {
  @scala.inline
  def apply(stringify: WordArray => CallbackTo[String]): IEncoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: typingsJapgolly.cryptojs.CryptoJS.lib.WordArray) => stringify(t0).runNow()))
    __obj.asInstanceOf[IEncoder]
  }
}

