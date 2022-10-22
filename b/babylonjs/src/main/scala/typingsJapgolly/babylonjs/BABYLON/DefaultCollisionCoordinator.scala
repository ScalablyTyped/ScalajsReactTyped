package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultCollisionCoordinator
  extends StObject
     with ICollisionCoordinator {
  
  /* private */ var _collideWithWorld: Any
  
  /* private */ var _finalPosition: Any
  
  /* private */ var _scaledPosition: Any
  
  /* private */ var _scaledVelocity: Any
  
  /* private */ var _scene: Any
}
object DefaultCollisionCoordinator {
  
  inline def apply(
    _collideWithWorld: Any,
    _finalPosition: Any,
    _scaledPosition: Any,
    _scaledVelocity: Any,
    _scene: Any,
    createCollider: CallbackTo[Collider],
    getNewPosition: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], Double) => Callback,
    init: Scene => Callback
  ): DefaultCollisionCoordinator = {
    val __obj = js.Dynamic.literal(_collideWithWorld = _collideWithWorld.asInstanceOf[js.Any], _finalPosition = _finalPosition.asInstanceOf[js.Any], _scaledPosition = _scaledPosition.asInstanceOf[js.Any], _scaledVelocity = _scaledVelocity.asInstanceOf[js.Any], _scene = _scene.asInstanceOf[js.Any], createCollider = createCollider.toJsFn, getNewPosition = js.Any.fromFunction7((t0: Vector3, t1: Vector3, t2: Collider, t3: Double, t4: Nullable[AbstractMesh], t5: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], t6: Double) => (getNewPosition(t0, t1, t2, t3, t4, t5, t6)).runNow()), init = js.Any.fromFunction1((t0: Scene) => init(t0).runNow()))
    __obj.asInstanceOf[DefaultCollisionCoordinator]
  }
  
  extension [Self <: DefaultCollisionCoordinator](x: Self) {
    
    inline def set_collideWithWorld(value: Any): Self = StObject.set(x, "_collideWithWorld", value.asInstanceOf[js.Any])
    
    inline def set_finalPosition(value: Any): Self = StObject.set(x, "_finalPosition", value.asInstanceOf[js.Any])
    
    inline def set_scaledPosition(value: Any): Self = StObject.set(x, "_scaledPosition", value.asInstanceOf[js.Any])
    
    inline def set_scaledVelocity(value: Any): Self = StObject.set(x, "_scaledVelocity", value.asInstanceOf[js.Any])
    
    inline def set_scene(value: Any): Self = StObject.set(x, "_scene", value.asInstanceOf[js.Any])
  }
}
