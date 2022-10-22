package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesSamplingRuleRecordMod.UnmarshalledSamplingRuleRecord
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateSamplingRuleOutputMod {
  
  trait CreateSamplingRuleOutput
    extends StObject
       with OutputTypesUnion {
    
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata
    
    /**
      * <p>The saved rule definition and metadata.</p>
      */
    var SamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRuleRecord] = js.undefined
  }
  object CreateSamplingRuleOutput {
    
    inline def apply($metadata: ResponseMetadata): CreateSamplingRuleOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateSamplingRuleOutput]
    }
    
    extension [Self <: CreateSamplingRuleOutput](x: Self) {
      
      inline def set$metadata(value: ResponseMetadata): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setSamplingRuleRecord(value: UnmarshalledSamplingRuleRecord): Self = StObject.set(x, "SamplingRuleRecord", value.asInstanceOf[js.Any])
      
      inline def setSamplingRuleRecordUndefined: Self = StObject.set(x, "SamplingRuleRecord", js.undefined)
    }
  }
}
