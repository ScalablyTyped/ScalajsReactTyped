package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maximum extends StObject {
  
  var maximum: Cartesian3
  
  var minimum: Cartesian3
  
  var vertexFormat: js.UndefOr[typingsJapgolly.cesium.mod.VertexFormat] = js.undefined
}
object Maximum {
  
  inline def apply(maximum: Cartesian3, minimum: Cartesian3): Maximum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximum]
  }
  
  extension [Self <: Maximum](x: Self) {
    
    inline def setMaximum(value: Cartesian3): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Cartesian3): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setVertexFormat(value: typingsJapgolly.cesium.mod.VertexFormat): Self = StObject.set(x, "vertexFormat", value.asInstanceOf[js.Any])
    
    inline def setVertexFormatUndefined: Self = StObject.set(x, "vertexFormat", js.undefined)
  }
}
