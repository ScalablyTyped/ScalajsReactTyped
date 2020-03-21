package typingsJapgolly.lzString.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * LZ-based compression algorithm for JavaScript.
  */
trait LZStringStatic extends js.Object {
  /**
    * Compresses input string producing an instance of an "invalid" UTF-16 string.
    * Such string could be stored in localStorage only on webkit
    * browsers (tested on Android, Chrome, Safari).
    *
    * @param uncompressed A string which should be compressed.
    */
  def compress(uncompressed: String): String
  /**
    * Compresses input string producing an instance of a ASCII UTF-16 string,
    * which represents the original string encoded in Base64.
    * The result can be safely transported outside the browser with a
    * guarantee that none of the characters produced need to be URL-encoded.
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToBase64(uncompressed: String): String
  /**
    * produces ASCII strings representing the original string encoded in Base64 with a few
    * tweaks to make these URI safe. Hence, you can send them to the server without thinking
    * about URL encoding them. This saves bandwidth and CPU
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToEncodedURIComponent(uncompressed: String): String
  /**
    * Compresses input string producing an instance of a "valid" UTF-16 string,
    * in the sense that all browsers can store them safely.
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToUTF16(uncompressed: String): String
  /**
    * produces an uint8Array
    *
    * @param uncompressed A string which should be compressed.
    */
  def compressToUint8Array(uncompressed: String): scala.scalajs.js.typedarray.Uint8Array
  /**
    * Decompresses "invalid" input string created by the method compress().
    *
    * @param compressed A string obtained from a call to compress().
    */
  def decompress(compressed: String): String
  /**
    * Decompresses ASCII UTF-16 input string created by the method compressToBase64().
    *
    * @param compressed A string obtained from a call to compressToBase64().
    */
  def decompressFromBase64(compressed: String): String
  /**
    * Decompresses "valid" input string created by the method compressToEncodedURIComponent().
    *
    * @param compressed A string obtained from a call to compressToEncodedURIComponent().
    */
  def decompressFromEncodedURIComponent(compressed: String): String
  /**
    * Decompresses "valid" input string created by the method compressToUTF16().
    *
    * @param compressed A string obtained from a call to compressToUTF16().
    */
  def decompressFromUTF16(compressed: String): String
  /**
    * Decompresses "valid" array created by the method compressToUint8Array().
    *
    * @param compressed A string obtained from a call to compressToUint8Array().
    */
  def decompressFromUint8Array(compressed: scala.scalajs.js.typedarray.Uint8Array): String
}

object LZStringStatic {
  @scala.inline
  def apply(
    compress: String => CallbackTo[String],
    compressToBase64: String => CallbackTo[String],
    compressToEncodedURIComponent: String => CallbackTo[String],
    compressToUTF16: String => CallbackTo[String],
    compressToUint8Array: String => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    decompress: String => CallbackTo[String],
    decompressFromBase64: String => CallbackTo[String],
    decompressFromEncodedURIComponent: String => CallbackTo[String],
    decompressFromUTF16: String => CallbackTo[String],
    decompressFromUint8Array: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[String]
  ): LZStringStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compress")(js.Any.fromFunction1((t0: java.lang.String) => compress(t0).runNow()))
    __obj.updateDynamic("compressToBase64")(js.Any.fromFunction1((t0: java.lang.String) => compressToBase64(t0).runNow()))
    __obj.updateDynamic("compressToEncodedURIComponent")(js.Any.fromFunction1((t0: java.lang.String) => compressToEncodedURIComponent(t0).runNow()))
    __obj.updateDynamic("compressToUTF16")(js.Any.fromFunction1((t0: java.lang.String) => compressToUTF16(t0).runNow()))
    __obj.updateDynamic("compressToUint8Array")(js.Any.fromFunction1((t0: java.lang.String) => compressToUint8Array(t0).runNow()))
    __obj.updateDynamic("decompress")(js.Any.fromFunction1((t0: java.lang.String) => decompress(t0).runNow()))
    __obj.updateDynamic("decompressFromBase64")(js.Any.fromFunction1((t0: java.lang.String) => decompressFromBase64(t0).runNow()))
    __obj.updateDynamic("decompressFromEncodedURIComponent")(js.Any.fromFunction1((t0: java.lang.String) => decompressFromEncodedURIComponent(t0).runNow()))
    __obj.updateDynamic("decompressFromUTF16")(js.Any.fromFunction1((t0: java.lang.String) => decompressFromUTF16(t0).runNow()))
    __obj.updateDynamic("decompressFromUint8Array")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => decompressFromUint8Array(t0).runNow()))
    __obj.asInstanceOf[LZStringStatic]
  }
}

