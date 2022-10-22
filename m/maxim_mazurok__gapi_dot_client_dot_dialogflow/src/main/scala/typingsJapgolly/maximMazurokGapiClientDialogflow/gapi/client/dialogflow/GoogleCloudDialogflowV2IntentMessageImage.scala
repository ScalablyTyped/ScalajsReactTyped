package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageImage extends StObject {
  
  /** Optional. A text description of the image to be used for accessibility, e.g., screen readers. */
  var accessibilityText: js.UndefOr[String] = js.undefined
  
  /** Optional. The public URI to an image file. */
  var imageUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageImage {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageImage]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageImage](x: Self) {
    
    inline def setAccessibilityText(value: String): Self = StObject.set(x, "accessibilityText", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTextUndefined: Self = StObject.set(x, "accessibilityText", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}
