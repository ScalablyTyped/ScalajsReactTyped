package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesLambdaFunctionConfigurationMod.UnmarshalledLambdaFunctionConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesQueueConfigurationMod.UnmarshalledQueueConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesTopicConfigurationMod.UnmarshalledTopicConfiguration
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketNotificationConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketNotificationConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketNotificationConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _LambdaFunctionConfigurationList shape
      */
    var LambdaFunctionConfigurations: js.UndefOr[js.Array[UnmarshalledLambdaFunctionConfiguration]] = js.native
    /**
      * _QueueConfigurationList shape
      */
    var QueueConfigurations: js.UndefOr[js.Array[UnmarshalledQueueConfiguration]] = js.native
    /**
      * _TopicConfigurationList shape
      */
    var TopicConfigurations: js.UndefOr[js.Array[UnmarshalledTopicConfiguration]] = js.native
  }
  
}

