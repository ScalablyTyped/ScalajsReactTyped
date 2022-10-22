package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesImportJobResponseMod.UnmarshalledImportJobResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetImportJobOutputMod {
  
  trait GetImportJobOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Import job response.
      */
    var ImportJobResponse: UnmarshalledImportJobResponse
  }
  object GetImportJobOutput {
    
    inline def apply($metadata: ResponseMetadata, ImportJobResponse: UnmarshalledImportJobResponse): GetImportJobOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobResponse = ImportJobResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImportJobOutput]
    }
    
    extension [Self <: GetImportJobOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setImportJobResponse(value: UnmarshalledImportJobResponse): Self = StObject.set(x, "ImportJobResponse", value.asInstanceOf[js.Any])
    }
  }
}
