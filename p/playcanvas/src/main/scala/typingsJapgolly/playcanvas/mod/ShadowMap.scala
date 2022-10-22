package typingsJapgolly.playcanvas.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowMap extends StObject {
  
  var cached: Boolean
  
  def destroy(): Unit
  
  var renderTargets: Any
  
  var texture: Any
}
object ShadowMap {
  
  inline def apply(cached: Boolean, destroy: Callback, renderTargets: Any, texture: Any): ShadowMap = {
    val __obj = js.Dynamic.literal(cached = cached.asInstanceOf[js.Any], destroy = destroy.toJsFn, renderTargets = renderTargets.asInstanceOf[js.Any], texture = texture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowMap]
  }
  
  extension [Self <: ShadowMap](x: Self) {
    
    inline def setCached(value: Boolean): Self = StObject.set(x, "cached", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setRenderTargets(value: Any): Self = StObject.set(x, "renderTargets", value.asInstanceOf[js.Any])
    
    inline def setTexture(value: Any): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
  }
}
