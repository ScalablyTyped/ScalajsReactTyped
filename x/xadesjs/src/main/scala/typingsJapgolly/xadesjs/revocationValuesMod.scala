package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.encapsulatedPkiDataMod.EncapsulatedPKIData
import typingsJapgolly.xmlCore.mod.XmlCollection
import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/revocation_values", JSImport.Namespace)
@js.native
object revocationValuesMod extends js.Object {
  @js.native
  class CRLValues () extends XmlCollection[EncapsulatedCRLValue]
  
  @js.native
  class EncapsulatedCRLValue () extends EncapsulatedPKIData
  
  @js.native
  class EncapsulatedOCSPValue () extends EncapsulatedPKIData
  
  @js.native
  class OCSPValues () extends XmlCollection[EncapsulatedOCSPValue]
  
  @js.native
  class OtherValue () extends EncapsulatedPKIData
  
  @js.native
  class OtherValues () extends XmlCollection[OtherValue]
  
  @js.native
  class RevocationValues () extends XmlObject {
    var CRLValues: typingsJapgolly.xadesjs.revocationValuesMod.CRLValues = js.native
    var Id: String = js.native
    var OCSPValues: typingsJapgolly.xadesjs.revocationValuesMod.OCSPValues = js.native
    var OtherValues: typingsJapgolly.xadesjs.revocationValuesMod.OtherValues = js.native
  }
  
}

