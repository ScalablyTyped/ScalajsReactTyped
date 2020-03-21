package typingsJapgolly.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/ListTagsForVaultOutput", JSImport.Namespace)
@js.native
object typesListTagsForVaultOutputMod extends js.Object {
  @js.native
  trait ListTagsForVaultOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The tags attached to the vault. Each tag is composed of a key and a value.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  
}

