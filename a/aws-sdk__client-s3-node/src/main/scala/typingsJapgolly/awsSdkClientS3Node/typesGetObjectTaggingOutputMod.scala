package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/GetObjectTaggingOutput", JSImport.Namespace)
@js.native
object typesGetObjectTaggingOutputMod extends js.Object {
  @js.native
  trait GetObjectTaggingOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _TagSet shape
      */
    var TagSet: js.Array[UnmarshalledTag] = js.native
    /**
      * _ObjectVersionId shape
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

