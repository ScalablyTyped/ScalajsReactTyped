package typingsJapgolly.xadesjs

import typingsJapgolly.xmlCore.mod.XmlObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xadesjs/build/types/xml/encapsulated_pki_data", JSImport.Namespace)
@js.native
object encapsulatedPkiDataMod extends js.Object {
  @js.native
  class EncapsulatedPKIData () extends XmlObject {
    var Encoding: EncodingType = js.native
    var Id: String = js.native
    var Value: scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  trait _EncodingType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xadesjs.xadesjsStrings.der
    - typingsJapgolly.xadesjs.xadesjsStrings.ber
    - typingsJapgolly.xadesjs.xadesjsStrings.cer
    - typingsJapgolly.xadesjs.xadesjsStrings.per
    - typingsJapgolly.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
}

