package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.certificateValuesMod.CertificateValues
import typingsJapgolly.xadesjs.completeCertificateRefsMod.CompleteCertificateRefs
import typingsJapgolly.xadesjs.completeRevocationRefsMod.CompleteRevocationRefs
import typingsJapgolly.xadesjs.revocationValuesMod.RevocationValues
import typingsJapgolly.xadesjs.xadesTimeStampMod.XAdESTimeStamp
import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/unsigned_signature_properties", JSImport.Namespace)
@js.native
object unsignedSignaturePropertiesMod extends js.Object {
  @js.native
  class ArchiveTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class AttrAuthoritiesCertValues () extends CertificateValues
  
  @js.native
  class AttributeCertificateRefs () extends CompleteCertificateRefs
  
  @js.native
  class AttributeRevocationRefs () extends CompleteRevocationRefs
  
  @js.native
  class AttributeRevocationValues () extends RevocationValues
  
  @js.native
  class RefsOnlyTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SigAndRefsTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class SignatureTimeStamp () extends XAdESTimeStamp
  
  @js.native
  class UnsignedSignatureProperties () extends XmlCollection[UnsignedSignatureProperty] {
    var Id: String = js.native
  }
  
  @js.native
  class UnsignedSignatureProperty () extends XmlObject
  
}

