package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesLoggingEnabledMod.UnmarshalledLoggingEnabled
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketLoggingOutput", JSImport.Namespace)
@js.native
object typesGetBucketLoggingOutputMod extends js.Object {
  @js.native
  trait GetBucketLoggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Container for logging information. Presence of this element indicates that logging is enabled. Parameters TargetBucket and TargetPrefix are required in this case.</p>
      */
    var LoggingEnabled: js.UndefOr[UnmarshalledLoggingEnabled] = js.native
  }
  
}

