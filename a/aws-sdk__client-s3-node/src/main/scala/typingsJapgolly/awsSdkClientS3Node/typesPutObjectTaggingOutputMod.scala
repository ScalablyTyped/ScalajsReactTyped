package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/PutObjectTaggingOutput", JSImport.Namespace)
@js.native
object typesPutObjectTaggingOutputMod extends js.Object {
  @js.native
  trait PutObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

