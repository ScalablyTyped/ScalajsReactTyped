package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BF
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CI
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GH
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GM
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GN
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ML
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MR
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SH
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SL
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.SN
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.TG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait C extends StObject {
  
  var c: js.Tuple11[CI, BF, GH, GM, GN, ML, MR, SH, SL, SN, TG]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object C {
  
  inline def apply(c: js.Tuple11[CI, BF, GH, GM, GN, ML, MR, SH, SL, SN, TG]): C = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 0)
    __obj.asInstanceOf[C]
  }
  
  extension [Self <: C](x: Self) {
    
    inline def setC(value: js.Tuple11[CI, BF, GH, GM, GN, ML, MR, SH, SL, SN, TG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
