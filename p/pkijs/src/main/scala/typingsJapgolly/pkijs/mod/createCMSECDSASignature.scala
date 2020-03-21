package typingsJapgolly.pkijs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/common", "createCMSECDSASignature")
@js.native
object createCMSECDSASignature extends js.Object {
  /**
    * Create CMS ECDSA signature from WebCrypto ECDSA signature
    * 
    * @param {ArrayBuffer} signatureBuffer WebCrypto result of "sign" function
    * @returns {ArrayBuffer}
    */
  def apply(signatureBuffer: scala.scalajs.js.typedarray.ArrayBuffer): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

