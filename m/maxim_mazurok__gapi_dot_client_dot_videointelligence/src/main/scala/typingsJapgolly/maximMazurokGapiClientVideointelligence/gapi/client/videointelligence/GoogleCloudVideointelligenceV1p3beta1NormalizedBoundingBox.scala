package typingsJapgolly.maximMazurokGapiClientVideointelligence.gapi.client.videointelligence

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox extends StObject {
  
  /** Bottom Y coordinate. */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /** Left X coordinate. */
  var left: js.UndefOr[Double] = js.undefined
  
  /** Right X coordinate. */
  var right: js.UndefOr[Double] = js.undefined
  
  /** Top Y coordinate. */
  var top: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox {
  
  inline def apply(): GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox]
  }
  
  extension [Self <: GoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
