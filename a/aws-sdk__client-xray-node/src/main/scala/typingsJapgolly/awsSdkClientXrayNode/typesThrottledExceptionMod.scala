package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesExceptionsUnionMod.BatchGetTracesExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleExceptionsUnionMod.DeleteSamplingRuleExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigExceptionsUnionMod.GetEncryptionConfigExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingRulesExceptionsUnionMod.GetSamplingRulesExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesExceptionsUnionMod.GetSamplingStatisticSummariesExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsExceptionsUnionMod.GetSamplingTargetsExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphExceptionsUnionMod.GetServiceGraphExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphExceptionsUnionMod.GetTraceGraphExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesExceptionsUnionMod.GetTraceSummariesExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesPutEncryptionConfigExceptionsUnionMod.PutEncryptionConfigExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsExceptionsUnionMod.PutTelemetryRecordsExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsExceptionsUnionMod.PutTraceSegmentsExceptionsUnion
import typingsJapgolly.awsSdkClientXrayNode.typesUpdateSamplingRuleExceptionsUnionMod.UpdateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesThrottledExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ThrottledExceptionDetails> * / any */ trait ThrottledException
    extends StObject
       with BatchGetTracesExceptionsUnion
       with CreateSamplingRuleExceptionsUnion
       with DeleteSamplingRuleExceptionsUnion
       with GetEncryptionConfigExceptionsUnion
       with GetSamplingRulesExceptionsUnion
       with GetSamplingStatisticSummariesExceptionsUnion
       with GetSamplingTargetsExceptionsUnion
       with GetServiceGraphExceptionsUnion
       with GetTraceGraphExceptionsUnion
       with GetTraceSummariesExceptionsUnion
       with PutEncryptionConfigExceptionsUnion
       with PutTelemetryRecordsExceptionsUnion
       with PutTraceSegmentsExceptionsUnion
       with UpdateSamplingRuleExceptionsUnion {
    
    var name: typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException
  }
  object ThrottledException {
    
    inline def apply(): ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[ThrottledException]
    }
    
    extension [Self <: ThrottledException](x: Self) {
      
      inline def setName(value: typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrottledExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object ThrottledExceptionDetails {
    
    inline def apply(): ThrottledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrottledExceptionDetails]
    }
    
    extension [Self <: ThrottledExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
