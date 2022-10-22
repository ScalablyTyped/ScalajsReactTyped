package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesApnsvoipsandboxchannelresponseMod.UnmarshalledAPNSVoipSandboxChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetApnsVoipSandboxChannelOutputMod {
  
  trait GetApnsVoipSandboxChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Apple VoIP Developer Push Notification Service channel definition.
      */
    var APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
  }
  object GetApnsVoipSandboxChannelOutput {
    
    inline def apply(
      $metadata: ResponseMetadata,
      APNSVoipSandboxChannelResponse: UnmarshalledAPNSVoipSandboxChannelResponse
    ): GetApnsVoipSandboxChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], APNSVoipSandboxChannelResponse = APNSVoipSandboxChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetApnsVoipSandboxChannelOutput]
    }
    
    extension [Self <: GetApnsVoipSandboxChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setAPNSVoipSandboxChannelResponse(value: UnmarshalledAPNSVoipSandboxChannelResponse): Self = StObject.set(x, "APNSVoipSandboxChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
