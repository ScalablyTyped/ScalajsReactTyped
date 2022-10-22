package typingsJapgolly.xadesjs

import typingsJapgolly.xadesjs.buildTypesXmlXmlBaseMod.XadesObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesXmlEncapsulatedPkiDataMod {
  
  @JSImport("xadesjs/build/types/xml/encapsulated_pki_data", "EncapsulatedPKIData")
  @js.native
  open class EncapsulatedPKIData () extends XadesObject {
    def this(properties: js.Object) = this()
    
    var Encoding: EncodingType = js.native
    
    var Id: String = js.native
    
    var Value: js.typedarray.Uint8Array = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.xadesjs.xadesjsStrings.der
    - typingsJapgolly.xadesjs.xadesjsStrings.ber
    - typingsJapgolly.xadesjs.xadesjsStrings.cer
    - typingsJapgolly.xadesjs.xadesjsStrings.per
    - typingsJapgolly.xadesjs.xadesjsStrings.xer
    - scala.Null
  */
  type EncodingType = _EncodingType | Null
  
  trait _EncodingType extends StObject
}
