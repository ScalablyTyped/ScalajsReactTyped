package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `220` extends StObject {
  
  var c: js.Array[AM]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`240`
}
object `220` {
  
  inline def apply(c: js.Array[AM]): `220` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`220`]
  }
  
  extension [Self <: `220`](x: Self) {
    
    inline def setC(value: js.Array[AM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
