package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`660`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.NC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `399` extends StObject {
  
  var c: js.Array[NC]
  
  var u: `660`
}
object `399` {
  
  inline def apply(c: js.Array[NC]): `399` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 660)
    __obj.asInstanceOf[`399`]
  }
  
  extension [Self <: `399`](x: Self) {
    
    inline def setC(value: js.Array[NC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: NC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
