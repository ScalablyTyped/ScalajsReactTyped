package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/ScheduleKeyDeletionOutput", JSImport.Namespace)
@js.native
object typesScheduleKeyDeletionOutputMod extends js.Object {
  @js.native
  trait ScheduleKeyDeletionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The date and time after which AWS KMS deletes the customer master key (CMK).</p>
      */
    var DeletionDate: js.UndefOr[js.Date] = js.native
    /**
      * <p>The unique identifier of the customer master key (CMK) for which deletion is scheduled.</p>
      */
    var KeyId: js.UndefOr[String] = js.native
  }
  
}

