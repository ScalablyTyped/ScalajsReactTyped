package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `207` extends StObject {
  
  var c: js.Array[GE]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`240`
}
object `207` {
  
  inline def apply(c: js.Array[GE]): `207` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 240)
    __obj.asInstanceOf[`207`]
  }
  
  extension [Self <: `207`](x: Self) {
    
    inline def setC(value: js.Array[GE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
