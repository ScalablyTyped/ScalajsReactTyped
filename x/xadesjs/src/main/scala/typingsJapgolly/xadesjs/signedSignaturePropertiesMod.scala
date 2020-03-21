package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.dateTimeMod.XadesDateTime
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signed_signature_properties", JSImport.Namespace)
@js.native
object signedSignaturePropertiesMod extends js.Object {
  @js.native
  class SignedSignatureProperties () extends XmlObject {
    var Id: String = js.native
    var SignaturePolicyIdentifier: typingsJapgolly.xadesjs.signaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    var SignatureProductionPlace: typingsJapgolly.xadesjs.signatureProductPlaceMod.SignatureProductionPlace = js.native
    var SignerRole: typingsJapgolly.xadesjs.signerRoleMod.SignerRole = js.native
    var SigningCertificate: typingsJapgolly.xadesjs.signingCertificateMod.SigningCertificate = js.native
    var SigningTime: XadesDateTime = js.native
  }
  
}

