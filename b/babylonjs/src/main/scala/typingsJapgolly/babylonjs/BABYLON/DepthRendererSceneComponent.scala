package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _gatherActiveCameraRenderTargets: Any
  
  /* private */ var _gatherRenderTargets: Any
}
object DepthRendererSceneComponent {
  
  inline def apply(
    _gatherActiveCameraRenderTargets: Any,
    _gatherRenderTargets: Any,
    dispose: Callback,
    name: String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): DepthRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherActiveCameraRenderTargets = _gatherActiveCameraRenderTargets.asInstanceOf[js.Any], _gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthRendererSceneComponent]
  }
  
  extension [Self <: DepthRendererSceneComponent](x: Self) {
    
    inline def set_gatherActiveCameraRenderTargets(value: Any): Self = StObject.set(x, "_gatherActiveCameraRenderTargets", value.asInstanceOf[js.Any])
    
    inline def set_gatherRenderTargets(value: Any): Self = StObject.set(x, "_gatherRenderTargets", value.asInstanceOf[js.Any])
  }
}
