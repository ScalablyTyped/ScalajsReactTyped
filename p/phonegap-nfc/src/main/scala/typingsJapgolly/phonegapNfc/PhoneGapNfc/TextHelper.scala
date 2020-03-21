package typingsJapgolly.phonegapNfc.PhoneGapNfc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextHelper extends js.Object {
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String
  /**
    * Encode text payload
    * @param text
    * @param lang
    * @param encoding
    */
  def encodePayload(text: String, lang: String, encoding: String): js.Array[Double]
}

object TextHelper {
  @scala.inline
  def apply(
    decodePayload: js.Any => CallbackTo[String],
    encodePayload: (String, String, String) => CallbackTo[js.Array[Double]]
  ): TextHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decodePayload")(js.Any.fromFunction1((t0: js.Any) => decodePayload(t0).runNow()))
    __obj.updateDynamic("encodePayload")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String) => encodePayload(t0, t1, t2).runNow()))
    __obj.asInstanceOf[TextHelper]
  }
}

