package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Collider extends StObject {
  
  var collider: typingsJapgolly.babylonjs.meshesMeshMod.Mesh
  
  var rotationMesh: typingsJapgolly.babylonjs.meshesMeshMod.Mesh
}
object Collider {
  
  inline def apply(
    collider: typingsJapgolly.babylonjs.meshesMeshMod.Mesh,
    rotationMesh: typingsJapgolly.babylonjs.meshesMeshMod.Mesh
  ): Collider = {
    val __obj = js.Dynamic.literal(collider = collider.asInstanceOf[js.Any], rotationMesh = rotationMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Collider]
  }
  
  extension [Self <: Collider](x: Self) {
    
    inline def setCollider(value: typingsJapgolly.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "collider", value.asInstanceOf[js.Any])
    
    inline def setRotationMesh(value: typingsJapgolly.babylonjs.meshesMeshMod.Mesh): Self = StObject.set(x, "rotationMesh", value.asInstanceOf[js.Any])
  }
}
