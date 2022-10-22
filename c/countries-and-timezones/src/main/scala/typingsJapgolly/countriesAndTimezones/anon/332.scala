package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IT
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SM
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `332` extends StObject {
  
  var c: js.Tuple3[IT, SM, VA]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `332` {
  
  inline def apply(c: js.Tuple3[IT, SM, VA]): `332` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`332`]
  }
  
  extension [Self <: `332`](x: Self) {
    
    inline def setC(value: js.Tuple3[IT, SM, VA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
