package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1DominantColorsAnnotation extends StObject {
  
  /** RGB color values with their score and pixel fraction. */
  var colors: js.UndefOr[js.Array[GoogleCloudVisionV1p4beta1ColorInfo]] = js.undefined
}
object GoogleCloudVisionV1p4beta1DominantColorsAnnotation {
  
  inline def apply(): GoogleCloudVisionV1p4beta1DominantColorsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1DominantColorsAnnotation]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1DominantColorsAnnotation](x: Self) {
    
    inline def setColors(value: js.Array[GoogleCloudVisionV1p4beta1ColorInfo]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: GoogleCloudVisionV1p4beta1ColorInfo*): Self = StObject.set(x, "colors", js.Array(value*))
  }
}
