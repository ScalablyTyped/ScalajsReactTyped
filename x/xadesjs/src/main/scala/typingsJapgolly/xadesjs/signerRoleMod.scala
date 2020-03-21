package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.anyMod.Any
import typingsJapgolly.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/signer_role", JSImport.Namespace)
@js.native
object signerRoleMod extends js.Object {
  @js.native
  class CertifiedRole () extends EncapsulatedPKIData
  
  @js.native
  class CertifiedRoles () extends XmlCollection[CertifiedRole]
  
  @js.native
  class ClaimedRole () extends Any
  
  @js.native
  class ClaimedRoles () extends XmlCollection[ClaimedRole]
  
  @js.native
  class SignerRole () extends XmlObject {
    var CertifiedRoles: typingsJapgolly.xadesjs.signerRoleMod.CertifiedRoles = js.native
    var ClaimedRoles: typingsJapgolly.xadesjs.signerRoleMod.ClaimedRoles = js.native
  }
  
}

