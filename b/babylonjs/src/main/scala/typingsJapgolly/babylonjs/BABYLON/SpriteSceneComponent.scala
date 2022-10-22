package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteSceneComponent
  extends StObject
     with ISceneComponent {
  
  /* private */ var _pickSpriteButKeepRay: Any
  
  /* private */ var _pointerDown: Any
  
  /* private */ var _pointerMove: Any
  
  /* private */ var _pointerUp: Any
  
  /** @internal */
  /* private */ var _spritePredicate: Any
}
object SpriteSceneComponent {
  
  inline def apply(
    _pickSpriteButKeepRay: Any,
    _pointerDown: Any,
    _pointerMove: Any,
    _pointerUp: Any,
    _spritePredicate: Any,
    dispose: Callback,
    name: String,
    rebuild: Callback,
    register: Callback,
    scene: Scene
  ): SpriteSceneComponent = {
    val __obj = js.Dynamic.literal(_pickSpriteButKeepRay = _pickSpriteButKeepRay.asInstanceOf[js.Any], _pointerDown = _pointerDown.asInstanceOf[js.Any], _pointerMove = _pointerMove.asInstanceOf[js.Any], _pointerUp = _pointerUp.asInstanceOf[js.Any], _spritePredicate = _spritePredicate.asInstanceOf[js.Any], dispose = dispose.toJsFn, name = name.asInstanceOf[js.Any], rebuild = rebuild.toJsFn, register = register.toJsFn, scene = scene.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteSceneComponent]
  }
  
  extension [Self <: SpriteSceneComponent](x: Self) {
    
    inline def set_pickSpriteButKeepRay(value: Any): Self = StObject.set(x, "_pickSpriteButKeepRay", value.asInstanceOf[js.Any])
    
    inline def set_pointerDown(value: Any): Self = StObject.set(x, "_pointerDown", value.asInstanceOf[js.Any])
    
    inline def set_pointerMove(value: Any): Self = StObject.set(x, "_pointerMove", value.asInstanceOf[js.Any])
    
    inline def set_pointerUp(value: Any): Self = StObject.set(x, "_pointerUp", value.asInstanceOf[js.Any])
    
    inline def set_spritePredicate(value: Any): Self = StObject.set(x, "_spritePredicate", value.asInstanceOf[js.Any])
  }
}
