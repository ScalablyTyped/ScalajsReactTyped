package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3WebhookRequestIntentInfo extends StObject {
  
  /** The confidence of the matched intent. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Always present. The display name of the last matched intent. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Always present. The unique identifier of the last matched intent. Format: `projects//locations//agents//intents/`. */
  var lastMatchedIntent: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters identified as a result of intent matching. This is a map of the name of the identified parameter to the value of the parameter identified from the user's utterance. All
    * parameters defined in the matched intent that are identified will be surfaced here.
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dialogflow.gapi.client.dialogflow.GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue} */ js.Any
  ] = js.undefined
}
object GoogleCloudDialogflowCxV3WebhookRequestIntentInfo {
  
  inline def apply(): GoogleCloudDialogflowCxV3WebhookRequestIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestIntentInfo]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3WebhookRequestIntentInfo](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLastMatchedIntent(value: String): Self = StObject.set(x, "lastMatchedIntent", value.asInstanceOf[js.Any])
    
    inline def setLastMatchedIntentUndefined: Self = StObject.set(x, "lastMatchedIntent", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.dialogflow.gapi.client.dialogflow.GoogleCloudDialogflowCxV3WebhookRequestIntentInfoIntentParameterValue} */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
