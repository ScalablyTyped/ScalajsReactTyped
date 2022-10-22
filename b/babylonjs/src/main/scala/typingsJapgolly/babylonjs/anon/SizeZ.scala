package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Color4
import typingsJapgolly.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeZ extends StObject {
  
  var custom: js.UndefOr[Any] = js.undefined
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeX: js.UndefOr[Double] = js.undefined
  
  var sizeY: js.UndefOr[Double] = js.undefined
  
  var sizeZ: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object SizeZ {
  
  inline def apply(): SizeZ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeZ]
  }
  
  extension [Self <: SizeZ](x: Self) {
    
    inline def setCustom(value: Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    inline def setFaceColorsUndefined: Self = StObject.set(x, "faceColors", js.undefined)
    
    inline def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value*))
    
    inline def setFaceUV(value: js.Array[Vector4]): Self = StObject.set(x, "faceUV", value.asInstanceOf[js.Any])
    
    inline def setFaceUVUndefined: Self = StObject.set(x, "faceUV", js.undefined)
    
    inline def setFaceUVVarargs(value: Vector4*): Self = StObject.set(x, "faceUV", js.Array(value*))
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    inline def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    inline def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
    
    inline def setSizeZ(value: Double): Self = StObject.set(x, "sizeZ", value.asInstanceOf[js.Any])
    
    inline def setSizeZUndefined: Self = StObject.set(x, "sizeZ", js.undefined)
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
