package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1PolylineConfig extends StObject {
  
  /** Required. Annotation spec set resource name. */
  var annotationSpecSet: js.UndefOr[String] = js.undefined
  
  /** Optional. Instruction message showed on contributors UI. */
  var instructionMessage: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1PolylineConfig {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1PolylineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1PolylineConfig]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1PolylineConfig](x: Self) {
    
    inline def setAnnotationSpecSet(value: String): Self = StObject.set(x, "annotationSpecSet", value.asInstanceOf[js.Any])
    
    inline def setAnnotationSpecSetUndefined: Self = StObject.set(x, "annotationSpecSet", js.undefined)
    
    inline def setInstructionMessage(value: String): Self = StObject.set(x, "instructionMessage", value.asInstanceOf[js.Any])
    
    inline def setInstructionMessageUndefined: Self = StObject.set(x, "instructionMessage", js.undefined)
  }
}
