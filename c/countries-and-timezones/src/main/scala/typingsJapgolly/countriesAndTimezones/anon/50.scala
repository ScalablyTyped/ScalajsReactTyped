package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-360`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `50` extends StObject {
  
  var c: js.Array[MX]
  
  var d: `-300`
  
  var u: `-360`
}
object `50` {
  
  inline def apply(c: js.Array[MX]): `50` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -300, u = -360)
    __obj.asInstanceOf[`50`]
  }
  
  extension [Self <: `50`](x: Self) {
    
    inline def setC(value: js.Array[MX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MX*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-300`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
