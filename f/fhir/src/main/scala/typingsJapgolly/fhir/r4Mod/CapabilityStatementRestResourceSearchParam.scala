package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.composite
import typingsJapgolly.fhir.fhirStrings.date
import typingsJapgolly.fhir.fhirStrings.number
import typingsJapgolly.fhir.fhirStrings.quantity_
import typingsJapgolly.fhir.fhirStrings.reference
import typingsJapgolly.fhir.fhirStrings.special
import typingsJapgolly.fhir.fhirStrings.string
import typingsJapgolly.fhir.fhirStrings.token
import typingsJapgolly.fhir.fhirStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilityStatementRestResourceSearchParam
  extends StObject
     with BackboneElement {
  
  var _definition: js.UndefOr[Element] = js.undefined
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * This SHOULD be present, and matches refers to a SearchParameter by its canonical URL. If systems wish to document their support for modifiers, comparators, target resource types, and chained parameters, they should do using a search parameter resource. This element SHALL be populated if the search parameter refers to a SearchParameter defined by the FHIR core specification or externally defined IGs.
    */
  var definition: js.UndefOr[String] = js.undefined
  
  /**
    * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * Parameter names cannot overlap with standard parameter names, and standard parameters cannot be redefined.
    */
  var name: String
  
  /**
    * While this can be looked up from the definition, it is included here as a convenience for systems that autogenerate a query interface based on the server capability statement.  It SHALL be the same as the type in the search parameter definition.
    */
  var `type`: number | date | string | token | reference | composite | quantity_ | uri | special
}
object CapabilityStatementRestResourceSearchParam {
  
  inline def apply(
    name: String,
    `type`: number | date | string | token | reference | composite | quantity_ | uri | special
  ): CapabilityStatementRestResourceSearchParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResourceSearchParam]
  }
  
  extension [Self <: CapabilityStatementRestResourceSearchParam](x: Self) {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setDefinitionUndefined: Self = StObject.set(x, "definition", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: number | date | string | token | reference | composite | quantity_ | uri | special): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_definition(value: Element): Self = StObject.set(x, "_definition", value.asInstanceOf[js.Any])
    
    inline def set_definitionUndefined: Self = StObject.set(x, "_definition", js.undefined)
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
