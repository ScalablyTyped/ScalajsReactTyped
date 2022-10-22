package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RU
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `335` extends StObject {
  
  var c: js.Tuple2[RU, UA]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`
}
object `335` {
  
  inline def apply(c: js.Tuple2[RU, UA]): `335` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 180)
    __obj.asInstanceOf[`335`]
  }
  
  extension [Self <: `335`](x: Self) {
    
    inline def setC(value: js.Tuple2[RU, UA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`180`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
