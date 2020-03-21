package typingsJapgolly.cryptojs.CryptoJS.enc

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cryptojs.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecoder extends js.Object {
  def parse(s: String): WordArray
}

object IDecoder {
  @scala.inline
  def apply(parse: String => CallbackTo[WordArray]): IDecoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.asInstanceOf[IDecoder]
  }
}

