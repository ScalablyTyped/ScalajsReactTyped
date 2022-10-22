package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubMesh extends StObject {
  
  var effect: typingsJapgolly.babylonjs.BABYLON.Effect
  
  var subMesh: Nullable[typingsJapgolly.babylonjs.BABYLON.SubMesh]
}
object SubMesh {
  
  inline def apply(effect: typingsJapgolly.babylonjs.BABYLON.Effect): SubMesh = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], subMesh = null)
    __obj.asInstanceOf[SubMesh]
  }
  
  extension [Self <: SubMesh](x: Self) {
    
    inline def setEffect(value: typingsJapgolly.babylonjs.BABYLON.Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setSubMesh(value: Nullable[typingsJapgolly.babylonjs.BABYLON.SubMesh]): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
    
    inline def setSubMeshNull: Self = StObject.set(x, "subMesh", null)
  }
}
