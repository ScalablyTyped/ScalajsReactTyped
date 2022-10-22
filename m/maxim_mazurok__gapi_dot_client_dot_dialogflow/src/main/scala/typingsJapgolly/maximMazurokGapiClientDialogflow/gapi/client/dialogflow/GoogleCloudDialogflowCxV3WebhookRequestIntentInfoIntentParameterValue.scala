package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue extends StObject {
  
  /** Always present. Original text value extracted from user utterance. */
  var originalValue: js.UndefOr[String] = js.undefined
  
  /** Always present. Structured value for the parameter extracted from user utterance. */
  var resolvedValue: js.UndefOr[Any] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue](x: Self) {
    
    inline def setOriginalValue(value: String): Self = StObject.set(x, "originalValue", value.asInstanceOf[js.Any])
    
    inline def setOriginalValueUndefined: Self = StObject.set(x, "originalValue", js.undefined)
    
    inline def setResolvedValue(value: Any): Self = StObject.set(x, "resolvedValue", value.asInstanceOf[js.Any])
    
    inline def setResolvedValueUndefined: Self = StObject.set(x, "resolvedValue", js.undefined)
  }
}
