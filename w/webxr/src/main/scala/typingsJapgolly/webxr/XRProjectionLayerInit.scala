package typingsJapgolly.webxr

import typingsJapgolly.std.GLenum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRProjectionLayerInit extends StObject {
  
  var colorFormat: js.UndefOr[GLenum] = js.undefined
  
  var depthFormat: js.UndefOr[GLenum] = js.undefined
  
  var scaleFactor: js.UndefOr[Double] = js.undefined
  
  var textureType: js.UndefOr[XRTextureType] = js.undefined
}
object XRProjectionLayerInit {
  
  inline def apply(): XRProjectionLayerInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XRProjectionLayerInit]
  }
  
  extension [Self <: XRProjectionLayerInit](x: Self) {
    
    inline def setColorFormat(value: GLenum): Self = StObject.set(x, "colorFormat", value.asInstanceOf[js.Any])
    
    inline def setColorFormatUndefined: Self = StObject.set(x, "colorFormat", js.undefined)
    
    inline def setDepthFormat(value: GLenum): Self = StObject.set(x, "depthFormat", value.asInstanceOf[js.Any])
    
    inline def setDepthFormatUndefined: Self = StObject.set(x, "depthFormat", js.undefined)
    
    inline def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    inline def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    inline def setTextureType(value: XRTextureType): Self = StObject.set(x, "textureType", value.asInstanceOf[js.Any])
    
    inline def setTextureTypeUndefined: Self = StObject.set(x, "textureType", js.undefined)
  }
}
