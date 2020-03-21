package typingsJapgolly.pkijs

import org.scalajs.dom.crypto.Algorithm
import typingsJapgolly.std.BufferSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentEncryptionAlgorithm extends js.Object {
  var contentEncryptionAlgorithm: Algorithm
  var contentToEncrypt: BufferSource
  var hmacHashAlgorithm: String
  var iterationCount: Double
  var password: String
}

object AnonContentEncryptionAlgorithm {
  @scala.inline
  def apply(
    contentEncryptionAlgorithm: Algorithm,
    contentToEncrypt: BufferSource,
    hmacHashAlgorithm: String,
    iterationCount: Double,
    password: String
  ): AnonContentEncryptionAlgorithm = {
    val __obj = js.Dynamic.literal(contentEncryptionAlgorithm = contentEncryptionAlgorithm.asInstanceOf[js.Any], contentToEncrypt = contentToEncrypt.asInstanceOf[js.Any], hmacHashAlgorithm = hmacHashAlgorithm.asInstanceOf[js.Any], iterationCount = iterationCount.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContentEncryptionAlgorithm]
  }
}

