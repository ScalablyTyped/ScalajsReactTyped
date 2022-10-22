package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1ImageProperties extends StObject {
  
  /** If present, dominant colors completed successfully. */
  var dominantColors: js.UndefOr[GoogleCloudVisionV1p4beta1DominantColorsAnnotation] = js.undefined
}
object GoogleCloudVisionV1p4beta1ImageProperties {
  
  inline def apply(): GoogleCloudVisionV1p4beta1ImageProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1ImageProperties]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1ImageProperties](x: Self) {
    
    inline def setDominantColors(value: GoogleCloudVisionV1p4beta1DominantColorsAnnotation): Self = StObject.set(x, "dominantColors", value.asInstanceOf[js.Any])
    
    inline def setDominantColorsUndefined: Self = StObject.set(x, "dominantColors", js.undefined)
  }
}
