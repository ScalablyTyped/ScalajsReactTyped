package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.KH
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LA
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TH
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.VN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `155` extends StObject {
  
  var c: js.Tuple4[TH, KH, LA, VN]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `155` {
  
  inline def apply(c: js.Tuple4[TH, KH, LA, VN]): `155` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`155`]
  }
  
  extension [Self <: `155`](x: Self) {
    
    inline def setC(value: js.Tuple4[TH, KH, LA, VN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
