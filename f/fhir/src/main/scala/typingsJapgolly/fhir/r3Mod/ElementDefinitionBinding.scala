package typingsJapgolly.fhir.r3Mod

import typingsJapgolly.fhir.fhirStrings.example
import typingsJapgolly.fhir.fhirStrings.extensible
import typingsJapgolly.fhir.fhirStrings.preferred
import typingsJapgolly.fhir.fhirStrings.required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementDefinitionBinding
  extends StObject
     with Element {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _strength: js.UndefOr[Element] = js.undefined
  
  var _valueSetUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the intended use of this particular set of codes.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * For further discussion, see [Using Terminologies](terminologies.html).
    */
  var strength: required | extensible | preferred | example
  
  /**
    * For value sets with a referenceResource, the display can contain the value set description.  The reference may be version-specific or not.
    */
  var valueSetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * For value sets with a referenceResource, the display can contain the value set description.  The reference may be version-specific or not.
    */
  var valueSetUri: js.UndefOr[String] = js.undefined
}
object ElementDefinitionBinding {
  
  inline def apply(strength: required | extensible | preferred | example): ElementDefinitionBinding = {
    val __obj = js.Dynamic.literal(strength = strength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionBinding]
  }
  
  extension [Self <: ElementDefinitionBinding](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setStrength(value: required | extensible | preferred | example): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setValueSetReference(value: Reference): Self = StObject.set(x, "valueSetReference", value.asInstanceOf[js.Any])
    
    inline def setValueSetReferenceUndefined: Self = StObject.set(x, "valueSetReference", js.undefined)
    
    inline def setValueSetUri(value: String): Self = StObject.set(x, "valueSetUri", value.asInstanceOf[js.Any])
    
    inline def setValueSetUriUndefined: Self = StObject.set(x, "valueSetUri", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_strength(value: Element): Self = StObject.set(x, "_strength", value.asInstanceOf[js.Any])
    
    inline def set_strengthUndefined: Self = StObject.set(x, "_strength", js.undefined)
    
    inline def set_valueSetUri(value: Element): Self = StObject.set(x, "_valueSetUri", value.asInstanceOf[js.Any])
    
    inline def set_valueSetUriUndefined: Self = StObject.set(x, "_valueSetUri", js.undefined)
  }
}
