package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.awsSdkClientS3NodeStrings.requester_
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesDeletedObjectMod.UnmarshalledDeletedObject
import typingsJapgolly.awsSdkClientS3Node.typesErrorMod.UnmarshalledError
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/DeleteObjectsOutput", JSImport.Namespace)
@js.native
object typesDeleteObjectsOutputMod extends js.Object {
  @js.native
  trait DeleteObjectsOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _DeletedObjects shape
      */
    var Deleted: js.UndefOr[js.Array[UnmarshalledDeletedObject]] = js.native
    /**
      * _Errors shape
      */
    var Errors: js.UndefOr[js.Array[UnmarshalledError]] = js.native
    /**
      * <p>If present, indicates that the requester was successfully charged for the request.</p>
      */
    var RequestCharged: js.UndefOr[requester_ | String] = js.native
  }
  
}

