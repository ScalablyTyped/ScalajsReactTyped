package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesCorsruleMod.UnmarshalledCORSRule
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetBucketCorsOutput", JSImport.Namespace)
@js.native
object typesGetBucketCorsOutputMod extends js.Object {
  @js.native
  trait GetBucketCorsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _CORSRules shape
      */
    var CORSRules: js.UndefOr[js.Array[UnmarshalledCORSRule]] = js.native
  }
  
}

