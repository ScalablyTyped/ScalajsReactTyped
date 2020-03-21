package typingsJapgolly.dojo.dojox.encoding.digests

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/digests/_base.html
  *
  *
  */
trait base_ extends js.Object {
  /**
    * Enumeration for input and output encodings.
    *
    */
  var outputTypes: js.Object
  /**
    * computes the digest of data, and returns the result according to type outputType
    *
    * @param data
    * @param outputType               OptionalAn object with the following properties:Base64HexStringRaw
    */
  def MD5(data: String, outputType: js.Object): Unit
  /**
    * Computes the SHA1 digest of the data, and returns the result according to output type.
    *
    * @param data
    * @param outputType               OptionalAn object with the following properties:Base64HexStringRaw
    */
  def SHA1(data: String, outputType: js.Object): Unit
  /**
    * add a pair of words together with rollover
    *
    * @param a
    * @param b
    */
  def addWords(a: String, b: String): Double
  /**
    *
    * @param input
    */
  def stringToUtf8(input: js.Any): Unit
  /**
    * convert a string to a word array
    *
    * @param s
    */
  def stringToWord(s: String): js.Array[_]
  /**
    * convert an array of words to base64 encoding, should be more efficient
    * than using dojox.encoding.base64
    *
    * @param wa
    */
  def wordToBase64(wa: js.Array[String]): Unit
  /**
    * convert an array of words to a hex tab
    *
    * @param wa
    */
  def wordToHex(wa: js.Array[String]): Unit
  /**
    * convert an array of words to a string
    *
    * @param wa
    */
  def wordToString(wa: js.Array[String]): Unit
}

object base_ {
  @scala.inline
  def apply(
    MD5: (String, js.Object) => Callback,
    SHA1: (String, js.Object) => Callback,
    addWords: (String, String) => CallbackTo[Double],
    outputTypes: js.Object,
    stringToUtf8: js.Any => Callback,
    stringToWord: String => CallbackTo[js.Array[js.Any]],
    wordToBase64: js.Array[String] => Callback,
    wordToHex: js.Array[String] => Callback,
    wordToString: js.Array[String] => Callback
  ): base_ = {
    val __obj = js.Dynamic.literal(outputTypes = outputTypes.asInstanceOf[js.Any])
    __obj.updateDynamic("MD5")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => MD5(t0, t1).runNow()))
    __obj.updateDynamic("SHA1")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Object) => SHA1(t0, t1).runNow()))
    __obj.updateDynamic("addWords")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => addWords(t0, t1).runNow()))
    __obj.updateDynamic("stringToUtf8")(js.Any.fromFunction1((t0: js.Any) => stringToUtf8(t0).runNow()))
    __obj.updateDynamic("stringToWord")(js.Any.fromFunction1((t0: java.lang.String) => stringToWord(t0).runNow()))
    __obj.updateDynamic("wordToBase64")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => wordToBase64(t0).runNow()))
    __obj.updateDynamic("wordToHex")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => wordToHex(t0).runNow()))
    __obj.updateDynamic("wordToString")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => wordToString(t0).runNow()))
    __obj.asInstanceOf[base_]
  }
}

