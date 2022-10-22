package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON._MeshCollisionData")
@js.native
open class MeshCollisionData ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MeshCollisionData {
  
  /* CompleteClass */
  var _checkCollisions: Boolean = js.native
  
  /* CompleteClass */
  var _collider: Nullable[typingsJapgolly.babylonjs.BABYLON.Collider] = js.native
  
  /* CompleteClass */
  var _collisionGroup: Double = js.native
  
  /* CompleteClass */
  var _collisionMask: Double = js.native
  
  /* CompleteClass */
  var _collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var _diffPositionForCollisions: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  var _oldPositionForCollisions: typingsJapgolly.babylonjs.BABYLON.Vector3 = js.native
  
  /* CompleteClass */
  var _onCollideObserver: Nullable[
    typingsJapgolly.babylonjs.BABYLON.Observer[typingsJapgolly.babylonjs.BABYLON.AbstractMesh]
  ] = js.native
  
  /* CompleteClass */
  var _onCollisionPositionChangeObserver: Nullable[
    typingsJapgolly.babylonjs.BABYLON.Observer[typingsJapgolly.babylonjs.BABYLON.Vector3]
  ] = js.native
  
  /* CompleteClass */
  var _surroundingMeshes: Nullable[js.Array[typingsJapgolly.babylonjs.BABYLON.AbstractMesh]] = js.native
}
