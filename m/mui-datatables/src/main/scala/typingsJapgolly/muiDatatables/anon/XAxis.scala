package typingsJapgolly.muiDatatables.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAxis extends StObject {
  
  /** @deprecated use `fixedHeader` */
  var xAxis: Boolean
  
  /** @deprecated use `fixedSelectColumn` */
  var yAxis: Boolean
}
object XAxis {
  
  inline def apply(xAxis: Boolean, yAxis: Boolean): XAxis = {
    val __obj = js.Dynamic.literal(xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[XAxis]
  }
  
  extension [Self <: XAxis](x: Self) {
    
    inline def setXAxis(value: Boolean): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
    
    inline def setYAxis(value: Boolean): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
  }
}
