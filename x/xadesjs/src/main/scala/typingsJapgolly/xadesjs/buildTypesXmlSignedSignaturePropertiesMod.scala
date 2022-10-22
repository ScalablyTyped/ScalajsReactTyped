package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesXmlDateTimeMod.XadesDateTime
import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlSignedSignaturePropertiesMod {
  
  @JSImport("xadesjs/build/types/xml/signed_signature_properties", "SignedSignatureProperties")
  @js.native
  open class SignedSignatureProperties () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Id: String = js.native
    
    var SignaturePolicyIdentifier: typingsJapgolly.xadesjs.buildTypesXmlSignaturePolicyIdentifierMod.SignaturePolicyIdentifier = js.native
    
    var SignatureProductionPlace: typingsJapgolly.xadesjs.buildTypesXmlSignatureProductPlaceMod.SignatureProductionPlace = js.native
    
    var SignerRole: typingsJapgolly.xadesjs.buildTypesXmlSignerRoleMod.SignerRole = js.native
    
    var SigningCertificate: typingsJapgolly.xadesjs.buildTypesXmlSigningCertificateMod.SigningCertificate = js.native
    
    var SigningCertificateV2: typingsJapgolly.xadesjs.buildTypesXmlSigningCertificateV2Mod.SigningCertificateV2 = js.native
    
    var SigningTime: XadesDateTime = js.native
  }
}
