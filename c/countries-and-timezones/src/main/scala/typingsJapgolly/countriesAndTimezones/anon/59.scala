package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `59` extends StObject {
  
  var c: js.Array[MX]
  
  var u: `-300`
}
object `59` {
  
  inline def apply(c: js.Array[MX]): `59` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -300)
    __obj.asInstanceOf[`59`]
  }
  
  extension [Self <: `59`](x: Self) {
    
    inline def setC(value: js.Array[MX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MX*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
