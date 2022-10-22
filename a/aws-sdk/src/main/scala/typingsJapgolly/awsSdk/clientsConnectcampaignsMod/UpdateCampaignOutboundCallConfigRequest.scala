package typingsJapgolly.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCampaignOutboundCallConfigRequest extends StObject {
  
  var answerMachineDetectionConfig: js.UndefOr[AnswerMachineDetectionConfig] = js.undefined
  
  var connectContactFlowId: js.UndefOr[ContactFlowId] = js.undefined
  
  var connectSourcePhoneNumber: js.UndefOr[SourcePhoneNumber] = js.undefined
  
  var id: CampaignId
}
object UpdateCampaignOutboundCallConfigRequest {
  
  inline def apply(id: CampaignId): UpdateCampaignOutboundCallConfigRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCampaignOutboundCallConfigRequest]
  }
  
  extension [Self <: UpdateCampaignOutboundCallConfigRequest](x: Self) {
    
    inline def setAnswerMachineDetectionConfig(value: AnswerMachineDetectionConfig): Self = StObject.set(x, "answerMachineDetectionConfig", value.asInstanceOf[js.Any])
    
    inline def setAnswerMachineDetectionConfigUndefined: Self = StObject.set(x, "answerMachineDetectionConfig", js.undefined)
    
    inline def setConnectContactFlowId(value: ContactFlowId): Self = StObject.set(x, "connectContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setConnectContactFlowIdUndefined: Self = StObject.set(x, "connectContactFlowId", js.undefined)
    
    inline def setConnectSourcePhoneNumber(value: SourcePhoneNumber): Self = StObject.set(x, "connectSourcePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setConnectSourcePhoneNumberUndefined: Self = StObject.set(x, "connectSourcePhoneNumber", js.undefined)
    
    inline def setId(value: CampaignId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
