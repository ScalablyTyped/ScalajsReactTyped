package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radius extends StObject {
  
  var arc: js.UndefOr[Double] = js.undefined
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var tessellation: js.UndefOr[Double] = js.undefined
}
object Radius {
  
  inline def apply(): Radius = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Radius]
  }
  
  extension [Self <: Radius](x: Self) {
    
    inline def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    inline def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
  }
}
