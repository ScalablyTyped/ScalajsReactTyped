package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.BucketOwner
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Requester
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketRequestPaymentOutput", JSImport.Namespace)
@js.native
object typesGetBucketRequestPaymentOutputMod extends js.Object {
  @js.native
  trait GetBucketRequestPaymentOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies who pays for the download and request fees.</p>
      */
    var Payer: js.UndefOr[Requester | BucketOwner | String] = js.native
  }
  
}

