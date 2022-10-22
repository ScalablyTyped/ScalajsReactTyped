package typingsJapgolly.webxr

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRCylinderLayerInit
  extends StObject
     with XRLayerInit {
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var centralAngle: js.UndefOr[Double] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var textureType: js.UndefOr[XRTextureType] = js.undefined
  
  var transform: XRRigidTransform
}
object XRCylinderLayerInit {
  
  inline def apply(space: EventTarget, transform: XRRigidTransform, viewPixelHeight: Double, viewPixelWidth: Double): XRCylinderLayerInit = {
    val __obj = js.Dynamic.literal(space = space.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], viewPixelHeight = viewPixelHeight.asInstanceOf[js.Any], viewPixelWidth = viewPixelWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRCylinderLayerInit]
  }
  
  extension [Self <: XRCylinderLayerInit](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setCentralAngle(value: Double): Self = StObject.set(x, "centralAngle", value.asInstanceOf[js.Any])
    
    inline def setCentralAngleUndefined: Self = StObject.set(x, "centralAngle", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setTextureType(value: XRTextureType): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
    
    inline def setTextureTypeUndefined: Self = StObject.set(x, "textureType", js.undefined)
    
    inline def setTransform(value: XRRigidTransform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
