package typingsJapgolly.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionGuideline
  extends StObject
     with BackboneElement {
  
  var _intendedUse: js.UndefOr[Element] = js.undefined
  
  var _usageInstruction: js.UndefOr[Element] = js.undefined
  
  /**
    * A specific situation when a device should not be used because it may cause harm.
    */
  var contraindication: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * A clinical condition for which the device was designed to be used.
    */
  var indication: js.UndefOr[js.Array[CodeableReference]] = js.undefined
  
  /**
    * A description of the general purpose or medical use of the device or its function.
    */
  var intendedUse: js.UndefOr[String] = js.undefined
  
  /**
    * A source of information or reference for this guideline.
    */
  var relatedArtifact: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Detailed written and visual directions for the user on how to use the device.
    */
  var usageInstruction: js.UndefOr[String] = js.undefined
  
  /**
    * The circumstances that form the setting for using the device.
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Specific hazard alert information that a user needs to know before using the device.
    */
  var warning: js.UndefOr[js.Array[CodeableReference]] = js.undefined
}
object DeviceDefinitionGuideline {
  
  inline def apply(): DeviceDefinitionGuideline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceDefinitionGuideline]
  }
  
  extension [Self <: DeviceDefinitionGuideline](x: Self) {
    
    inline def setContraindication(value: js.Array[CodeableReference]): Self = StObject.set(x, "contraindication", value.asInstanceOf[js.Any])
    
    inline def setContraindicationUndefined: Self = StObject.set(x, "contraindication", js.undefined)
    
    inline def setContraindicationVarargs(value: CodeableReference*): Self = StObject.set(x, "contraindication", js.Array(value*))
    
    inline def setIndication(value: js.Array[CodeableReference]): Self = StObject.set(x, "indication", value.asInstanceOf[js.Any])
    
    inline def setIndicationUndefined: Self = StObject.set(x, "indication", js.undefined)
    
    inline def setIndicationVarargs(value: CodeableReference*): Self = StObject.set(x, "indication", js.Array(value*))
    
    inline def setIntendedUse(value: String): Self = StObject.set(x, "intendedUse", value.asInstanceOf[js.Any])
    
    inline def setIntendedUseUndefined: Self = StObject.set(x, "intendedUse", js.undefined)
    
    inline def setRelatedArtifact(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "relatedArtifact", value.asInstanceOf[js.Any])
    
    inline def setRelatedArtifactUndefined: Self = StObject.set(x, "relatedArtifact", js.undefined)
    
    inline def setRelatedArtifactVarargs(value: RelatedArtifact*): Self = StObject.set(x, "relatedArtifact", js.Array(value*))
    
    inline def setUsageInstruction(value: String): Self = StObject.set(x, "usageInstruction", value.asInstanceOf[js.Any])
    
    inline def setUsageInstructionUndefined: Self = StObject.set(x, "usageInstruction", js.undefined)
    
    inline def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    inline def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    inline def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value*))
    
    inline def setWarning(value: js.Array[CodeableReference]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def setWarningVarargs(value: CodeableReference*): Self = StObject.set(x, "warning", js.Array(value*))
    
    inline def set_intendedUse(value: Element): Self = StObject.set(x, "_intendedUse", value.asInstanceOf[js.Any])
    
    inline def set_intendedUseUndefined: Self = StObject.set(x, "_intendedUse", js.undefined)
    
    inline def set_usageInstruction(value: Element): Self = StObject.set(x, "_usageInstruction", value.asInstanceOf[js.Any])
    
    inline def set_usageInstructionUndefined: Self = StObject.set(x, "_usageInstruction", js.undefined)
  }
}
