package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.typesImportJobsResponseMod.UnmarshalledImportJobsResponse
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetImportJobsOutputMod {
  
  trait GetImportJobsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * Import job list.
      */
    var ImportJobsResponse: UnmarshalledImportJobsResponse
  }
  object GetImportJobsOutput {
    
    inline def apply($metadata: ResponseMetadata, ImportJobsResponse: UnmarshalledImportJobsResponse): GetImportJobsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], ImportJobsResponse = ImportJobsResponse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetImportJobsOutput]
    }
    
    extension [Self <: GetImportJobsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setImportJobsResponse(value: UnmarshalledImportJobsResponse): Self = StObject.set(x, "ImportJobsResponse", value.asInstanceOf[js.Any])
    }
  }
}
