package typingsJapgolly.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hours extends StObject {
  
  var hours: Double
}
object Hours {
  
  inline def apply(hours: Double): Hours = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hours]
  }
  
  extension [Self <: Hours](x: Self) {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
  }
}
