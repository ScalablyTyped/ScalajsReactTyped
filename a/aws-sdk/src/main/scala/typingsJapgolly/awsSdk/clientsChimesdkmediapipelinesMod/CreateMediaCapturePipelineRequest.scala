package typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMediaCapturePipelineRequest extends StObject {
  
  /**
    * The configuration for a specified media pipeline. SourceType must be ChimeSdkMeeting.
    */
  var ChimeSdkMeetingConfiguration: js.UndefOr[
    typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod.ChimeSdkMeetingConfiguration
  ] = js.undefined
  
  /**
    * The unique identifier for the client request. The token makes the API request idempotent. Use a unique token for each media pipeline request.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkmediapipelinesMod.ClientRequestToken] = js.undefined
  
  /**
    * The ARN of the sink type.
    */
  var SinkArn: Arn
  
  /**
    * Destination type to which the media artifacts are saved. You must use an S3 bucket.
    */
  var SinkType: MediaPipelineSinkType
  
  /**
    * ARN of the source from which the media artifacts are captured.
    */
  var SourceArn: Arn
  
  /**
    * Source type from which the media artifacts are captured. A Chime SDK Meeting is the only supported source.
    */
  var SourceType: MediaPipelineSourceType
  
  /**
    * The tag key-value pairs.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateMediaCapturePipelineRequest {
  
  inline def apply(SinkArn: Arn, SinkType: MediaPipelineSinkType, SourceArn: Arn, SourceType: MediaPipelineSourceType): CreateMediaCapturePipelineRequest = {
    val __obj = js.Dynamic.literal(SinkArn = SinkArn.asInstanceOf[js.Any], SinkType = SinkType.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any], SourceType = SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMediaCapturePipelineRequest]
  }
  
  extension [Self <: CreateMediaCapturePipelineRequest](x: Self) {
    
    inline def setChimeSdkMeetingConfiguration(value: ChimeSdkMeetingConfiguration): Self = StObject.set(x, "ChimeSdkMeetingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChimeSdkMeetingConfigurationUndefined: Self = StObject.set(x, "ChimeSdkMeetingConfiguration", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSinkArn(value: Arn): Self = StObject.set(x, "SinkArn", value.asInstanceOf[js.Any])
    
    inline def setSinkType(value: MediaPipelineSinkType): Self = StObject.set(x, "SinkType", value.asInstanceOf[js.Any])
    
    inline def setSourceArn(value: Arn): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    inline def setSourceType(value: MediaPipelineSourceType): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
