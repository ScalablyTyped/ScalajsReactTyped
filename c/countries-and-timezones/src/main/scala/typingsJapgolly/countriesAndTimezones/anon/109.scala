package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `109` extends StObject {
  
  var c: js.Array[SR]
  
  var u: `-180`
}
object `109` {
  
  inline def apply(c: js.Array[SR]): `109` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`109`]
  }
  
  extension [Self <: `109`](x: Self) {
    
    inline def setC(value: js.Array[SR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
