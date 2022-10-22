package typingsJapgolly.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarProps extends StObject {
  
  var base: Double
  
  var height: Double
  
  var horizontal: Boolean
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object BarProps {
  
  inline def apply(base: Double, height: Double, horizontal: Boolean, width: Double, x: Double, y: Double): BarProps = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarProps]
  }
  
  extension [Self <: BarProps](x: Self) {
    
    inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
