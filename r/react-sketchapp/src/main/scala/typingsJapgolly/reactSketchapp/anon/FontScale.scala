package typingsJapgolly.reactSketchapp.anon

import typingsJapgolly.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontScale extends StObject {
  
  var fontScale: Requireable[Double]
  
  var height: Requireable[Double]
  
  var name: Requireable[String]
  
  var scale: Requireable[Double]
  
  var width: Requireable[Double]
}
object FontScale {
  
  inline def apply(
    fontScale: Requireable[Double],
    height: Requireable[Double],
    name: Requireable[String],
    scale: Requireable[Double],
    width: Requireable[Double]
  ): FontScale = {
    val __obj = js.Dynamic.literal(fontScale = fontScale.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontScale]
  }
  
  extension [Self <: FontScale](x: Self) {
    
    inline def setFontScale(value: Requireable[Double]): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Requireable[Double]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setName(value: Requireable[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Requireable[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Requireable[Double]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
