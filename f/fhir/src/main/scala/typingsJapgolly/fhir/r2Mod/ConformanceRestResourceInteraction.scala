package typingsJapgolly.fhir.r2Mod

import typingsJapgolly.fhir.fhirStrings.`history-instance`
import typingsJapgolly.fhir.fhirStrings.`history-type`
import typingsJapgolly.fhir.fhirStrings.`search-type`
import typingsJapgolly.fhir.fhirStrings.create
import typingsJapgolly.fhir.fhirStrings.delete_
import typingsJapgolly.fhir.fhirStrings.read
import typingsJapgolly.fhir.fhirStrings.update
import typingsJapgolly.fhir.fhirStrings.validate
import typingsJapgolly.fhir.fhirStrings.vread
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConformanceRestResourceInteraction
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  /**
    * Coded identifier of the operation, supported by the system resource.
    */
  var code: read | vread | update | delete_ | `history-instance` | validate | `history-type` | create | `search-type`
  
  /**
    * REST allows a degree of variability in the implementation of RESTful solutions that is useful for exchange partners to be aware of.
    */
  var documentation: js.UndefOr[String] = js.undefined
}
object ConformanceRestResourceInteraction {
  
  inline def apply(
    code: read | vread | update | delete_ | `history-instance` | validate | `history-type` | create | `search-type`
  ): ConformanceRestResourceInteraction = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformanceRestResourceInteraction]
  }
  
  extension [Self <: ConformanceRestResourceInteraction](x: Self) {
    
    inline def setCode(
      value: read | vread | update | delete_ | `history-instance` | validate | `history-type` | create | `search-type`
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
  }
}
