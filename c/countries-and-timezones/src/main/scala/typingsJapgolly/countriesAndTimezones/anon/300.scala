package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BA
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.HR
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ME
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MK
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.RS
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `300` extends StObject {
  
  var c: js.Tuple6[RS, BA, HR, ME, MK, SI]
  
  var d: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`
}
object `300` {
  
  inline def apply(c: js.Tuple6[RS, BA, HR, ME, MK, SI]): `300` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = 120, u = 60)
    __obj.asInstanceOf[`300`]
  }
  
  extension [Self <: `300`](x: Self) {
    
    inline def setC(value: js.Tuple6[RS, BA, HR, ME, MK, SI]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setD(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`120`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`60`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
