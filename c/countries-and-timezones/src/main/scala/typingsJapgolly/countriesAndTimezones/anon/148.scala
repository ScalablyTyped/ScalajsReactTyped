package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`720`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var c: js.Array[RU]
  
  var u: `720`
}
object `148` {
  
  inline def apply(c: js.Array[RU]): `148` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 720)
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setC(value: js.Array[RU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: RU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `720`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
