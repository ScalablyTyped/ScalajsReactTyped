package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/InitiateVaultLockOutput", JSImport.Namespace)
@js.native
object typesInitiateVaultLockOutputMod extends js.Object {
  @js.native
  trait InitiateVaultLockOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The lock ID, which is used to complete the vault locking process.</p>
      */
    var lockId: js.UndefOr[String] = js.native
  }
  
}

