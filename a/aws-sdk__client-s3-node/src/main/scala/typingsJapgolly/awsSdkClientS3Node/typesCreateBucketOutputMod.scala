package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/CreateBucketOutput", JSImport.Namespace)
@js.native
object typesCreateBucketOutputMod extends js.Object {
  @js.native
  trait CreateBucketOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _Location shape
      */
    var Location: js.UndefOr[String] = js.native
  }
  
}

