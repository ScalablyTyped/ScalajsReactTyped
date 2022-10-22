package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollisionCoordinator extends StObject {
  
  def createCollider(): Collider
  
  def getNewPosition(
    position: Vector3,
    displacement: Vector3,
    collider: Collider,
    maximumRetry: Double,
    excludedMesh: Nullable[AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit
  
  def init(scene: Scene): Unit
}
object ICollisionCoordinator {
  
  inline def apply(
    createCollider: CallbackTo[Collider],
    getNewPosition: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], Double) => Callback,
    init: Scene => Callback
  ): ICollisionCoordinator = {
    val __obj = js.Dynamic.literal(createCollider = createCollider.toJsFn, getNewPosition = js.Any.fromFunction7((t0: Vector3, t1: Vector3, t2: Collider, t3: Double, t4: Nullable[AbstractMesh], t5: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ Vector3, 
      /* collidedMesh */ Nullable[AbstractMesh], 
      Unit
    ], t6: Double) => (getNewPosition(t0, t1, t2, t3, t4, t5, t6)).runNow()), init = js.Any.fromFunction1((t0: Scene) => init(t0).runNow()))
    __obj.asInstanceOf[ICollisionCoordinator]
  }
  
  extension [Self <: ICollisionCoordinator](x: Self) {
    
    inline def setCreateCollider(value: CallbackTo[Collider]): Self = StObject.set(x, "createCollider", value.toJsFn)
    
    inline def setGetNewPosition(
      value: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], Double) => Callback
    ): Self = StObject.set(x, "getNewPosition", js.Any.fromFunction7((t0: Vector3, t1: Vector3, t2: Collider, t3: Double, t4: Nullable[AbstractMesh], t5: js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], t6: Double) => (value(t0, t1, t2, t3, t4, t5, t6)).runNow()))
    
    inline def setInit(value: Scene => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: Scene) => value(t0).runNow()))
  }
}
