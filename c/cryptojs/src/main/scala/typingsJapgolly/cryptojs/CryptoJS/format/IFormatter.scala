package typingsJapgolly.cryptojs.CryptoJS.format

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cryptojs.CryptoJS.lib.CipherParams
import typingsJapgolly.cryptojs.CryptoJS.lib.CipherParamsData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormatter extends js.Object {
  def parse(s: String): CipherParams
  def stringify(cipherParams: CipherParamsData): String
}

object IFormatter {
  @scala.inline
  def apply(parse: String => CallbackTo[CipherParams], stringify: CipherParamsData => CallbackTo[String]): IFormatter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("stringify")(js.Any.fromFunction1((t0: typingsJapgolly.cryptojs.CryptoJS.lib.CipherParamsData) => stringify(t0).runNow()))
    __obj.asInstanceOf[IFormatter]
  }
}

