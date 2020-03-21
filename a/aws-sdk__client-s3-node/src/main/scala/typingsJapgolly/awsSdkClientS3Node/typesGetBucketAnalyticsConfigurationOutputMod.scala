package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketAnalyticsConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketAnalyticsConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketAnalyticsConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The configuration and any analyses for the analytics filter.</p>
      */
    var AnalyticsConfiguration: js.UndefOr[UnmarshalledAnalyticsConfiguration] = js.native
  }
  
}

