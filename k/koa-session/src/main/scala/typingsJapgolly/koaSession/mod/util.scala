package typingsJapgolly.koaSession.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait util extends js.Object {
  /**
    * Decode the base64 cookie value to an object.
    */
  def decode(str: String): js.Object
  /**
    * Encode an object into a base64-encoded JSON string.
    */
  def encode(obj: js.Object): String
  def hash(sess: js.Any): String
}

object util {
  @scala.inline
  def apply(
    decode: String => CallbackTo[js.Object],
    encode: js.Object => CallbackTo[String],
    hash: js.Any => CallbackTo[String]
  ): util = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Object) => encode(t0).runNow()))
    __obj.updateDynamic("hash")(js.Any.fromFunction1((t0: js.Any) => hash(t0).runNow()))
    __obj.asInstanceOf[util]
  }
}

