package typingsJapgolly.rison.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRison extends js.Object {
  /**
    * Parses a Rison string into a javascript structure.
    * @param encoded Encoded string.
    * @returns {} Resulting array or object.
    */
  def decode[T](encoded: String): T
  /**
    * Parses a A-Rison string into a javascript array.
    * @param encoded Encoded string.
    * @returns {} Resulting array.
    */
  def decode_array[T](encoded: String): js.Array[T]
  /**
    * Parses a O-Rison string into a javascript object.
    * @param encoded Encoded string.
    * @returns {} Resulting object.
    */
  def decode_object[T](encoded: String): T
  /**
    * Rison-encodes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode(obj: js.Any): String
  /**
    * Rison-encodes a javascript array without surrounding parens (A-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_array[T](arr: js.Array[T]): String
  /**
    * Rison-encodes a javascript object without surrounding parens (O-Rison).
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_object[T](obj: T): String
  /**
    * Rison-encodes and then url-escapes a javascript structure.
    * @param obj Object to encode.
    * @returns {} Encoded string.
    */
  def encode_uri(obj: js.Any): String
}

object IRison {
  @scala.inline
  def apply(
    decode: String => CallbackTo[js.Any],
    decode_array: String => CallbackTo[js.Array[js.Any]],
    decode_object: String => CallbackTo[js.Any],
    encode: js.Any => CallbackTo[String],
    encode_array: js.Array[js.Any] => CallbackTo[String],
    encode_object: js.Any => CallbackTo[String],
    encode_uri: js.Any => CallbackTo[String]
  ): IRison = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("decode_array")(js.Any.fromFunction1((t0: java.lang.String) => decode_array(t0).runNow()))
    __obj.updateDynamic("decode_object")(js.Any.fromFunction1((t0: java.lang.String) => decode_object(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Any) => encode(t0).runNow()))
    __obj.updateDynamic("encode_array")(js.Any.fromFunction1((t0: js.Array[js.Any]) => encode_array(t0).runNow()))
    __obj.updateDynamic("encode_object")(js.Any.fromFunction1((t0: js.Any) => encode_object(t0).runNow()))
    __obj.updateDynamic("encode_uri")(js.Any.fromFunction1((t0: js.Any) => encode_uri(t0).runNow()))
    __obj.asInstanceOf[IRison]
  }
}

