package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.typesDataRetrievalPolicyMod.UnmarshalledDataRetrievalPolicy
import typingsJapgolly.awsSdkClientGlacierNode.typesOutputTypesUnionMod._OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetDataRetrievalPolicyOutputMod {
  
  trait GetDataRetrievalPolicyOutput
    extends StObject
       with _OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Contains the returned data retrieval policy in JSON format.</p>
      */
    var Policy: js.UndefOr[UnmarshalledDataRetrievalPolicy] = js.undefined
  }
  object GetDataRetrievalPolicyOutput {
    
    inline def apply($metadata: ResponseMetadata): GetDataRetrievalPolicyOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDataRetrievalPolicyOutput]
    }
    
    extension [Self <: GetDataRetrievalPolicyOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setPolicy(value: UnmarshalledDataRetrievalPolicy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
    }
  }
}
