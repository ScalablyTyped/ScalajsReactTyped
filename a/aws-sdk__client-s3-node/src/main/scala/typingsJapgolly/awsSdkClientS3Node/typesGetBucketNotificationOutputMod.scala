package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.typesCloudFunctionConfigurationMod.UnmarshalledCloudFunctionConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesQueueConfigurationDeprecatedMod.UnmarshalledQueueConfigurationDeprecated
import typingsJapgolly.awsSdkClientS3Node.typesTopicConfigurationDeprecatedMod.UnmarshalledTopicConfigurationDeprecated
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBucketNotificationOutputMod {
  
  trait GetBucketNotificationOutput
    extends StObject
       with MetadataBearer
       with _OutputTypesUnion {
    
    /**
      * _CloudFunctionConfiguration shape
      */
    var CloudFunctionConfiguration: js.UndefOr[UnmarshalledCloudFunctionConfiguration] = js.undefined
    
    /**
      * _QueueConfigurationDeprecated shape
      */
    var QueueConfiguration: js.UndefOr[UnmarshalledQueueConfigurationDeprecated] = js.undefined
    
    /**
      * _TopicConfigurationDeprecated shape
      */
    var TopicConfiguration: js.UndefOr[UnmarshalledTopicConfigurationDeprecated] = js.undefined
  }
  object GetBucketNotificationOutput {
    
    inline def apply($metadata: ResponseMetadata): GetBucketNotificationOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBucketNotificationOutput]
    }
    
    extension [Self <: GetBucketNotificationOutput](x: Self) {
      
      inline def setCloudFunctionConfiguration(value: UnmarshalledCloudFunctionConfiguration): Self = StObject.set(x, "CloudFunctionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setCloudFunctionConfigurationUndefined: Self = StObject.set(x, "CloudFunctionConfiguration", js.undefined)
      
      inline def setQueueConfiguration(value: UnmarshalledQueueConfigurationDeprecated): Self = StObject.set(x, "QueueConfiguration", value.asInstanceOf[js.Any])
      
      inline def setQueueConfigurationUndefined: Self = StObject.set(x, "QueueConfiguration", js.undefined)
      
      inline def setTopicConfiguration(value: UnmarshalledTopicConfigurationDeprecated): Self = StObject.set(x, "TopicConfiguration", value.asInstanceOf[js.Any])
      
      inline def setTopicConfigurationUndefined: Self = StObject.set(x, "TopicConfiguration", js.undefined)
    }
  }
}
