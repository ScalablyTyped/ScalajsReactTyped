package typingsJapgolly.fhir.r4Mod

import typingsJapgolly.fhir.fhirStrings.composite
import typingsJapgolly.fhir.fhirStrings.date
import typingsJapgolly.fhir.fhirStrings.in
import typingsJapgolly.fhir.fhirStrings.number
import typingsJapgolly.fhir.fhirStrings.out
import typingsJapgolly.fhir.fhirStrings.quantity_
import typingsJapgolly.fhir.fhirStrings.reference
import typingsJapgolly.fhir.fhirStrings.special
import typingsJapgolly.fhir.fhirStrings.string
import typingsJapgolly.fhir.fhirStrings.token
import typingsJapgolly.fhir.fhirStrings.uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDefinitionParameter
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _searchType: js.UndefOr[Element] = js.undefined
  
  var _targetProfile: js.UndefOr[js.Array[Element]] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  var _use: js.UndefOr[Element] = js.undefined
  
  /**
    * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept).
    */
  var binding: js.UndefOr[OperationDefinitionParameterBinding] = js.undefined
  
  /**
    * Describes the meaning or use of this parameter.
    */
  var documentation: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of times this element is permitted to appear in the request or response.
    */
  var max: String
  
  /**
    * The minimum number of times this parameter SHALL appear in the request or response.
    */
  var min: Double
  
  /**
    * This name must be a token (start with a letter in a..z, and only contain letters, numerals, and underscore. Note that for search parameters (type = string, with a search type), the name may be altered by the search modifiers.
    */
  var name: String
  
  /**
    * Query Definitions only have one output parameter, named "result". This might not be described, but can be to allow a profile to be defined.
    */
  var part: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  
  /**
    * Resolution applies if the referenced parameter exists.
    */
  var referencedFrom: js.UndefOr[js.Array[OperationDefinitionParameterReferencedFrom]] = js.undefined
  
  /**
    * How the parameter is understood as a search parameter. This is only used if the parameter type is 'string'.
    */
  var searchType: js.UndefOr[
    number | date | string | token | reference | composite | quantity_ | uri | special
  ] = js.undefined
  
  /**
    * Often, these profiles are the base definitions from the spec (e.g. http://hl7.org/fhir/StructureDefinition/Patient).
    */
  var targetProfile: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * if there is no stated parameter, then the parameter is a multi-part parameter; type and must have at least one part defined.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * If a parameter name is used for both an input and an output parameter, the parameter should be defined twice.
    */
  var use: in | out
}
object OperationDefinitionParameter {
  
  inline def apply(max: String, min: Double, name: String, use: in | out): OperationDefinitionParameter = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionParameter]
  }
  
  extension [Self <: OperationDefinitionParameter](x: Self) {
    
    inline def setBinding(value: OperationDefinitionParameterBinding): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPart(value: js.Array[OperationDefinitionParameter]): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    inline def setPartVarargs(value: OperationDefinitionParameter*): Self = StObject.set(x, "part", js.Array(value*))
    
    inline def setReferencedFrom(value: js.Array[OperationDefinitionParameterReferencedFrom]): Self = StObject.set(x, "referencedFrom", value.asInstanceOf[js.Any])
    
    inline def setReferencedFromUndefined: Self = StObject.set(x, "referencedFrom", js.undefined)
    
    inline def setReferencedFromVarargs(value: OperationDefinitionParameterReferencedFrom*): Self = StObject.set(x, "referencedFrom", js.Array(value*))
    
    inline def setSearchType(value: number | date | string | token | reference | composite | quantity_ | uri | special): Self = StObject.set(x, "searchType", value.asInstanceOf[js.Any])
    
    inline def setSearchTypeUndefined: Self = StObject.set(x, "searchType", js.undefined)
    
    inline def setTargetProfile(value: js.Array[String]): Self = StObject.set(x, "targetProfile", value.asInstanceOf[js.Any])
    
    inline def setTargetProfileUndefined: Self = StObject.set(x, "targetProfile", js.undefined)
    
    inline def setTargetProfileVarargs(value: String*): Self = StObject.set(x, "targetProfile", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: in | out): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_searchType(value: Element): Self = StObject.set(x, "_searchType", value.asInstanceOf[js.Any])
    
    inline def set_searchTypeUndefined: Self = StObject.set(x, "_searchType", js.undefined)
    
    inline def set_targetProfile(value: js.Array[Element]): Self = StObject.set(x, "_targetProfile", value.asInstanceOf[js.Any])
    
    inline def set_targetProfileUndefined: Self = StObject.set(x, "_targetProfile", js.undefined)
    
    inline def set_targetProfileVarargs(value: Element*): Self = StObject.set(x, "_targetProfile", js.Array(value*))
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
