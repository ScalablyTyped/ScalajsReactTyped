package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateTemplateOutput extends StObject {
  
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Capabilities] = js.undefined
  
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.CapabilitiesReason] = js.undefined
  
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined
  
  /**
    * The description found within the template.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * A list of TemplateParameter structures.
    */
  var Parameters: js.UndefOr[TemplateParameters] = js.undefined
}
object ValidateTemplateOutput {
  
  inline def apply(): ValidateTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateTemplateOutput]
  }
  
  extension [Self <: ValidateTemplateOutput](x: Self) {
    
    inline def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesReason(value: CapabilitiesReason): Self = StObject.set(x, "CapabilitiesReason", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesReasonUndefined: Self = StObject.set(x, "CapabilitiesReason", js.undefined)
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value*))
    
    inline def setDeclaredTransforms(value: TransformsList): Self = StObject.set(x, "DeclaredTransforms", value.asInstanceOf[js.Any])
    
    inline def setDeclaredTransformsUndefined: Self = StObject.set(x, "DeclaredTransforms", js.undefined)
    
    inline def setDeclaredTransformsVarargs(value: TransformName*): Self = StObject.set(x, "DeclaredTransforms", js.Array(value*))
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setParameters(value: TemplateParameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: TemplateParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
  }
}
