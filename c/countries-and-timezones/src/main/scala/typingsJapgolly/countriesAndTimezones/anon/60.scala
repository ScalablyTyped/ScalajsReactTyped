package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `60` extends StObject {
  
  var c: js.Array[VE]
  
  var u: `-240`
}
object `60` {
  
  inline def apply(c: js.Array[VE]): `60` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -240)
    __obj.asInstanceOf[`60`]
  }
  
  extension [Self <: `60`](x: Self) {
    
    inline def setC(value: js.Array[VE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: VE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
