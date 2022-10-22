package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningParametersOutput extends StObject {
  
  /**
    * Information about the constraints used to provision the product.
    */
  var ConstraintSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ConstraintSummaries] = js.undefined
  
  /**
    * A list of the keys and descriptions of the outputs. These outputs can be referenced from a provisioned product launched from this provisioning artifact.
    */
  var ProvisioningArtifactOutputKeys: js.UndefOr[ProvisioningArtifactOutputs] = js.undefined
  
  /**
    * The output of the provisioning artifact.
    */
  var ProvisioningArtifactOutputs: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ProvisioningArtifactOutputs] = js.undefined
  
  /**
    * Information about the parameters used to provision the product.
    */
  var ProvisioningArtifactParameters: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ProvisioningArtifactParameters] = js.undefined
  
  /**
    * An object that contains information about preferences, such as Regions and accounts, for the provisioning artifact.
    */
  var ProvisioningArtifactPreferences: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ProvisioningArtifactPreferences] = js.undefined
  
  /**
    * Information about the TagOptions associated with the resource.
    */
  var TagOptions: js.UndefOr[TagOptionSummaries] = js.undefined
  
  /**
    * Any additional metadata specifically related to the provisioning of the product. For example, see the Version field of the CloudFormation template.
    */
  var UsageInstructions: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.UsageInstructions] = js.undefined
}
object DescribeProvisioningParametersOutput {
  
  inline def apply(): DescribeProvisioningParametersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningParametersOutput]
  }
  
  extension [Self <: DescribeProvisioningParametersOutput](x: Self) {
    
    inline def setConstraintSummaries(value: ConstraintSummaries): Self = StObject.set(x, "ConstraintSummaries", value.asInstanceOf[js.Any])
    
    inline def setConstraintSummariesUndefined: Self = StObject.set(x, "ConstraintSummaries", js.undefined)
    
    inline def setConstraintSummariesVarargs(value: ConstraintSummary*): Self = StObject.set(x, "ConstraintSummaries", js.Array(value*))
    
    inline def setProvisioningArtifactOutputKeys(value: ProvisioningArtifactOutputs): Self = StObject.set(x, "ProvisioningArtifactOutputKeys", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactOutputKeysUndefined: Self = StObject.set(x, "ProvisioningArtifactOutputKeys", js.undefined)
    
    inline def setProvisioningArtifactOutputKeysVarargs(value: ProvisioningArtifactOutput*): Self = StObject.set(x, "ProvisioningArtifactOutputKeys", js.Array(value*))
    
    inline def setProvisioningArtifactOutputs(value: ProvisioningArtifactOutputs): Self = StObject.set(x, "ProvisioningArtifactOutputs", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactOutputsUndefined: Self = StObject.set(x, "ProvisioningArtifactOutputs", js.undefined)
    
    inline def setProvisioningArtifactOutputsVarargs(value: ProvisioningArtifactOutput*): Self = StObject.set(x, "ProvisioningArtifactOutputs", js.Array(value*))
    
    inline def setProvisioningArtifactParameters(value: ProvisioningArtifactParameters): Self = StObject.set(x, "ProvisioningArtifactParameters", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactParametersUndefined: Self = StObject.set(x, "ProvisioningArtifactParameters", js.undefined)
    
    inline def setProvisioningArtifactParametersVarargs(value: ProvisioningArtifactParameter*): Self = StObject.set(x, "ProvisioningArtifactParameters", js.Array(value*))
    
    inline def setProvisioningArtifactPreferences(value: ProvisioningArtifactPreferences): Self = StObject.set(x, "ProvisioningArtifactPreferences", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactPreferencesUndefined: Self = StObject.set(x, "ProvisioningArtifactPreferences", js.undefined)
    
    inline def setTagOptions(value: TagOptionSummaries): Self = StObject.set(x, "TagOptions", value.asInstanceOf[js.Any])
    
    inline def setTagOptionsUndefined: Self = StObject.set(x, "TagOptions", js.undefined)
    
    inline def setTagOptionsVarargs(value: TagOptionSummary*): Self = StObject.set(x, "TagOptions", js.Array(value*))
    
    inline def setUsageInstructions(value: UsageInstructions): Self = StObject.set(x, "UsageInstructions", value.asInstanceOf[js.Any])
    
    inline def setUsageInstructionsUndefined: Self = StObject.set(x, "UsageInstructions", js.undefined)
    
    inline def setUsageInstructionsVarargs(value: UsageInstruction*): Self = StObject.set(x, "UsageInstructions", js.Array(value*))
  }
}
