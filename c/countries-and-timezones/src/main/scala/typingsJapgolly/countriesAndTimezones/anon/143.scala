package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `143` extends StObject {
  
  var c: js.Array[AQ]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `143` {
  
  inline def apply(c: js.Array[AQ]): `143` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`143`]
  }
  
  extension [Self <: `143`](x: Self) {
    
    inline def setC(value: js.Array[AQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
