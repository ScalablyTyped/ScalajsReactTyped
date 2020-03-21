package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesSelectObjectContentEventStreamMod.UnmarshalledSelectObjectContentEventStream
import typingsJapgolly.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/types/SelectObjectContentOutput", JSImport.Namespace)
@js.native
object typesSelectObjectContentOutputMod extends js.Object {
  @js.native
  trait SelectObjectContentOutput
    extends MetadataBearer
       with _OutputTypesUnion {
    /**
      * _SelectObjectContentEventStream shape
      */
    var Payload: js.UndefOr[UnmarshalledSelectObjectContentEventStream] = js.native
  }
  
}

