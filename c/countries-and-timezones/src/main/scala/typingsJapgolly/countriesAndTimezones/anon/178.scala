package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `178` extends StObject {
  
  var c: js.Array[ID]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `178` {
  
  inline def apply(c: js.Array[ID]): `178` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`178`]
  }
  
  extension [Self <: `178`](x: Self) {
    
    inline def setC(value: js.Array[ID]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ID*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
