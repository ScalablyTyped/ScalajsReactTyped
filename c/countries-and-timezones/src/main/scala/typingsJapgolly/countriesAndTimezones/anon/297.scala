package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `297` extends StObject {
  
  var c: js.Array[RU]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`240`
}
object `297` {
  
  inline def apply(c: js.Array[RU]): `297` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`297`]
  }
  
  extension [Self <: `297`](x: Self) {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
