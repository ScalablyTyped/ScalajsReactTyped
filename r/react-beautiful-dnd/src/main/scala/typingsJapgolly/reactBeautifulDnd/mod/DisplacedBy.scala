package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplacedBy extends StObject {
  
  var point: Position
  
  var value: Double
}
object DisplacedBy {
  
  inline def apply(point: Position, value: Double): DisplacedBy = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplacedBy]
  }
  
  extension [Self <: DisplacedBy](x: Self) {
    
    inline def setPoint(value: Position): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
