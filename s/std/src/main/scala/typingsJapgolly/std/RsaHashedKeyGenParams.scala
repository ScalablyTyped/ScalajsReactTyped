package typingsJapgolly.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaHashedKeyGenParams extends RsaKeyGenParams {
  var hash: HashAlgorithmIdentifier
}

object RsaHashedKeyGenParams {
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    modulusLength: Double,
    name: java.lang.String,
    publicExponent: scala.scalajs.js.typedarray.Uint8Array
  ): RsaHashedKeyGenParams = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], modulusLength = modulusLength.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RsaHashedKeyGenParams]
  }
}

