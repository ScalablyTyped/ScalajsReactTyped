package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `190` extends StObject {
  
  var c: js.Array[MO]
  
  var u: `480`
}
object `190` {
  
  inline def apply(c: js.Array[MO]): `190` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`190`]
  }
  
  extension [Self <: `190`](x: Self) {
    
    inline def setC(value: js.Array[MO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
