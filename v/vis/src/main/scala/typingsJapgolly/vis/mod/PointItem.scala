package typingsJapgolly.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointItem
  extends StObject
     with DataItem {
  
  var x: String
  
  var y: Double
}
object PointItem {
  
  inline def apply(content: String, start: DateType, x: String, y: Double): PointItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointItem]
  }
  
  extension [Self <: PointItem](x: Self) {
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
