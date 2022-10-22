package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGetSamplingRulesOutputMod {
  
  trait GetSamplingRulesOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>Pagination token. Not used.</p>
      */
    var NextToken: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Rule definitions and metadata.</p>
      */
    var SamplingRuleRecords: js.UndefOr[js.Array[UnmarshalledSamplingRuleRecord]] = js.undefined
  }
  object GetSamplingRulesOutput {
    
    inline def apply($metadata: ResponseMetadata): GetSamplingRulesOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSamplingRulesOutput]
    }
    
    extension [Self <: GetSamplingRulesOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
      
      inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
      
      inline def setSamplingRuleRecords(value: js.Array[UnmarshalledSamplingRuleRecord]): Self = StObject.set(x, "SamplingRuleRecords", value.asInstanceOf[js.Any])
      
      inline def setSamplingRuleRecordsUndefined: Self = StObject.set(x, "SamplingRuleRecords", js.undefined)
      
      inline def setSamplingRuleRecordsVarargs(value: UnmarshalledSamplingRuleRecord*): Self = StObject.set(x, "SamplingRuleRecords", js.Array(value*))
    }
  }
}
