package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `353` extends StObject {
  
  var c: js.Array[CX]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `353` {
  
  inline def apply(c: js.Array[CX]): `353` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`353`]
  }
  
  extension [Self <: `353`](x: Self) {
    
    inline def setC(value: js.Array[CX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CX*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
