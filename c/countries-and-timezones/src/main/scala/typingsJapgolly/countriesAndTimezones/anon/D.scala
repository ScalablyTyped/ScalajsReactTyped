package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait D extends StObject {
  
  var c: js.Array[MA]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object D {
  
  inline def apply(c: js.Array[MA]): D = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 0, u = 60)
    __obj.asInstanceOf[D]
  }
  
  extension [Self <: D](x: Self) {
    
    inline def setC(value: js.Array[MA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
