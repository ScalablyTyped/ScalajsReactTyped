package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color4
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector3
import typingsJapgolly.babylonjs.mathsMathDotvectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Holes extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var depth: js.UndefOr[Double] = js.undefined
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var holes: js.UndefOr[js.Array[js.Array[Vector3]]] = js.undefined
  
  var shape: js.Array[Vector3]
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var wrap: js.UndefOr[Boolean] = js.undefined
}
object Holes {
  
  inline def apply(shape: js.Array[Vector3]): Holes = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[Holes]
  }
  
  extension [Self <: Holes](x: Self) {
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    inline def setFaceColorsUndefined: Self = StObject.set(x, "faceColors", js.undefined)
    
    inline def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value*))
    
    inline def setFaceUV(value: js.Array[Vector4]): Self = StObject.set(x, "faceUV", value.asInstanceOf[js.Any])
    
    inline def setFaceUVUndefined: Self = StObject.set(x, "faceUV", js.undefined)
    
    inline def setFaceUVVarargs(value: Vector4*): Self = StObject.set(x, "faceUV", js.Array(value*))
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setHoles(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "holes", value.asInstanceOf[js.Any])
    
    inline def setHolesUndefined: Self = StObject.set(x, "holes", js.undefined)
    
    inline def setHolesVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "holes", js.Array(value*))
    
    inline def setShape(value: js.Array[Vector3]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeVarargs(value: Vector3*): Self = StObject.set(x, "shape", js.Array(value*))
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
