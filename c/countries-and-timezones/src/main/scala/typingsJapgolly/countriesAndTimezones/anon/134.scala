package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `134` extends StObject {
  
  var c: js.Array[AQ]
  
  var u: `660`
}
object `134` {
  
  inline def apply(c: js.Array[AQ]): `134` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`134`]
  }
  
  extension [Self <: `134`](x: Self) {
    
    inline def setC(value: js.Array[AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
