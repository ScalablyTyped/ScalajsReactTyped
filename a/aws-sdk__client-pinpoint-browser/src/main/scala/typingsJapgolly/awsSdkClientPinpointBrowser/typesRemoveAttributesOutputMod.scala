package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesAttributesResourceMod.UnmarshalledAttributesResource
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/RemoveAttributesOutput", JSImport.Namespace)
@js.native
object typesRemoveAttributesOutputMod extends js.Object {
  @js.native
  trait RemoveAttributesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Attributes.
      */
    var AttributesResource: UnmarshalledAttributesResource = js.native
  }
  
}

