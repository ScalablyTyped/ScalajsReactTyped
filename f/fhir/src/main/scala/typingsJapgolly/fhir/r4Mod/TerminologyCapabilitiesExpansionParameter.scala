package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminologyCapabilitiesExpansionParameter
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Description of support for parameter.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Expansion Parameter name.
    */
  var name: String
}
object TerminologyCapabilitiesExpansionParameter {
  
  inline def apply(name: String): TerminologyCapabilitiesExpansionParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminologyCapabilitiesExpansionParameter]
  }
  
  extension [Self <: TerminologyCapabilitiesExpansionParameter](x: Self) {
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
