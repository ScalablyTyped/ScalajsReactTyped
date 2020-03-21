package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.AES256
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.awsColonkms
import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/UploadPartOutput", JSImport.Namespace)
@js.native
object typesUploadPartOutputMod extends js.Object {
  @js.native
  trait UploadPartOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Entity tag for the uploaded object.</p>
      */
    var ETag: js.UndefOr[String] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.</p>
      */
    var SSECustomerAlgorithm: js.UndefOr[String] = js.native
    /**
      * <p>If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round trip message integrity verification of the customer-provided encryption key.</p>
      */
    var SSECustomerKeyMD5: js.UndefOr[String] = js.native
    /**
      * <p>If present, specifies the ID of the AWS Key Management Service (KMS) master encryption key that was used for the object.</p>
      */
    var SSEKMSKeyId: js.UndefOr[String] = js.native
    /**
      * <p>The Server-side encryption algorithm used when storing this object in S3 (e.g., AES256, aws:kms).</p>
      */
    var ServerSideEncryption: js.UndefOr[AES256 | awsColonkms | String] = js.native
  }
  
}

