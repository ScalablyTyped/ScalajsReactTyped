package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `392` extends StObject {
  
  var c: js.Array[FM]
  
  var u: `660`
}
object `392` {
  
  inline def apply(c: js.Array[FM]): `392` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`392`]
  }
  
  extension [Self <: `392`](x: Self) {
    
    inline def setC(value: js.Array[FM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: FM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
