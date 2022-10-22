package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionMaterial
  extends StObject
     with BackboneElement {
  
  var _allergenicIndicator: js.UndefOr[Element] = js.undefined
  
  var _alternate: js.UndefOr[Element] = js.undefined
  
  /**
    * Whether the substance is a known or suspected allergen.
    */
  var allergenicIndicator: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates an alternative material of the device.
    */
  var alternate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A substance that the device contains, may contain, or is made of - for example latex - to be used to determine patient compatibility. This is not intended to represent the composition of the device, only the clinically relevant materials.
    */
  var substance: CodeableConcept
}
object DeviceDefinitionMaterial {
  
  inline def apply(substance: CodeableConcept): DeviceDefinitionMaterial = {
    val __obj = js.Dynamic.literal(substance = substance.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionMaterial]
  }
  
  extension [Self <: DeviceDefinitionMaterial](x: Self) {
    
    inline def setAllergenicIndicator(value: Boolean): Self = StObject.set(x, "allergenicIndicator", value.asInstanceOf[js.Any])
    
    inline def setAllergenicIndicatorUndefined: Self = StObject.set(x, "allergenicIndicator", js.undefined)
    
    inline def setAlternate(value: Boolean): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setAlternateUndefined: Self = StObject.set(x, "alternate", js.undefined)
    
    inline def setSubstance(value: CodeableConcept): Self = StObject.set(x, "substance", value.asInstanceOf[js.Any])
    
    inline def set_allergenicIndicator(value: Element): Self = StObject.set(x, "_allergenicIndicator", value.asInstanceOf[js.Any])
    
    inline def set_allergenicIndicatorUndefined: Self = StObject.set(x, "_allergenicIndicator", js.undefined)
    
    inline def set_alternate(value: Element): Self = StObject.set(x, "_alternate", value.asInstanceOf[js.Any])
    
    inline def set_alternateUndefined: Self = StObject.set(x, "_alternate", js.undefined)
  }
}
