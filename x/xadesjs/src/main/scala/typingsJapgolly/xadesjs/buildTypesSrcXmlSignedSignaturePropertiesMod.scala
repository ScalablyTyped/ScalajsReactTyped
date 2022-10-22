package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesSrcXmlDateTimeMod.XadesDateTime
import typingsJapgolly.xadesjs.buildTypesSrcXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesSrcXmlSignedSignaturePropertiesMod {
  
  @JSImport("xadesjs/build/types/src/xml/signed_signature_properties", "SignedSignatureProperties")
  @js.native
  open class SignedSignatureProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typingsJapgolly.xadesjs.buildTypesSrcXmlSignaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typingsJapgolly.xadesjs.buildTypesSrcXmlSignatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typingsJapgolly.xadesjs.buildTypesSrcXmlSignerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typingsJapgolly.xadesjs.buildTypesSrcXmlSigningCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typingsJapgolly.xadesjs.buildTypesSrcXmlSigningCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
