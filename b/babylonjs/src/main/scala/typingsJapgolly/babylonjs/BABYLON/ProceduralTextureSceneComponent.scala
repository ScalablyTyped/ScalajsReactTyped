package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProceduralTextureSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _beforeClear: Any
}
object ProceduralTextureSceneComponent {
  
  inline def apply(
    _beforeClear: Any,
    dispose: Callback,
    name: String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): ProceduralTextureSceneComponent = {
    val __obj = js.Dynamic.literal(_beforeClear = _beforeClear.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProceduralTextureSceneComponent]
  }
  
  extension [Self <: ProceduralTextureSceneComponent](x: Self) {
    
    inline def set_beforeClear(value: Any): Self = StObject.set(x, "_beforeClear", value.asInstanceOf[js.Any])
  }
}
