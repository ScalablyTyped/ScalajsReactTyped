package typingsJapgolly.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak extends StObject {
  
  /** True if break prepends the element. */
  var isPrefix: js.UndefOr[Boolean] = js.undefined
  
  /** Detected break type. */
  var `type`: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak {
  
  inline def apply(): GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak]
  }
  
  extension [Self <: GoogleCloudVisionV1p1beta1TextAnnotationDetectedBreak](x: Self) {
    
    inline def setIsPrefix(value: Boolean): Self = StObject.set(x, "isPrefix", value.asInstanceOf[js.Any])
    
    inline def setIsPrefixUndefined: Self = StObject.set(x, "isPrefix", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
