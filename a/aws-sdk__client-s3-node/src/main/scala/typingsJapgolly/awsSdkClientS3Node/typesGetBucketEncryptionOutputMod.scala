package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesServerSideEncryptionConfigurationMod.UnmarshalledServerSideEncryptionConfiguration
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketEncryptionOutput", JSImport.Namespace)
@js.native
object typesGetBucketEncryptionOutputMod extends js.Object {
  @js.native
  trait GetBucketEncryptionOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for server-side encryption configuration rules. Currently S3 supports one rule only.</p>
      */
    var ServerSideEncryptionConfiguration: js.UndefOr[UnmarshalledServerSideEncryptionConfiguration] = js.native
  }
  
}

