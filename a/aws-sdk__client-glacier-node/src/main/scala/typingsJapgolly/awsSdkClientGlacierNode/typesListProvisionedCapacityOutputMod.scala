package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesProvisionedCapacityDescriptionMod.UnmarshalledProvisionedCapacityDescription
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/types/ListProvisionedCapacityOutput", JSImport.Namespace)
@js.native
object typesListProvisionedCapacityOutputMod extends js.Object {
  @js.native
  trait ListProvisionedCapacityOutput extends _OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The response body contains the following JSON fields.</p>
      */
    var ProvisionedCapacityList: js.UndefOr[js.Array[UnmarshalledProvisionedCapacityDescription]] = js.native
  }
  
}

