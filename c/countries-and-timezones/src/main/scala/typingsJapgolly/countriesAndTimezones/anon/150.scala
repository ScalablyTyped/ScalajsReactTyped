package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `150` extends StObject {
  
  var c: js.Array[TM]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `150` {
  
  inline def apply(c: js.Array[TM]): `150` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`150`]
  }
  
  extension [Self <: `150`](x: Self) {
    
    inline def setC(value: js.Array[TM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
