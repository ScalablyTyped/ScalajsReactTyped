package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `174` extends StObject {
  
  var c: js.Array[HK]
  
  var u: `480`
}
object `174` {
  
  inline def apply(c: js.Array[HK]): `174` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`174`]
  }
  
  extension [Self <: `174`](x: Self) {
    
    inline def setC(value: js.Array[HK]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: HK*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
