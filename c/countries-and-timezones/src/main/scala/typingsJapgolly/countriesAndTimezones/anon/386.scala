package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `386` extends StObject {
  
  var c: js.Array[SB]
  
  var u: `660`
}
object `386` {
  
  inline def apply(c: js.Array[SB]): `386` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`386`]
  }
  
  extension [Self <: `386`](x: Self) {
    
    inline def setC(value: js.Array[SB]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: SB*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
