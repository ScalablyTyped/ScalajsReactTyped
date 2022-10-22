package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashNb extends StObject {
  
  var dashNb: js.UndefOr[Double] = js.undefined
  
  var dashSize: js.UndefOr[Double] = js.undefined
  
  var gapSize: js.UndefOr[Double] = js.undefined
  
  var instance: js.UndefOr[LinesMesh] = js.undefined
  
  var material: js.UndefOr[typingsJapgolly.babylonjs.materialsMaterialMod.Material] = js.undefined
  
  var points: js.Array[Vector3]
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var useVertexAlpha: js.UndefOr[Boolean] = js.undefined
}
object DashNb {
  
  inline def apply(points: js.Array[Vector3]): DashNb = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashNb]
  }
  
  extension [Self <: DashNb](x: Self) {
    
    inline def setDashNb(value: Double): Self = StObject.set(x, "dashNb", value.asInstanceOf[js.Any])
    
    inline def setDashNbUndefined: Self = StObject.set(x, "dashNb", js.undefined)
    
    inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    inline def setInstance(value: LinesMesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setMaterial(value: typingsJapgolly.babylonjs.materialsMaterialMod.Material): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setUseVertexAlpha(value: Boolean): Self = StObject.set(x, "useVertexAlpha", value.asInstanceOf[js.Any])
    
    inline def setUseVertexAlphaUndefined: Self = StObject.set(x, "useVertexAlpha", js.undefined)
  }
}
