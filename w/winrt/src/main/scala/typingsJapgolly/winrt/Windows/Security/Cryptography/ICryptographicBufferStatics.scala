package typingsJapgolly.winrt.Windows.Security.Cryptography

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICryptographicBufferStatics extends js.Object {
  def compare(object1: IBuffer, object2: IBuffer): Boolean
  def convertBinaryToString(encoding: BinaryStringEncoding, buffer: IBuffer): String
  def convertStringToBinary(value: String, encoding: BinaryStringEncoding): IBuffer
  def copyToByteArray(buffer: IBuffer): scala.scalajs.js.typedarray.Uint8Array
  def createFromByteArray(value: scala.scalajs.js.typedarray.Uint8Array): IBuffer
  def decodeFromBase64String(value: String): IBuffer
  def decodeFromHexString(value: String): IBuffer
  def encodeToBase64String(buffer: IBuffer): String
  def encodeToHexString(buffer: IBuffer): String
  def generateRandom(length: Double): IBuffer
  def generateRandomNumber(): Double
}

object ICryptographicBufferStatics {
  @scala.inline
  def apply(
    compare: (IBuffer, IBuffer) => CallbackTo[Boolean],
    convertBinaryToString: (BinaryStringEncoding, IBuffer) => CallbackTo[String],
    convertStringToBinary: (String, BinaryStringEncoding) => CallbackTo[IBuffer],
    copyToByteArray: IBuffer => CallbackTo[scala.scalajs.js.typedarray.Uint8Array],
    createFromByteArray: scala.scalajs.js.typedarray.Uint8Array => CallbackTo[IBuffer],
    decodeFromBase64String: String => CallbackTo[IBuffer],
    decodeFromHexString: String => CallbackTo[IBuffer],
    encodeToBase64String: IBuffer => CallbackTo[String],
    encodeToHexString: IBuffer => CallbackTo[String],
    generateRandom: Double => CallbackTo[IBuffer],
    generateRandomNumber: CallbackTo[Double]
  ): ICryptographicBufferStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("compare")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => compare(t0, t1).runNow()))
    __obj.updateDynamic("convertBinaryToString")(js.Any.fromFunction2((t0: typingsJapgolly.winrt.Windows.Security.Cryptography.BinaryStringEncoding, t1: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => convertBinaryToString(t0, t1).runNow()))
    __obj.updateDynamic("convertStringToBinary")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Security.Cryptography.BinaryStringEncoding) => convertStringToBinary(t0, t1).runNow()))
    __obj.updateDynamic("copyToByteArray")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => copyToByteArray(t0).runNow()))
    __obj.updateDynamic("createFromByteArray")(js.Any.fromFunction1((t0: scala.scalajs.js.typedarray.Uint8Array) => createFromByteArray(t0).runNow()))
    __obj.updateDynamic("decodeFromBase64String")(js.Any.fromFunction1((t0: java.lang.String) => decodeFromBase64String(t0).runNow()))
    __obj.updateDynamic("decodeFromHexString")(js.Any.fromFunction1((t0: java.lang.String) => decodeFromHexString(t0).runNow()))
    __obj.updateDynamic("encodeToBase64String")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => encodeToBase64String(t0).runNow()))
    __obj.updateDynamic("encodeToHexString")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer) => encodeToHexString(t0).runNow()))
    __obj.updateDynamic("generateRandom")(js.Any.fromFunction1((t0: scala.Double) => generateRandom(t0).runNow()))
    __obj.updateDynamic("generateRandomNumber")(generateRandomNumber.toJsFn)
    __obj.asInstanceOf[ICryptographicBufferStatics]
  }
}

