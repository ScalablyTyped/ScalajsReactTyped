package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `61` extends StObject {
  
  var c: js.Array[GF]
  
  var u: `-180`
}
object `61` {
  
  inline def apply(c: js.Array[GF]): `61` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`61`]
  }
  
  extension [Self <: `61`](x: Self) {
    
    inline def setC(value: js.Array[GF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
