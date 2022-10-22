package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GB
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GG
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IM
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `320` extends StObject {
  
  var c: js.Tuple4[GB, GG, IM, JE]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object `320` {
  
  inline def apply(c: js.Tuple4[GB, GG, IM, JE]): `320` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 60, u = 0)
    __obj.asInstanceOf[`320`]
  }
  
  extension [Self <: `320`](x: Self) {
    
    inline def setC(value: js.Tuple4[GB, GG, IM, JE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
