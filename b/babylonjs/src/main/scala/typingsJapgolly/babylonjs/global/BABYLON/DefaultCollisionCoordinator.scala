package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.DefaultCollisionCoordinator")
@js.native
open class DefaultCollisionCoordinator ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.DefaultCollisionCoordinator {
  
  /* private */ /* CompleteClass */
  var _collideWithWorld: Any = js.native
  
  /* private */ /* CompleteClass */
  var _finalPosition: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scaledPosition: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scaledVelocity: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /* CompleteClass */
  override def createCollider(): typingsJapgolly.babylonjs.BABYLON.Collider = js.native
  
  /* CompleteClass */
  override def getNewPosition(
    position: typingsJapgolly.babylonjs.BABYLON.Vector3,
    displacement: typingsJapgolly.babylonjs.BABYLON.Vector3,
    collider: typingsJapgolly.babylonjs.BABYLON.Collider,
    maximumRetry: Double,
    excludedMesh: Nullable[typingsJapgolly.babylonjs.BABYLON.AbstractMesh],
    onNewPosition: js.Function3[
      /* collisionIndex */ Double, 
      /* newPosition */ typingsJapgolly.babylonjs.BABYLON.Vector3, 
      /* collidedMesh */ Nullable[typingsJapgolly.babylonjs.BABYLON.AbstractMesh], 
      Unit
    ],
    collisionIndex: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override def init(scene: typingsJapgolly.babylonjs.BABYLON.Scene): Unit = js.native
}
