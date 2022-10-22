package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ObjectTrackingFrame extends StObject {
  
  var boundingPoly: js.UndefOr[GoogleCloudDatalabelingV1beta1BoundingPoly] = js.undefined
  
  var normalizedBoundingPoly: js.UndefOr[GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly] = js.undefined
  
  /** The time offset of this frame relative to the beginning of the video. */
  var timeOffset: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ObjectTrackingFrame {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ObjectTrackingFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ObjectTrackingFrame]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1ObjectTrackingFrame](x: Self) {
    
    inline def setBoundingPoly(value: GoogleCloudDatalabelingV1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setNormalizedBoundingPoly(value: GoogleCloudDatalabelingV1beta1NormalizedBoundingPoly): Self = StObject.set(x, "normalizedBoundingPoly", value.asInstanceOf[js.Any])
    
    inline def setNormalizedBoundingPolyUndefined: Self = StObject.set(x, "normalizedBoundingPoly", js.undefined)
    
    inline def setTimeOffset(value: String): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
  }
}
