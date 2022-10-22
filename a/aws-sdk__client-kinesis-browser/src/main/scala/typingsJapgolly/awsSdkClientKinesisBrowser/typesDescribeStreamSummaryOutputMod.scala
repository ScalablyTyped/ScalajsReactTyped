package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStreamDescriptionSummaryMod.UnmarshalledStreamDescriptionSummary
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDescribeStreamSummaryOutputMod {
  
  trait DescribeStreamSummaryOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>A <a>StreamDescriptionSummary</a> containing information about the stream.</p>
      */
    var StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary
  }
  object DescribeStreamSummaryOutput {
    
    inline def apply($metadata: ResponseMetadata, StreamDescriptionSummary: UnmarshalledStreamDescriptionSummary): DescribeStreamSummaryOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeStreamSummaryOutput]
    }
    
    extension [Self <: DescribeStreamSummaryOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setStreamDescriptionSummary(value: UnmarshalledStreamDescriptionSummary): Self = StObject.set(x, "StreamDescriptionSummary", value.asInstanceOf[js.Any])
    }
  }
}
