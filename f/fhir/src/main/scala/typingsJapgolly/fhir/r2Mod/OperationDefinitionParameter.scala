package typingsJapgolly.fhir.r2Mod

import typingsJapgolly.fhir.fhirStrings.in
import typingsJapgolly.fhir.fhirStrings.out
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationDefinitionParameter
  extends StObject
     with BackboneElement {
  
  var _documentation: js.UndefOr[Element] = js.undefined
  
  var _max: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
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
    * The name of used to identify the parameter.
    */
  var name: String
  
  /**
    * The parts of a Tuple Parameter.
    */
  var part: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  
  /**
    * A profile the specifies the rules that this parameter must conform to.
    */
  var profile: js.UndefOr[Reference] = js.undefined
  
  /**
    * The type for this parameter.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this is an input or an output parameter.
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
    
    inline def setProfile(value: Reference): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUse(value: in | out): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def set_documentation(value: Element): Self = StObject.set(x, "_documentation", value.asInstanceOf[js.Any])
    
    inline def set_documentationUndefined: Self = StObject.set(x, "_documentation", js.undefined)
    
    inline def set_max(value: Element): Self = StObject.set(x, "_max", value.asInstanceOf[js.Any])
    
    inline def set_maxUndefined: Self = StObject.set(x, "_max", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    inline def set_use(value: Element): Self = StObject.set(x, "_use", value.asInstanceOf[js.Any])
    
    inline def set_useUndefined: Self = StObject.set(x, "_use", js.undefined)
  }
}
