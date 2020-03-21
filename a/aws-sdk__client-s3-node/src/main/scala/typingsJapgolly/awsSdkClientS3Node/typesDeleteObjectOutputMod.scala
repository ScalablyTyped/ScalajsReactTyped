package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/DeleteObjectOutput", JSImport.Namespace)
@js.native
object typesDeleteObjectOutputMod extends js.Object {
  @js.native
  trait DeleteObjectOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * <p>Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker.</p>
      */
    var DeleteMarker: js.UndefOr[Boolean] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
    /**
      * <p>Returns the version ID of the delete marker created as a result of the DELETE operation.</p>
      */
    var VersionId: js.UndefOr[String] = js.native
  }
  
}

