package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `88` extends StObject {
  
  var c: js.Array[JM]
  
  var u: `-300`
}
object `88` {
  
  inline def apply(c: js.Array[JM]): `88` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -300)
    __obj.asInstanceOf[`88`]
  }
  
  extension [Self <: `88`](x: Self) {
    
    inline def setC(value: js.Array[JM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: JM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
