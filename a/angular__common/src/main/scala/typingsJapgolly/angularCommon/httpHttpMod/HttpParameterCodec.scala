package typingsJapgolly.angularCommon.httpHttpMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpParameterCodec extends js.Object {
  def decodeKey(key: String): String
  def decodeValue(value: String): String
  def encodeKey(key: String): String
  def encodeValue(value: String): String
}

object HttpParameterCodec {
  @scala.inline
  def apply(
    decodeKey: String => CallbackTo[String],
    decodeValue: String => CallbackTo[String],
    encodeKey: String => CallbackTo[String],
    encodeValue: String => CallbackTo[String]
  ): HttpParameterCodec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decodeKey")(js.Any.fromFunction1((t0: java.lang.String) => decodeKey(t0).runNow()))
    __obj.updateDynamic("decodeValue")(js.Any.fromFunction1((t0: java.lang.String) => decodeValue(t0).runNow()))
    __obj.updateDynamic("encodeKey")(js.Any.fromFunction1((t0: java.lang.String) => encodeKey(t0).runNow()))
    __obj.updateDynamic("encodeValue")(js.Any.fromFunction1((t0: java.lang.String) => encodeValue(t0).runNow()))
    __obj.asInstanceOf[HttpParameterCodec]
  }
}

