package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesKeyMetadataMod.UnmarshalledKeyMetadata
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/types/CreateKeyOutput", JSImport.Namespace)
@js.native
object typesCreateKeyOutputMod extends js.Object {
  @js.native
  trait CreateKeyOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Metadata associated with the CMK.</p>
      */
    var KeyMetadata: js.UndefOr[UnmarshalledKeyMetadata] = js.native
  }
  
}

