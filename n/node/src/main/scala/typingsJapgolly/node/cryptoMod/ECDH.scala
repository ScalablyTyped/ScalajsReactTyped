package typingsJapgolly.node.cryptoMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ArrayBufferView
import typingsJapgolly.node.nodeStrings.base64
import typingsJapgolly.node.nodeStrings.compressed
import typingsJapgolly.node.nodeStrings.hex
import typingsJapgolly.node.nodeStrings.hybrid
import typingsJapgolly.node.nodeStrings.latin1
import typingsJapgolly.node.nodeStrings.uncompressed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "ECDH")
@js.native
class ECDH protected () extends js.Object {
  def computeSecret(other_public_key: java.lang.String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(
    other_public_key: java.lang.String,
    input_encoding: HexBase64Latin1Encoding,
    output_encoding: HexBase64Latin1Encoding
  ): java.lang.String = js.native
  def computeSecret(other_public_key: ArrayBufferView): Buffer = js.native
  def computeSecret(other_public_key: ArrayBufferView, output_encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): java.lang.String = js.native
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): java.lang.String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): java.lang.String = js.native
  def setPrivateKey(private_key: java.lang.String, encoding: HexBase64Latin1Encoding): Unit = js.native
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
}

/* static members */
@JSImport("crypto", "ECDH")
@js.native
object ECDH extends js.Object {
  def convertKey(key: BinaryLike, curve: java.lang.String): Buffer | java.lang.String = js.native
  def convertKey(key: BinaryLike, curve: java.lang.String, inputEncoding: HexBase64Latin1Encoding): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | java.lang.String = js.native
  def convertKey(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_base64(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64
  ): Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_hex(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex
  ): Buffer | java.lang.String = js.native
  @JSName("convertKey")
  def convertKey_latin1(
    key: BinaryLike,
    curve: java.lang.String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1
  ): Buffer | java.lang.String = js.native
}

