package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelInput extends StObject {
  
  /**
    * Specifies the containers in the inference pipeline.
    */
  var Containers: js.UndefOr[ContainerDefinitionList] = js.undefined
  
  /**
    * Isolates the model container. No inbound or outbound network calls can be made to or from the model container.
    */
  var EnableNetworkIsolation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that SageMaker can assume to access model artifacts and docker image for deployment on ML compute instances or for batch transform jobs. Deploying on ML compute instances is part of model hosting. For more information, see SageMaker Roles.   To be able to pass this role to SageMaker, the caller of this API must have the iam:PassRole permission. 
    */
  var ExecutionRoleArn: RoleArn
  
  /**
    * Specifies details of how containers in a multi-container endpoint are called.
    */
  var InferenceExecutionConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.InferenceExecutionConfig] = js.undefined
  
  /**
    * The name of the new model.
    */
  var ModelName: typingsJapgolly.awsSdk.clientsSagemakerMod.ModelName
  
  /**
    * The location of the primary docker image containing inference code, associated artifacts, and custom environment map that the inference code uses when the model is deployed for predictions. 
    */
  var PrimaryContainer: js.UndefOr[ContainerDefinition] = js.undefined
  
  /**
    * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. For more information, see Tagging Amazon Web Services Resources.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A VpcConfig object that specifies the VPC that you want your model to connect to. Control access to and from your model container by configuring the VPC. VpcConfig is used in hosting services and in batch transform. For more information, see Protect Endpoints by Using an Amazon Virtual Private Cloud and Protect Data in Batch Transform Jobs by Using an Amazon Virtual Private Cloud.
    */
  var VpcConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.VpcConfig] = js.undefined
}
object CreateModelInput {
  
  inline def apply(ExecutionRoleArn: RoleArn, ModelName: ModelName): CreateModelInput = {
    val __obj = js.Dynamic.literal(ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], ModelName = ModelName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelInput]
  }
  
  extension [Self <: CreateModelInput](x: Self) {
    
    inline def setContainers(value: ContainerDefinitionList): Self = StObject.set(x, "Containers", value.asInstanceOf[js.Any])
    
    inline def setContainersUndefined: Self = StObject.set(x, "Containers", js.undefined)
    
    inline def setContainersVarargs(value: ContainerDefinition*): Self = StObject.set(x, "Containers", js.Array(value*))
    
    inline def setEnableNetworkIsolation(value: Boolean): Self = StObject.set(x, "EnableNetworkIsolation", value.asInstanceOf[js.Any])
    
    inline def setEnableNetworkIsolationUndefined: Self = StObject.set(x, "EnableNetworkIsolation", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInferenceExecutionConfig(value: InferenceExecutionConfig): Self = StObject.set(x, "InferenceExecutionConfig", value.asInstanceOf[js.Any])
    
    inline def setInferenceExecutionConfigUndefined: Self = StObject.set(x, "InferenceExecutionConfig", js.undefined)
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContainer(value: ContainerDefinition): Self = StObject.set(x, "PrimaryContainer", value.asInstanceOf[js.Any])
    
    inline def setPrimaryContainerUndefined: Self = StObject.set(x, "PrimaryContainer", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
