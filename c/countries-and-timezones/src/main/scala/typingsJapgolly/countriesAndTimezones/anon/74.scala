package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-360`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `74` extends StObject {
  
  var c: js.Array[SV]
  
  var u: `-360`
}
object `74` {
  
  inline def apply(c: js.Array[SV]): `74` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -360)
    __obj.asInstanceOf[`74`]
  }
  
  extension [Self <: `74`](x: Self) {
    
    inline def setC(value: js.Array[SV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SV*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
