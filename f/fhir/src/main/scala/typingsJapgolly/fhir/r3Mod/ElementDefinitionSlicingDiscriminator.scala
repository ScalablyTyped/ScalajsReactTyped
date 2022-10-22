package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.`type`
import typingsJapgolly.fhir.fhirStrings.exists
import typingsJapgolly.fhir.fhirStrings.pattern
import typingsJapgolly.fhir.fhirStrings.profile
import typingsJapgolly.fhir.fhirStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionSlicingDiscriminator
  extends StObject
     with Element {
  
  var _path: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The only FHIRPath functions that are allowed are resolve(), and extension(url).
    */
  var path: String
  
  /**
    * How the element value is interpreted when discrimination is evaluated.
    */
  var `type`: value | exists | pattern | typingsJapgolly.fhir.fhirStrings.`type` | profile
}
object ElementDefinitionSlicingDiscriminator {
  
  inline def apply(path: String, `type`: value | exists | pattern | `type` | profile): ElementDefinitionSlicingDiscriminator = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionSlicingDiscriminator]
  }
  
  extension [Self <: ElementDefinitionSlicingDiscriminator](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: value | exists | pattern | `type` | profile): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
