package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesUnprocessedTraceSegmentMod.UnmarshalledUnprocessedTraceSegment
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutTraceSegmentsOutputMod {
  
  trait PutTraceSegmentsOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Segments that failed processing.</p>
      */
    var UnprocessedTraceSegments: js.UndefOr[js.Array[UnmarshalledUnprocessedTraceSegment]] = js.undefined
  }
  object PutTraceSegmentsOutput {
    
    inline def apply($metadata: ResponseMetadata): PutTraceSegmentsOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutTraceSegmentsOutput]
    }
    
    extension [Self <: PutTraceSegmentsOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedTraceSegments(value: js.Array[UnmarshalledUnprocessedTraceSegment]): Self = StObject.set(x, "UnprocessedTraceSegments", value.asInstanceOf[js.Any])
      
      inline def setUnprocessedTraceSegmentsUndefined: Self = StObject.set(x, "UnprocessedTraceSegments", js.undefined)
      
      inline def setUnprocessedTraceSegmentsVarargs(value: UnmarshalledUnprocessedTraceSegment*): Self = StObject.set(x, "UnprocessedTraceSegments", js.Array(value*))
    }
  }
}
