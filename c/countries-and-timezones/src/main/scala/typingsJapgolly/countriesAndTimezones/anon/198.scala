package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BH
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.QA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `198` extends StObject {
  
  var c: js.Tuple2[QA, BH]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `198` {
  
  inline def apply(c: js.Tuple2[QA, BH]): `198` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`198`]
  }
  
  extension [Self <: `198`](x: Self) {
    
    inline def setC(value: js.Tuple2[QA, BH]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
