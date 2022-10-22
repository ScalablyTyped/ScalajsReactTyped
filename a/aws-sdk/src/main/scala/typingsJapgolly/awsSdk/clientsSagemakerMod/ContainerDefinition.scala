package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerDefinition extends StObject {
  
  /**
    * This parameter is ignored for models that contain only a PrimaryContainer. When a ContainerDefinition is part of an inference pipeline, the value of the parameter uniquely identifies the container for the purposes of logging and metrics. For information, see Use Logs and Metrics to Monitor an Inference Pipeline. If you don't specify a value for this parameter for a ContainerDefinition that is part of an inference pipeline, a unique name is automatically assigned based on the position of the ContainerDefinition in the pipeline. If you specify a value for the ContainerHostName for any ContainerDefinition that is part of an inference pipeline, you must specify a value for the ContainerHostName parameter of every ContainerDefinition in that pipeline.
    */
  var ContainerHostname: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ContainerHostname] = js.undefined
  
  /**
    * The environment variables to set in the Docker container. Each key and value in the Environment string to string map can have length of up to 1024. We support up to 16 entries in the map. 
    */
  var Environment: js.UndefOr[EnvironmentMap] = js.undefined
  
  /**
    * The path where inference code is stored. This can be either in Amazon EC2 Container Registry or in a Docker registry that is accessible from the same VPC that you configure for your endpoint. If you are using your own custom algorithm instead of an algorithm provided by SageMaker, the inference code must meet SageMaker requirements. SageMaker supports both registry/repository[:tag] and registry/repository[@digest] image path formats. For more information, see Using Your Own Algorithms with Amazon SageMaker 
    */
  var Image: js.UndefOr[ContainerImage] = js.undefined
  
  /**
    * Specifies whether the model container is in Amazon ECR or a private Docker registry accessible from your Amazon Virtual Private Cloud (VPC). For information about storing containers in a private Docker registry, see Use a Private Docker Registry for Real-Time Inference Containers 
    */
  var ImageConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.ImageConfig] = js.undefined
  
  /**
    * The inference specification name in the model package version.
    */
  var InferenceSpecificationName: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.InferenceSpecificationName] = js.undefined
  
  /**
    * Whether the container hosts a single model or multiple models.
    */
  var Mode: js.UndefOr[ContainerMode] = js.undefined
  
  /**
    * The S3 path where the model artifacts, which result from model training, are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix). The S3 path is required for SageMaker built-in algorithms, but not if you use your own algorithms. For more information on built-in algorithms, see Common Parameters.   The model artifacts must be in an S3 bucket that is in the same region as the model or endpoint you are creating.  If you provide a value for this parameter, SageMaker uses Amazon Web Services Security Token Service to download model artifacts from the S3 path you provide. Amazon Web Services STS is activated in your IAM user account by default. If you previously deactivated Amazon Web Services STS for a region, you need to reactivate Amazon Web Services STS for that region. For more information, see Activating and Deactivating Amazon Web Services STS in an Amazon Web Services Region in the Amazon Web Services Identity and Access Management User Guide.  If you use a built-in algorithm to create a model, SageMaker requires that you provide a S3 path to the model artifacts in ModelDataUrl. 
    */
  var ModelDataUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of the model package to use to create the model.
    */
  var ModelPackageName: js.UndefOr[VersionedArnOrName] = js.undefined
  
  /**
    * Specifies additional configuration for multi-model endpoints.
    */
  var MultiModelConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsSagemakerMod.MultiModelConfig] = js.undefined
}
object ContainerDefinition {
  
  inline def apply(): ContainerDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerDefinition]
  }
  
  extension [Self <: ContainerDefinition](x: Self) {
    
    inline def setContainerHostname(value: ContainerHostname): Self = StObject.set(x, "ContainerHostname", value.asInstanceOf[js.Any])
    
    inline def setContainerHostnameUndefined: Self = StObject.set(x, "ContainerHostname", js.undefined)
    
    inline def setEnvironment(value: EnvironmentMap): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setImage(value: ContainerImage): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageConfig(value: ImageConfig): Self = StObject.set(x, "ImageConfig", value.asInstanceOf[js.Any])
    
    inline def setImageConfigUndefined: Self = StObject.set(x, "ImageConfig", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setInferenceSpecificationName(value: InferenceSpecificationName): Self = StObject.set(x, "InferenceSpecificationName", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecificationNameUndefined: Self = StObject.set(x, "InferenceSpecificationName", js.undefined)
    
    inline def setMode(value: ContainerMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    inline def setModelDataUrl(value: Url): Self = StObject.set(x, "ModelDataUrl", value.asInstanceOf[js.Any])
    
    inline def setModelDataUrlUndefined: Self = StObject.set(x, "ModelDataUrl", js.undefined)
    
    inline def setModelPackageName(value: VersionedArnOrName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageNameUndefined: Self = StObject.set(x, "ModelPackageName", js.undefined)
    
    inline def setMultiModelConfig(value: MultiModelConfig): Self = StObject.set(x, "MultiModelConfig", value.asInstanceOf[js.Any])
    
    inline def setMultiModelConfigUndefined: Self = StObject.set(x, "MultiModelConfig", js.undefined)
  }
}
