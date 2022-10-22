package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effect extends StObject {
  
  var effect: typingsJapgolly.babylonjs.materialsEffectMod.Effect
  
  var subMesh: Nullable[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]
}
object Effect {
  
  inline def apply(effect: typingsJapgolly.babylonjs.materialsEffectMod.Effect): Effect = {
    val __obj = js.Dynamic.literal(effect = effect.asInstanceOf[js.Any], subMesh = null)
    __obj.asInstanceOf[Effect]
  }
  
  extension [Self <: Effect](x: Self) {
    
    inline def setEffect(value: typingsJapgolly.babylonjs.materialsEffectMod.Effect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setSubMesh(value: Nullable[typingsJapgolly.babylonjs.meshesSubMeshMod.SubMesh]): Self = StObject.set(x, "subMesh", value.asInstanceOf[js.Any])
    
    inline def setSubMeshNull: Self = StObject.set(x, "subMesh", null)
  }
}
