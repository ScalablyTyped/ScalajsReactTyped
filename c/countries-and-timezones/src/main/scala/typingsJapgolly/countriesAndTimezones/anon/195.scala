package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `195` extends StObject {
  
  var c: js.Array[RU]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `195` {
  
  inline def apply(c: js.Array[RU]): `195` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`195`]
  }
  
  extension [Self <: `195`](x: Self) {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
