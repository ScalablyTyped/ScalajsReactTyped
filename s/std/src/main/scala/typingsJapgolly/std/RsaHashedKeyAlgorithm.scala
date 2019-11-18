package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedKeyAlgorithm extends RsaKeyAlgorithm {
  var hash: org.scalajs.dom.crypto.KeyAlgorithm
}

object RsaHashedKeyAlgorithm {
  @scala.inline
  def apply(
    hash: org.scalajs.dom.crypto.KeyAlgorithm,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: scala.scalajs.js.typedarray.Uint8Array
  ): RsaHashedKeyAlgorithm = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RsaHashedKeyAlgorithm]
  }
}

