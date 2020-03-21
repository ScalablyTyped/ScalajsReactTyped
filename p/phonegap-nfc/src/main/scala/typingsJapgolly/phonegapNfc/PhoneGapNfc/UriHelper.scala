package typingsJapgolly.phonegapNfc.PhoneGapNfc

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriHelper extends js.Object {
  /**
    * URI identifier codes from URI Record Type Definition NFCForum-TS-RTD_URI_1.0 2006-07-24
    * index in array matches code in the spec
    */
  var protocols: js.Array[String]
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String
  /**
    * shorten a URI with standard prefix
    * @param uri
    */
  def encodePayload(uri: String): js.Array[Double]
}

object UriHelper {
  @scala.inline
  def apply(
    decodePayload: js.Any => CallbackTo[String],
    encodePayload: String => CallbackTo[js.Array[Double]],
    protocols: js.Array[String]
  ): UriHelper = {
    val __obj = js.Dynamic.literal(protocols = protocols.asInstanceOf[js.Any])
    __obj.updateDynamic("decodePayload")(js.Any.fromFunction1((t0: js.Any) => decodePayload(t0).runNow()))
    __obj.updateDynamic("encodePayload")(js.Any.fromFunction1((t0: java.lang.String) => encodePayload(t0).runNow()))
    __obj.asInstanceOf[UriHelper]
  }
}

