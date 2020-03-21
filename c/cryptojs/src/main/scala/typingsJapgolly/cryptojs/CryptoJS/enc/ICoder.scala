package typingsJapgolly.cryptojs.CryptoJS.enc

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICoder
  extends IEncoder
     with IDecoder

object ICoder {
  @scala.inline
  def apply(parse: String => CallbackTo[WordArray], stringify: WordArray => CallbackTo[String]): ICoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: typingsJapgolly.cryptojs.CryptoJS.lib.WordArray) => stringify(t0).runNow()))
    __obj.asInstanceOf[ICoder]
  }
}

