package typingsJapgolly.actionsOnGoogle.distServiceDialogflowApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction extends StObject {
  
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
