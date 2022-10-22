package typingsJapgolly.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionConfiguration extends StObject {
  
  /**
    * The instruction set architecture that the function supports. Architecture is a string array with one of the valid values. The default architecture value is x86_64.
    */
  var Architectures: js.UndefOr[ArchitecturesList] = js.undefined
  
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[String] = js.undefined
  
  /**
    * The size of the function's deployment package, in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
  
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.DeadLetterConfig] = js.undefined
  
  /**
    * The function's description.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Description] = js.undefined
  
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[EnvironmentResponse] = js.undefined
  
  /**
    * The size of the function’s /tmp directory in MB. The default value is 512, but can be any whole number between 512 and 10240 MB.
    */
  var EphemeralStorage: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.EphemeralStorage] = js.undefined
  
  /**
    * Connection settings for an Amazon EFS file system.
    */
  var FileSystemConfigs: js.UndefOr[FileSystemConfigList] = js.undefined
  
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined
  
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined
  
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Handler] = js.undefined
  
  /**
    * The function's image configuration values.
    */
  var ImageConfigResponse: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.ImageConfigResponse] = js.undefined
  
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer managed key.
    */
  var KMSKeyArn: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.KMSKeyArn] = js.undefined
  
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The status of the last update that was performed on the function. This is first set to Successful after function creation completes.
    */
  var LastUpdateStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.LastUpdateStatus] = js.undefined
  
  /**
    * The reason for the last update that was performed on the function.
    */
  var LastUpdateStatusReason: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.LastUpdateStatusReason] = js.undefined
  
  /**
    * The reason code for the last update that was performed on the function.
    */
  var LastUpdateStatusReasonCode: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.LastUpdateStatusReasonCode] = js.undefined
  
  /**
    * The function's  layers.
    */
  var Layers: js.UndefOr[LayersReferenceList] = js.undefined
  
  /**
    * For Lambda@Edge functions, the ARN of the main function.
    */
  var MasterArn: js.UndefOr[FunctionArn] = js.undefined
  
  /**
    * The amount of memory available to the function at runtime. 
    */
  var MemorySize: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.MemorySize] = js.undefined
  
  /**
    * The type of deployment package. Set to Image for container image and set Zip for .zip file archive.
    */
  var PackageType: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.PackageType] = js.undefined
  
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Runtime] = js.undefined
  
  /**
    * The ARN of the signing job.
    */
  var SigningJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the signing profile version.
    */
  var SigningProfileVersionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The current state of the function. When the state is Inactive, you can reactivate the function by invoking it.
    */
  var State: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.State] = js.undefined
  
  /**
    * The reason for the function's current state.
    */
  var StateReason: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.StateReason] = js.undefined
  
  /**
    * The reason code for the function's current state. When the code is Creating, you can't invoke or modify the function.
    */
  var StateReasonCode: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.StateReasonCode] = js.undefined
  
  /**
    * The amount of time in seconds that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Timeout] = js.undefined
  
  /**
    * The function's X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined
  
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[typingsJapgolly.awsSdk.clientsLambdaMod.Version] = js.undefined
  
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
}
object FunctionConfiguration {
  
  inline def apply(): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionConfiguration]
  }
  
  extension [Self <: FunctionConfiguration](x: Self) {
    
    inline def setArchitectures(value: ArchitecturesList): Self = StObject.set(x, "Architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "Architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: Architecture*): Self = StObject.set(x, "Architectures", js.Array(value*))
    
    inline def setCodeSha256(value: String): Self = StObject.set(x, "CodeSha256", value.asInstanceOf[js.Any])
    
    inline def setCodeSha256Undefined: Self = StObject.set(x, "CodeSha256", js.undefined)
    
    inline def setCodeSize(value: Long): Self = StObject.set(x, "CodeSize", value.asInstanceOf[js.Any])
    
    inline def setCodeSizeUndefined: Self = StObject.set(x, "CodeSize", js.undefined)
    
    inline def setDeadLetterConfig(value: DeadLetterConfig): Self = StObject.set(x, "DeadLetterConfig", value.asInstanceOf[js.Any])
    
    inline def setDeadLetterConfigUndefined: Self = StObject.set(x, "DeadLetterConfig", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEnvironment(value: EnvironmentResponse): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
    
    inline def setEphemeralStorage(value: EphemeralStorage): Self = StObject.set(x, "EphemeralStorage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralStorageUndefined: Self = StObject.set(x, "EphemeralStorage", js.undefined)
    
    inline def setFileSystemConfigs(value: FileSystemConfigList): Self = StObject.set(x, "FileSystemConfigs", value.asInstanceOf[js.Any])
    
    inline def setFileSystemConfigsUndefined: Self = StObject.set(x, "FileSystemConfigs", js.undefined)
    
    inline def setFileSystemConfigsVarargs(value: FileSystemConfig*): Self = StObject.set(x, "FileSystemConfigs", js.Array(value*))
    
    inline def setFunctionArn(value: NameSpacedFunctionArn): Self = StObject.set(x, "FunctionArn", value.asInstanceOf[js.Any])
    
    inline def setFunctionArnUndefined: Self = StObject.set(x, "FunctionArn", js.undefined)
    
    inline def setFunctionName(value: NamespacedFunctionName): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setFunctionNameUndefined: Self = StObject.set(x, "FunctionName", js.undefined)
    
    inline def setHandler(value: Handler): Self = StObject.set(x, "Handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerUndefined: Self = StObject.set(x, "Handler", js.undefined)
    
    inline def setImageConfigResponse(value: ImageConfigResponse): Self = StObject.set(x, "ImageConfigResponse", value.asInstanceOf[js.Any])
    
    inline def setImageConfigResponseUndefined: Self = StObject.set(x, "ImageConfigResponse", js.undefined)
    
    inline def setKMSKeyArn(value: KMSKeyArn): Self = StObject.set(x, "KMSKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyArnUndefined: Self = StObject.set(x, "KMSKeyArn", js.undefined)
    
    inline def setLastModified(value: Timestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setLastUpdateStatus(value: LastUpdateStatus): Self = StObject.set(x, "LastUpdateStatus", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusReason(value: LastUpdateStatusReason): Self = StObject.set(x, "LastUpdateStatusReason", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusReasonCode(value: LastUpdateStatusReasonCode): Self = StObject.set(x, "LastUpdateStatusReasonCode", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateStatusReasonCodeUndefined: Self = StObject.set(x, "LastUpdateStatusReasonCode", js.undefined)
    
    inline def setLastUpdateStatusReasonUndefined: Self = StObject.set(x, "LastUpdateStatusReason", js.undefined)
    
    inline def setLastUpdateStatusUndefined: Self = StObject.set(x, "LastUpdateStatus", js.undefined)
    
    inline def setLayers(value: LayersReferenceList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "Layers", js.Array(value*))
    
    inline def setMasterArn(value: FunctionArn): Self = StObject.set(x, "MasterArn", value.asInstanceOf[js.Any])
    
    inline def setMasterArnUndefined: Self = StObject.set(x, "MasterArn", js.undefined)
    
    inline def setMemorySize(value: MemorySize): Self = StObject.set(x, "MemorySize", value.asInstanceOf[js.Any])
    
    inline def setMemorySizeUndefined: Self = StObject.set(x, "MemorySize", js.undefined)
    
    inline def setPackageType(value: PackageType): Self = StObject.set(x, "PackageType", value.asInstanceOf[js.Any])
    
    inline def setPackageTypeUndefined: Self = StObject.set(x, "PackageType", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "RevisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "RevisionId", js.undefined)
    
    inline def setRole(value: RoleArn): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setRuntime(value: Runtime): Self = StObject.set(x, "Runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "Runtime", js.undefined)
    
    inline def setSigningJobArn(value: Arn): Self = StObject.set(x, "SigningJobArn", value.asInstanceOf[js.Any])
    
    inline def setSigningJobArnUndefined: Self = StObject.set(x, "SigningJobArn", js.undefined)
    
    inline def setSigningProfileVersionArn(value: Arn): Self = StObject.set(x, "SigningProfileVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSigningProfileVersionArnUndefined: Self = StObject.set(x, "SigningProfileVersionArn", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonCode(value: StateReasonCode): Self = StObject.set(x, "StateReasonCode", value.asInstanceOf[js.Any])
    
    inline def setStateReasonCodeUndefined: Self = StObject.set(x, "StateReasonCode", js.undefined)
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTimeout(value: Timeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setTracingConfig(value: TracingConfigResponse): Self = StObject.set(x, "TracingConfig", value.asInstanceOf[js.Any])
    
    inline def setTracingConfigUndefined: Self = StObject.set(x, "TracingConfig", js.undefined)
    
    inline def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
    
    inline def setVpcConfig(value: VpcConfigResponse): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
