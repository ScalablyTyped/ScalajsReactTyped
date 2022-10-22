package typingsJapgolly.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSummaryOutput extends StObject {
  
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
    * The value that's defined in the Description property of the template.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Description] = js.undefined
  
  /**
    * The value that's defined for the Metadata property of the template.
    */
  var Metadata: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Metadata] = js.undefined
  
  /**
    * A list of parameter declarations that describe various properties for each parameter.
    */
  var Parameters: js.UndefOr[ParameterDeclarations] = js.undefined
  
  /**
    * A list of resource identifier summaries that describe the target resources of an import operation and the properties you can provide during the import to identify the target resources. For example, BucketName is a possible identifier property for an AWS::S3::Bucket resource.
    */
  var ResourceIdentifierSummaries: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ResourceIdentifierSummaries] = js.undefined
  
  /**
    * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
    */
  var ResourceTypes: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.ResourceTypes] = js.undefined
  
  /**
    * The Amazon Web Services template format version, which identifies the capabilities of the template.
    */
  var Version: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudformationMod.Version] = js.undefined
}
object GetTemplateSummaryOutput {
  
  inline def apply(): GetTemplateSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSummaryOutput]
  }
  
  extension [Self <: GetTemplateSummaryOutput](x: Self) {
    
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
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    inline def setParameters(value: ParameterDeclarations): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setParametersVarargs(value: ParameterDeclaration*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setResourceIdentifierSummaries(value: ResourceIdentifierSummaries): Self = StObject.set(x, "ResourceIdentifierSummaries", value.asInstanceOf[js.Any])
    
    inline def setResourceIdentifierSummariesUndefined: Self = StObject.set(x, "ResourceIdentifierSummaries", js.undefined)
    
    inline def setResourceIdentifierSummariesVarargs(value: ResourceIdentifierSummary*): Self = StObject.set(x, "ResourceIdentifierSummaries", js.Array(value*))
    
    inline def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value*))
    
    inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
