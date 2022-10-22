package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesBaiduChannelResponseMod.UnmarshalledBaiduChannelResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetBaiduChannelOutputMod {
  
  trait GetBaiduChannelOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Baidu Cloud Messaging channel definition
      */
    var BaiduChannelResponse: UnmarshalledBaiduChannelResponse
  }
  object GetBaiduChannelOutput {
    
    inline def apply($metadata: ResponseMetadata, BaiduChannelResponse: UnmarshalledBaiduChannelResponse): GetBaiduChannelOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], BaiduChannelResponse = BaiduChannelResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBaiduChannelOutput]
    }
    
    extension [Self <: GetBaiduChannelOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setBaiduChannelResponse(value: UnmarshalledBaiduChannelResponse): Self = StObject.set(x, "BaiduChannelResponse", value.asInstanceOf[js.Any])
    }
  }
}
