package typingsJapgolly.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellAddress
  extends StObject
     with _RangeSpec {
  
  /** Column number */
  var c: Double
  
  /** Row number */
  var r: Double
}
object CellAddress {
  
  inline def apply(c: Double, r: Double): CellAddress = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellAddress]
  }
  
  extension [Self <: CellAddress](x: Self) {
    
    inline def setC(value: Double): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
