package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo extends StObject {
  
  /** The unique identifier of the followup intent. Format: `projects//agent/intents/`. */
  var followupIntentName: js.UndefOr[String] = js.undefined
  
  /** The unique identifier of the followup intent's parent. Format: `projects//agent/intents/`. */
  var parentFollowupIntentName: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentFollowupIntentInfo](x: Self) {
    
    inline def setFollowupIntentName(value: String): Self = StObject.set(x, "followupIntentName", value.asInstanceOf[js.Any])
    
    inline def setFollowupIntentNameUndefined: Self = StObject.set(x, "followupIntentName", js.undefined)
    
    inline def setParentFollowupIntentName(value: String): Self = StObject.set(x, "parentFollowupIntentName", value.asInstanceOf[js.Any])
    
    inline def setParentFollowupIntentNameUndefined: Self = StObject.set(x, "parentFollowupIntentName", js.undefined)
  }
}
