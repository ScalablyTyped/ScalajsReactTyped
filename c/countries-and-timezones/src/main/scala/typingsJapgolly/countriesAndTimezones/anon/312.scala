package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AX
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.FI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `312` extends StObject {
  
  var c: js.Tuple2[FI, AX]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`
}
object `312` {
  
  inline def apply(c: js.Tuple2[FI, AX]): `312` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 180, u = 120)
    __obj.asInstanceOf[`312`]
  }
  
  extension [Self <: `312`](x: Self) {
    
    inline def setC(value: js.Tuple2[FI, AX]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
