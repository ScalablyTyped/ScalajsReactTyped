package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashBangkok
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `217` extends StObject {
  
  var a: AsiaSlashBangkok
  
  var c: js.Array[LA]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `217` {
  
  inline def apply(c: js.Array[LA]): `217` = {
    val __obj = js.Dynamic.literal(a = "Asia/Bangkok", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`217`]
  }
  
  extension [Self <: `217`](x: Self) {
    
    inline def setA(value: AsiaSlashBangkok): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[LA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
