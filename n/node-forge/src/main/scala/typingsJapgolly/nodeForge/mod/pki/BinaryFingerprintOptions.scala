package typingsJapgolly.nodeForge.mod.pki

import typingsJapgolly.nodeForge.mod.md.MessageDigest
import typingsJapgolly.nodeForge.nodeForgeStrings.RSAPublicKey
import typingsJapgolly.nodeForge.nodeForgeStrings.SubjectPublicKeyInfo
import typingsJapgolly.nodeForge.nodeForgeStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BinaryFingerprintOptions extends ByteBufferFingerprintOptions {
  /**
    * @description if not specified, the function will return `ByteStringBuffer`
    */
  var encoding: binary
}

object BinaryFingerprintOptions {
  @scala.inline
  def apply(
    encoding: binary,
    delimiter: String = null,
    md: MessageDigest = null,
    `type`: SubjectPublicKeyInfo | RSAPublicKey = null
  ): BinaryFingerprintOptions = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinaryFingerprintOptions]
  }
}

