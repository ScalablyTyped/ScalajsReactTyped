package typingsJapgolly.htmlEntities.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entities extends js.Object {
  def decode(toDecode: String): String
  def encode(toEncode: String): String
  def encodeNonASCII(toEncode: String): String
  def encodeNonUTF(toEncode: String): String
}

object Entities {
  @scala.inline
  def apply(
    decode: String => CallbackTo[String],
    encode: String => CallbackTo[String],
    encodeNonASCII: String => CallbackTo[String],
    encodeNonUTF: String => CallbackTo[String]
  ): Entities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: java.lang.String) => encode(t0).runNow()))
    __obj.updateDynamic("encodeNonASCII")(js.Any.fromFunction1((t0: java.lang.String) => encodeNonASCII(t0).runNow()))
    __obj.updateDynamic("encodeNonUTF")(js.Any.fromFunction1((t0: java.lang.String) => encodeNonUTF(t0).runNow()))
    __obj.asInstanceOf[Entities]
  }
}

