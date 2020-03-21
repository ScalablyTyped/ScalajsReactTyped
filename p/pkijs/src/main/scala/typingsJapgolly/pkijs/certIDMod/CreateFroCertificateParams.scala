package typingsJapgolly.pkijs.certIDMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFroCertificateParams extends js.Object {
  var hashAlgorithm: String
  var issuerCertificate: typingsJapgolly.pkijs.certificateMod.default
}

object CreateFroCertificateParams {
  @scala.inline
  def apply(hashAlgorithm: String, issuerCertificate: typingsJapgolly.pkijs.certificateMod.default): CreateFroCertificateParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerCertificate = issuerCertificate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateFroCertificateParams]
  }
}

