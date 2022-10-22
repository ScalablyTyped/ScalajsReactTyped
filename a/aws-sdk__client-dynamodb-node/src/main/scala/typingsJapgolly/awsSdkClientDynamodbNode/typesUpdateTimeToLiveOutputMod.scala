package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesTimeToLiveSpecificationMod.UnmarshalledTimeToLiveSpecification
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUpdateTimeToLiveOutputMod {
  
  trait UpdateTimeToLiveOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Represents the output of an <code>UpdateTimeToLive</code> operation.</p>
      */
    var TimeToLiveSpecification: js.UndefOr[UnmarshalledTimeToLiveSpecification] = js.undefined
  }
  object UpdateTimeToLiveOutput {
    
    inline def apply($metadata: ResponseMetadata): UpdateTimeToLiveOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateTimeToLiveOutput]
    }
    
    extension [Self <: UpdateTimeToLiveOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveSpecification(value: UnmarshalledTimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
    }
  }
}
