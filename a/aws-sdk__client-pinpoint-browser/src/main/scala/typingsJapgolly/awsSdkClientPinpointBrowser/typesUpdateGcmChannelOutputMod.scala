package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGcmchannelresponseMod.UnmarshalledGCMChannelResponse
import typingsJapgolly.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/UpdateGcmChannelOutput", JSImport.Namespace)
@js.native
object typesUpdateGcmChannelOutputMod extends js.Object {
  @js.native
  trait UpdateGcmChannelOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * Google Cloud Messaging channel definition
      */
    var GCMChannelResponse: UnmarshalledGCMChannelResponse = js.native
  }
  
}

