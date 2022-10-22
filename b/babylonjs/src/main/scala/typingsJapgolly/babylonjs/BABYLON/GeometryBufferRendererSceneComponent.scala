package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryBufferRendererSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _gatherRenderTargets: Any
}
object GeometryBufferRendererSceneComponent {
  
  inline def apply(
    _gatherRenderTargets: Any,
    dispose: Callback,
    name: String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): GeometryBufferRendererSceneComponent = {
    val __obj = js.Dynamic.literal(_gatherRenderTargets = _gatherRenderTargets.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryBufferRendererSceneComponent]
  }
  
  extension [Self <: GeometryBufferRendererSceneComponent](x: Self) {
    
    inline def set_gatherRenderTargets(value: Any): Self = StObject.set(x, "_gatherRenderTargets", value.asInstanceOf[js.Any])
  }
}
