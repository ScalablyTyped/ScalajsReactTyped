package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-browser/types/ListKeyPoliciesOutput", JSImport.Namespace)
@js.native
object typesListKeyPoliciesOutputMod extends js.Object {
  @js.native
  trait ListKeyPoliciesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>When <code>Truncated</code> is true, this element is present and contains the value to use for the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    /**
      * <p>A list of key policy names. Currently, there is only one key policy per CMK and it is always named <code>default</code>.</p>
      */
    var PolicyNames: js.UndefOr[js.Array[String]] = js.native
    /**
      * <p>A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the <code>NextMarker</code> element in this response to the <code>Marker</code> parameter in a subsequent request.</p>
      */
    var Truncated: js.UndefOr[Boolean] = js.native
  }
  
}

