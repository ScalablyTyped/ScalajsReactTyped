package typingsJapgolly.juiCore.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UtilBase64 extends js.Object {
  def decode(input: String): String
  def encode(input: String): String
}

object UtilBase64 {
  @scala.inline
  def apply(decode: String => CallbackTo[String], encode: String => CallbackTo[String]): UtilBase64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: java.lang.String) => encode(t0).runNow()))
    __obj.asInstanceOf[UtilBase64]
  }
}

