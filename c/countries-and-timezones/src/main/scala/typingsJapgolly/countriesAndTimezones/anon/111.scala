package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `111` extends StObject {
  
  var c: js.Array[HT]
  
  var d: `-240`
  
  var u: `-300`
}
object `111` {
  
  inline def apply(c: js.Array[HT]): `111` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -240, u = -300)
    __obj.asInstanceOf[`111`]
  }
  
  extension [Self <: `111`](x: Self) {
    
    inline def setC(value: js.Array[HT]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HT*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-240`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
