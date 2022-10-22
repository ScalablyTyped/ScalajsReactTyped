package typingsJapgolly.three.anon

import typingsJapgolly.three.srcRenderersShadersUniformsLibMod.IUniform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightMap extends StObject {
  
  var height: IUniform[Any]
  
  var heightMap: IUniform[Any]
  
  var resolution: IUniform[Any]
  
  var scale: IUniform[Any]
}
object HeightMap {
  
  inline def apply(height: IUniform[Any], heightMap: IUniform[Any], resolution: IUniform[Any], scale: IUniform[Any]): HeightMap = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], heightMap = heightMap.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightMap]
  }
  
  extension [Self <: HeightMap](x: Self) {
    
    inline def setHeight(value: IUniform[Any]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightMap(value: IUniform[Any]): Self = StObject.set(x, "heightMap", value.asInstanceOf[js.Any])
    
    inline def setResolution(value: IUniform[Any]): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setScale(value: IUniform[Any]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
