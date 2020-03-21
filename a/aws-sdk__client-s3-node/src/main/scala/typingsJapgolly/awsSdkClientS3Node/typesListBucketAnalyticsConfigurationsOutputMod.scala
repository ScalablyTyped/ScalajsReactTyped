package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesAnalyticsConfigurationMod.UnmarshalledAnalyticsConfiguration
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/ListBucketAnalyticsConfigurationsOutput", JSImport.Namespace)
@js.native
object typesListBucketAnalyticsConfigurationsOutputMod extends js.Object {
  @js.native
  trait ListBucketAnalyticsConfigurationsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>The list of analytics configurations for a bucket.</p>
      */
    var AnalyticsConfigurationList: js.UndefOr[js.Array[UnmarshalledAnalyticsConfiguration]] = js.native
    /**
      * <p>The ContinuationToken that represents where this request began.</p>
      */
    var ContinuationToken: js.UndefOr[String] = js.native
    /**
      * <p>Indicates whether the returned list of analytics configurations is complete. A value of true indicates that the list is not complete and the NextContinuationToken will be provided for a subsequent request.</p>
      */
    var IsTruncated: js.UndefOr[Boolean] = js.native
    /**
      * <p>NextContinuationToken is sent when isTruncated is true, which indicates that there are more analytics configurations to list. The next request must include this NextContinuationToken. The token is obfuscated and is not a usable value.</p>
      */
    var NextContinuationToken: js.UndefOr[String] = js.native
  }
  
}

