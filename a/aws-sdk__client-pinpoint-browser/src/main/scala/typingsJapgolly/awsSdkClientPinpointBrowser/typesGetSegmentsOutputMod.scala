package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesSegmentsResponseMod.UnmarshalledSegmentsResponse
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSegmentsOutputMod {
  
  trait GetSegmentsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Segments in your account.
      */
    var SegmentsResponse: UnmarshalledSegmentsResponse
  }
  object GetSegmentsOutput {
    
    inline def apply($metadata: ResponseMetadata, SegmentsResponse: UnmarshalledSegmentsResponse): GetSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], SegmentsResponse = SegmentsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSegmentsOutput]
    }
    
    extension [Self <: GetSegmentsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setSegmentsResponse(value: UnmarshalledSegmentsResponse): Self = StObject.set(x, "SegmentsResponse", value.asInstanceOf[js.Any])
    }
  }
}
