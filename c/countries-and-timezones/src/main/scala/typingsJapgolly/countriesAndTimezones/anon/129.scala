package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-180`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-240`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `129` extends StObject {
  
  var c: js.Array[GL]
  
  var d: `-180`
  
  var u: `-240`
}
object `129` {
  
  inline def apply(c: js.Array[GL]): `129` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -180, u = -240)
    __obj.asInstanceOf[`129`]
  }
  
  extension [Self <: `129`](x: Self) {
    
    inline def setC(value: js.Array[GL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-240`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
