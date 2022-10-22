package typingsJapgolly.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisSelectProperties extends StObject {
  
  var items: js.Array[Double]
}
object VisSelectProperties {
  
  inline def apply(items: js.Array[Double]): VisSelectProperties = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisSelectProperties]
  }
  
  extension [Self <: VisSelectProperties](x: Self) {
    
    inline def setItems(value: js.Array[Double]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Double*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
