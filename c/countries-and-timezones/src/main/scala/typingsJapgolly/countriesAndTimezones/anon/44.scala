package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `44` extends StObject {
  
  var c: js.Array[BR]
  
  var u: `-180`
}
object `44` {
  
  inline def apply(c: js.Array[BR]): `44` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -180)
    __obj.asInstanceOf[`44`]
  }
  
  extension [Self <: `44`](x: Self) {
    
    inline def setC(value: js.Array[BR]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BR*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
