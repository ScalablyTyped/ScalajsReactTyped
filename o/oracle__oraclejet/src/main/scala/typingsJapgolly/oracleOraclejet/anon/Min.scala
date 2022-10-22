package typingsJapgolly.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  var inRange: js.UndefOr[String] = js.undefined
  
  var max: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[String] = js.undefined
}
object Min {
  
  inline def apply(): Min = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Min]
  }
  
  extension [Self <: Min](x: Self) {
    
    inline def setInRange(value: String): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
    
    inline def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
