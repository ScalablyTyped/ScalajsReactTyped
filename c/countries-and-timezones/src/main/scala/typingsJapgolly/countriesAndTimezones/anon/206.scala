package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TW
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `206` extends StObject {
  
  var c: js.Array[TW]
  
  var u: `480`
}
object `206` {
  
  inline def apply(c: js.Array[TW]): `206` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`206`]
  }
  
  extension [Self <: `206`](x: Self) {
    
    inline def setC(value: js.Array[TW]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: TW*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
