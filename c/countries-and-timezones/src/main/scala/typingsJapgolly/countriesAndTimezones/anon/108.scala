package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-300`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CA
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KY
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `108` extends StObject {
  
  var c: js.Tuple3[PA, CA, KY]
  
  var u: `-300`
}
object `108` {
  
  inline def apply(c: js.Tuple3[PA, CA, KY]): `108` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -300)
    __obj.asInstanceOf[`108`]
  }
  
  extension [Self <: `108`](x: Self) {
    
    inline def setC(value: js.Tuple3[PA, CA, KY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
