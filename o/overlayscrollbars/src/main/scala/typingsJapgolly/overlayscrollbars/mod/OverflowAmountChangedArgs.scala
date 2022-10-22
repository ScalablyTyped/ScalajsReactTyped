package typingsJapgolly.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowAmountChangedArgs extends StObject {
  
  var x: Double
  
  var y: Double
}
object OverflowAmountChangedArgs {
  
  inline def apply(x: Double, y: Double): OverflowAmountChangedArgs = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowAmountChangedArgs]
  }
  
  extension [Self <: OverflowAmountChangedArgs](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
