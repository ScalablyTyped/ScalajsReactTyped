package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-360`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `97` extends StObject {
  
  var c: js.Array[NI]
  
  var u: `-360`
}
object `97` {
  
  inline def apply(c: js.Array[NI]): `97` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -360)
    __obj.asInstanceOf[`97`]
  }
  
  extension [Self <: `97`](x: Self) {
    
    inline def setC(value: js.Array[NI]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NI*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
