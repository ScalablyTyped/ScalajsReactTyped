package typingsJapgolly.countriesAndTimezones.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `296` extends StObject {
  
  var c: js.Array[typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AD]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `296` {
  
  inline def apply(c: js.Array[typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AD]): `296` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`296`]
  }
  
  extension [Self <: `296`](x: Self) {
    
    inline def setC(value: js.Array[typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AD]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AD*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
