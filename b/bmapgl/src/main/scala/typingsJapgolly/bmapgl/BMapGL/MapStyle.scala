package typingsJapgolly.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapStyle extends StObject {
  
  var features: js.Array[Any]
  
  var style: String
}
object MapStyle {
  
  inline def apply(features: js.Array[Any], style: String): MapStyle = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyle]
  }
  
  extension [Self <: MapStyle](x: Self) {
    
    inline def setFeatures(value: js.Array[Any]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: Any*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
