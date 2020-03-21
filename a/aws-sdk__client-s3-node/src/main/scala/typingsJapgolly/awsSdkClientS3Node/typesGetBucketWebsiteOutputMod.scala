package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesErrorDocumentMod.UnmarshalledErrorDocument
import typingsJapgolly.awsSdkClientS3Node.typesIndexDocumentMod.UnmarshalledIndexDocument
import typingsJapgolly.awsSdkClientS3Node.typesRedirectAllRequestsToMod.UnmarshalledRedirectAllRequestsTo
import typingsJapgolly.awsSdkClientS3Node.typesRoutingRuleMod.UnmarshalledRoutingRule
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketWebsiteOutput", JSImport.Namespace)
@js.native
object typesGetBucketWebsiteOutputMod extends js.Object {
  @js.native
  trait GetBucketWebsiteOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _ErrorDocument shape
      */
    var ErrorDocument: js.UndefOr[UnmarshalledErrorDocument] = js.native
    /**
      * _IndexDocument shape
      */
    var IndexDocument: js.UndefOr[UnmarshalledIndexDocument] = js.native
    /**
      * _RedirectAllRequestsTo shape
      */
    var RedirectAllRequestsTo: js.UndefOr[UnmarshalledRedirectAllRequestsTo] = js.native
    /**
      * _RoutingRules shape
      */
    var RoutingRules: js.UndefOr[js.Array[UnmarshalledRoutingRule]] = js.native
  }
  
}

