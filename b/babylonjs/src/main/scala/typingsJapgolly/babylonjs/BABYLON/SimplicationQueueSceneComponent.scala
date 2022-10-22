package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimplicationQueueSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _beforeCameraUpdate: Any
}
object SimplicationQueueSceneComponent {
  
  inline def apply(
    _beforeCameraUpdate: Any,
    dispose: Callback,
    name: String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): SimplicationQueueSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeCameraUpdate = _beforeCameraUpdate.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimplicationQueueSceneComponent]
  }
  
  extension [Self <: SimplicationQueueSceneComponent](x: Self) {
    
    inline def set_beforeCameraUpdate(value: Any): Self = StObject.set(x, "_beforeCameraUpdate", value.asInstanceOf[js.Any])
  }
}
