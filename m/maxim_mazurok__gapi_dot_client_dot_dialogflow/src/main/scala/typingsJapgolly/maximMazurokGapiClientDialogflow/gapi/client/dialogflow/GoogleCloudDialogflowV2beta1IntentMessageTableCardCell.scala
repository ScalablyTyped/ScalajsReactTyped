package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageTableCardCell extends StObject {
  
  /** Required. Text in this cell. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageTableCardCell {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageTableCardCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageTableCardCell]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageTableCardCell](x: Self) {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
