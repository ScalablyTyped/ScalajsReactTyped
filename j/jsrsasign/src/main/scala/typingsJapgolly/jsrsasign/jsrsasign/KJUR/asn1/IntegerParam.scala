package typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntegerParam extends StObject {
  
  var int: Double
}
object IntegerParam {
  
  inline def apply(int: Double): IntegerParam = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParam]
  }
  
  extension [Self <: IntegerParam](x: Self) {
    
    inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
  }
}
