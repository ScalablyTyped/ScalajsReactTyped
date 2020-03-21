package typingsJapgolly.unorm.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  def nfc(str: String): String
  def nfd(str: String): String
  def nfkc(str: String): String
  def nfkd(str: String): String
}

object Static {
  @scala.inline
  def apply(
    nfc: String => CallbackTo[String],
    nfd: String => CallbackTo[String],
    nfkc: String => CallbackTo[String],
    nfkd: String => CallbackTo[String]
  ): Static = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nfc")(js.Any.fromFunction1((t0: java.lang.String) => nfc(t0).runNow()))
    __obj.updateDynamic("nfd")(js.Any.fromFunction1((t0: java.lang.String) => nfd(t0).runNow()))
    __obj.updateDynamic("nfkc")(js.Any.fromFunction1((t0: java.lang.String) => nfkc(t0).runNow()))
    __obj.updateDynamic("nfkd")(js.Any.fromFunction1((t0: java.lang.String) => nfkd(t0).runNow()))
    __obj.asInstanceOf[Static]
  }
}

