package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `152` extends StObject {
  
  var c: js.Array[IQ]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `152` {
  
  inline def apply(c: js.Array[IQ]): `152` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`152`]
  }
  
  extension [Self <: `152`](x: Self) {
    
    inline def setC(value: js.Array[IQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
