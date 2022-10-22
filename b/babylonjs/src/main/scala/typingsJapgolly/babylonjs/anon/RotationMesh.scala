package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RotationMesh extends StObject {
  
  var collider: typingsJapgolly.babylonjs.BABYLON.Mesh
  
  var rotationMesh: typingsJapgolly.babylonjs.BABYLON.Mesh
}
object RotationMesh {
  
  inline def apply(
    collider: typingsJapgolly.babylonjs.BABYLON.Mesh,
    rotationMesh: typingsJapgolly.babylonjs.BABYLON.Mesh
  ): RotationMesh = {
    val __obj = js.Dynamic.literal(collider = collider.asInstanceOf[js.Any], rotationMesh = rotationMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[RotationMesh]
  }
  
  extension [Self <: RotationMesh](x: Self) {
    
    inline def setCollider(value: typingsJapgolly.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "collider", value.asInstanceOf[js.Any])
    
    inline def setRotationMesh(value: typingsJapgolly.babylonjs.BABYLON.Mesh): Self = StObject.set(x, "rotationMesh", value.asInstanceOf[js.Any])
  }
}
