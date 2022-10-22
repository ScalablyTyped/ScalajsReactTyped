package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.KMS
import typingsJapgolly.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.NONE
import typingsJapgolly.awsSdkClientXrayNode.typesSamplingRuleMod.SamplingRule
import typingsJapgolly.awsSdkClientXrayNode.typesSamplingRuleUpdateMod.SamplingRuleUpdate
import typingsJapgolly.awsSdkClientXrayNode.typesSamplingStatisticsDocumentMod.SamplingStatisticsDocument
import typingsJapgolly.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
    - typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
    - typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
    - typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
    - typingsJapgolly.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput
    - typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
    - typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
    - typingsJapgolly.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def BatchGetTracesInput(TraceIds: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput = {
      val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput]
    }
    
    inline def CreateSamplingRuleInput(SamplingRule: SamplingRule): typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput = {
      val __obj = js.Dynamic.literal(SamplingRule = SamplingRule.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput]
    }
    
    inline def DeleteSamplingRuleInput(): typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput]
    }
    
    inline def GetEncryptionConfigInput(): typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput]
    }
    
    inline def GetSamplingRulesInput(): typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingRulesInputMod.GetSamplingRulesInput]
    }
    
    inline def GetSamplingStatisticSummariesInput(): typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput]
    }
    
    inline def GetSamplingTargetsInput(
      SamplingStatisticsDocuments: js.Array[SamplingStatisticsDocument] | js.Iterable[SamplingStatisticsDocument]
    ): typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput = {
      val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput]
    }
    
    inline def GetServiceGraphInput(EndTime: js.Date | String | Double, StartTime: js.Date | String | Double): typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput]
    }
    
    inline def GetTraceGraphInput(TraceIds: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput = {
      val __obj = js.Dynamic.literal(TraceIds = TraceIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput]
    }
    
    inline def GetTraceSummariesInput(EndTime: js.Date | String | Double, StartTime: js.Date | String | Double): typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput = {
      val __obj = js.Dynamic.literal(EndTime = EndTime.asInstanceOf[js.Any], StartTime = StartTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput]
    }
    
    inline def PutEncryptionConfigInput(Type: NONE | KMS | String): typingsJapgolly.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput = {
      val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesPutEncryptionConfigInputMod.PutEncryptionConfigInput]
    }
    
    inline def PutTelemetryRecordsInput(TelemetryRecords: js.Array[TelemetryRecord] | js.Iterable[TelemetryRecord]): typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput = {
      val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput]
    }
    
    inline def PutTraceSegmentsInput(TraceSegmentDocuments: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput = {
      val __obj = js.Dynamic.literal(TraceSegmentDocuments = TraceSegmentDocuments.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput]
    }
    
    inline def UpdateSamplingRuleInput(SamplingRuleUpdate: SamplingRuleUpdate): typingsJapgolly.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput = {
      val __obj = js.Dynamic.literal(SamplingRuleUpdate = SamplingRuleUpdate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientXrayNode.typesUpdateSamplingRuleInputMod.UpdateSamplingRuleInput]
    }
  }
}
