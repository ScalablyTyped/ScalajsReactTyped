package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.anyMod.Any
import typingsJapgolly.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/certificate_values", JSImport.Namespace)
@js.native
object certificateValuesMod extends js.Object {
  @js.native
  class CertificateValues () extends XmlObject {
    var EncapsulatedX509Certificates: EncapsulatedX509CertificateCollection = js.native
    var Id: String = js.native
    var OtherCertificates: OtherCertificateCollection = js.native
  }
  
  @js.native
  class EncapsulatedX509Certificate () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedX509CertificateCollection () extends XmlCollection[EncapsulatedX509Certificate]
  
  @js.native
  class OtherCertificate () extends Any
  
  @js.native
  class OtherCertificateCollection () extends XmlCollection[OtherCertificate]
  
}

