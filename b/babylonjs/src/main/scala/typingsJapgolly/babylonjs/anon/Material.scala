package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Color4
import typingsJapgolly.babylonjs.BABYLON.LinesMesh
import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Material extends StObject {
  
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.undefined
  
  var instance: js.UndefOr[Nullable[LinesMesh]] = js.undefined
  
  var lines: js.Array[js.Array[Vector3]]
  
  var material: js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Material] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}
object Material {
  
  inline def apply(lines: js.Array[js.Array[Vector3]]): Material = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
  
  extension [Self <: Material](x: Self) {
    
    inline def setColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsNull: Self = StObject.set(x, "colors", null)
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: js.Array[Color4]*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setInstance(value: Nullable[LinesMesh]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLines(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
    
    inline def setLinesVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "lines", js.Array(value*))
    
    inline def setMaterial(value: typingsJapgolly.babylonjs.BABYLON.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setUseVertexAlpha(value: Boolean): Self = StObject.set(x, "useVertexAlpha", value.asInstanceOf[js.Any])
    
    inline def setUseVertexAlphaUndefined: Self = StObject.set(x, "useVertexAlpha", js.undefined)
  }
}
