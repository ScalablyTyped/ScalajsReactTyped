package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `149` extends StObject {
  
  var c: js.Array[KZ]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `149` {
  
  inline def apply(c: js.Array[KZ]): `149` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`149`]
  }
  
  extension [Self <: `149`](x: Self) {
    
    inline def setC(value: js.Array[KZ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: KZ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
