package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `354` extends StObject {
  
  var c: js.Array[CC]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`390`
}
object `354` {
  
  inline def apply(c: js.Array[CC]): `354` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 390)
    __obj.asInstanceOf[`354`]
  }
  
  extension [Self <: `354`](x: Self) {
    
    inline def setC(value: js.Array[CC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`390`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
