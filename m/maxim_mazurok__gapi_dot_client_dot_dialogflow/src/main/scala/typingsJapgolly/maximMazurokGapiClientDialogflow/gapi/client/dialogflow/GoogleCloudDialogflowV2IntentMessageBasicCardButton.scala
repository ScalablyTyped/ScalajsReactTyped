package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageBasicCardButton extends StObject {
  
  /** Required. Action to take when a user taps on the button. */
  var openUriAction: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.undefined
  
  /** Required. The title of the button. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageBasicCardButton {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageBasicCardButton](x: Self) {
    
    inline def setOpenUriAction(value: GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
