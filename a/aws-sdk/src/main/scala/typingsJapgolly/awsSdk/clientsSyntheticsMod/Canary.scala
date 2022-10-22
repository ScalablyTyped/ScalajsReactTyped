package typingsJapgolly.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canary extends StObject {
  
  /**
    * A structure that contains the configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
    */
  var ArtifactConfig: js.UndefOr[ArtifactConfigOutput] = js.undefined
  
  /**
    * The location in Amazon S3 where Synthetics stores artifacts from the runs of this canary. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: js.UndefOr[String] = js.undefined
  
  var Code: js.UndefOr[CanaryCodeOutput] = js.undefined
  
  /**
    * The ARN of the Lambda function that is used as your canary's engine. For more information about Lambda ARN format, see Resources and Conditions for Lambda Actions.
    */
  var EngineArn: js.UndefOr[FunctionArn] = js.undefined
  
  /**
    * The ARN of the IAM role used to run the canary. This role must include lambda.amazonaws.com as a principal in the trust policy.
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The number of days to retain data about failed runs of this canary.
    */
  var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined
  
  /**
    * The unique ID of this canary.
    */
  var Id: js.UndefOr[UUID] = js.undefined
  
  /**
    * The name of the canary.
    */
  var Name: js.UndefOr[CanaryName] = js.undefined
  
  var RunConfig: js.UndefOr[CanaryRunConfigOutput] = js.undefined
  
  /**
    * Specifies the runtime version to use for the canary. For more information about runtime versions, see  Canary Runtime Versions.
    */
  var RuntimeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A structure that contains information about how often the canary is to run, and when these runs are to stop.
    */
  var Schedule: js.UndefOr[CanaryScheduleOutput] = js.undefined
  
  /**
    * A structure that contains information about the canary's status.
    */
  var Status: js.UndefOr[CanaryStatus] = js.undefined
  
  /**
    * The number of days to retain data about successful runs of this canary.
    */
  var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined
  
  /**
    * The list of key-value pairs that are associated with the canary.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * A structure that contains information about when the canary was created, modified, and most recently run.
    */
  var Timeline: js.UndefOr[CanaryTimeline] = js.undefined
  
  /**
    * If this canary performs visual monitoring by comparing screenshots, this structure contains the ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of the screen to ignore during the visual monitoring comparison.
    */
  var VisualReference: js.UndefOr[VisualReferenceOutput] = js.undefined
  
  var VpcConfig: js.UndefOr[VpcConfigOutput] = js.undefined
}
object Canary {
  
  inline def apply(): Canary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Canary]
  }
  
  extension [Self <: Canary](x: Self) {
    
    inline def setArtifactConfig(value: ArtifactConfigOutput): Self = StObject.set(x, "ArtifactConfig", value.asInstanceOf[js.Any])
    
    inline def setArtifactConfigUndefined: Self = StObject.set(x, "ArtifactConfig", js.undefined)
    
    inline def setArtifactS3Location(value: String): Self = StObject.set(x, "ArtifactS3Location", value.asInstanceOf[js.Any])
    
    inline def setArtifactS3LocationUndefined: Self = StObject.set(x, "ArtifactS3Location", js.undefined)
    
    inline def setCode(value: CanaryCodeOutput): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setEngineArn(value: FunctionArn): Self = StObject.set(x, "EngineArn", value.asInstanceOf[js.Any])
    
    inline def setEngineArnUndefined: Self = StObject.set(x, "EngineArn", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setFailureRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "FailureRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setFailureRetentionPeriodInDaysUndefined: Self = StObject.set(x, "FailureRetentionPeriodInDays", js.undefined)
    
    inline def setId(value: UUID): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRunConfig(value: CanaryRunConfigOutput): Self = StObject.set(x, "RunConfig", value.asInstanceOf[js.Any])
    
    inline def setRunConfigUndefined: Self = StObject.set(x, "RunConfig", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "RuntimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "RuntimeVersion", js.undefined)
    
    inline def setSchedule(value: CanaryScheduleOutput): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setStatus(value: CanaryStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setSuccessRetentionPeriodInDaysUndefined: Self = StObject.set(x, "SuccessRetentionPeriodInDays", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTimeline(value: CanaryTimeline): Self = StObject.set(x, "Timeline", value.asInstanceOf[js.Any])
    
    inline def setTimelineUndefined: Self = StObject.set(x, "Timeline", js.undefined)
    
    inline def setVisualReference(value: VisualReferenceOutput): Self = StObject.set(x, "VisualReference", value.asInstanceOf[js.Any])
    
    inline def setVisualReferenceUndefined: Self = StObject.set(x, "VisualReference", js.undefined)
    
    inline def setVpcConfig(value: VpcConfigOutput): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
