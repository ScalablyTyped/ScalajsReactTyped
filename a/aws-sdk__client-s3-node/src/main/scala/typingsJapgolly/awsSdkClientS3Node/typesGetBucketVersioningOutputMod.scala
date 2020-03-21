package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Disabled
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketVersioningOutput", JSImport.Namespace)
@js.native
object typesGetBucketVersioningOutputMod extends js.Object {
  @js.native
  trait GetBucketVersioningOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.</p>
      */
    var MFADelete: js.UndefOr[Enabled | Disabled | String] = js.native
    /**
      * <p>The versioning state of the bucket.</p>
      */
    var Status: js.UndefOr[Enabled | Suspended | String] = js.native
  }
  
}

