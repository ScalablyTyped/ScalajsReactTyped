package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesLifecycleRuleMod.UnmarshalledLifecycleRule
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketLifecycleConfigurationOutput", JSImport.Namespace)
@js.native
object typesGetBucketLifecycleConfigurationOutputMod extends js.Object {
  @js.native
  trait GetBucketLifecycleConfigurationOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _LifecycleRules shape
      */
    var Rules: js.UndefOr[js.Array[UnmarshalledLifecycleRule]] = js.native
  }
  
}

