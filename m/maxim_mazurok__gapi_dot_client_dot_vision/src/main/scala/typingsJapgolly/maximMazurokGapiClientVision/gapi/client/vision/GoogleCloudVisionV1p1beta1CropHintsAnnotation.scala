package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1CropHintsAnnotation extends StObject {
  
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[GoogleCloudVisionV1p1beta1CropHint]] = js.undefined
}
object GoogleCloudVisionV1p1beta1CropHintsAnnotation {
  
  inline def apply(): GoogleCloudVisionV1p1beta1CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1CropHintsAnnotation]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1CropHintsAnnotation](x: Self) {
    
    inline def setCropHints(value: js.Array[GoogleCloudVisionV1p1beta1CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    inline def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    inline def setCropHintsVarargs(value: GoogleCloudVisionV1p1beta1CropHint*): Self = StObject.set(x, "cropHints", js.Array(value*))
  }
}
