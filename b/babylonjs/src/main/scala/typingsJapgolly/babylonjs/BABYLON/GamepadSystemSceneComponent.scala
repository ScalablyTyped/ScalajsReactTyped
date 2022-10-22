package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamepadSystemSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _beforeCameraUpdate: Any
}
object GamepadSystemSceneComponent {
  
  inline def apply(
    _beforeCameraUpdate: Any,
    dispose: Callback,
    name: String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): GamepadSystemSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeCameraUpdate = _beforeCameraUpdate.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[GamepadSystemSceneComponent]
  }
  
  extension [Self <: GamepadSystemSceneComponent](x: Self) {
    
    inline def set_beforeCameraUpdate(value: Any): Self = StObject.set(x, "_beforeCameraUpdate", value.asInstanceOf[js.Any])
  }
}
