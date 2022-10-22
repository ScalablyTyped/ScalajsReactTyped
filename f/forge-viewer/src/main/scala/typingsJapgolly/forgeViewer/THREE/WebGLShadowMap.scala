package typingsJapgolly.forgeViewer.THREE

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGLShadowMap extends StObject {
  
  var autoUpdate: Boolean
  
  /**
    * @deprecated
    */
  var cullFace: Any
  
  var enabled: Boolean
  
  var needsUpdate: Boolean
  
  def render(scene: Scene, camera: Camera): Unit
  
  var renderReverseSided: Boolean
  
  var renderSingleSided: Boolean
  
  var `type`: ShadowMapType
}
object WebGLShadowMap {
  
  inline def apply(
    autoUpdate: Boolean,
    cullFace: Any,
    enabled: Boolean,
    needsUpdate: Boolean,
    render: (Scene, Camera) => Callback,
    renderReverseSided: Boolean,
    renderSingleSided: Boolean,
    `type`: ShadowMapType
  ): WebGLShadowMap = {
    val __obj = js.Dynamic.literal(autoUpdate = autoUpdate.asInstanceOf[js.Any], cullFace = cullFace.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], needsUpdate = needsUpdate.asInstanceOf[js.Any], render = js.Any.fromFunction2((t0: Scene, t1: Camera) => (render(t0, t1)).runNow()), renderReverseSided = renderReverseSided.asInstanceOf[js.Any], renderSingleSided = renderSingleSided.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLShadowMap]
  }
  
  extension [Self <: WebGLShadowMap](x: Self) {
    
    inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
    
    inline def setCullFace(value: Any): Self = StObject.set(x, "cullFace", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setNeedsUpdate(value: Boolean): Self = StObject.set(x, "needsUpdate", value.asInstanceOf[js.Any])
    
    inline def setRender(value: (Scene, Camera) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: Scene, t1: Camera) => (value(t0, t1)).runNow()))
    
    inline def setRenderReverseSided(value: Boolean): Self = StObject.set(x, "renderReverseSided", value.asInstanceOf[js.Any])
    
    inline def setRenderSingleSided(value: Boolean): Self = StObject.set(x, "renderSingleSided", value.asInstanceOf[js.Any])
    
    inline def setType(value: ShadowMapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
