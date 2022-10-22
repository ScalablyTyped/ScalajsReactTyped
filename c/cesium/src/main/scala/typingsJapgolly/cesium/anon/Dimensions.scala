package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dimensions extends StObject {
  
  var dimensions: Cartesian3
  
  var vertexFormat: js.UndefOr[typingsJapgolly.cesium.mod.VertexFormat] = js.undefined
}
object Dimensions {
  
  inline def apply(dimensions: Cartesian3): Dimensions = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimensions]
  }
  
  extension [Self <: Dimensions](x: Self) {
    
    inline def setDimensions(value: Cartesian3): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setVertexFormat(value: typingsJapgolly.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
