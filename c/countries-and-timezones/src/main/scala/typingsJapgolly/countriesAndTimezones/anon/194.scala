package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AsiaSlashDubai
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.OM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `194` extends StObject {
  
  var a: AsiaSlashDubai
  
  var c: js.Array[OM]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `194` {
  
  inline def apply(c: js.Array[OM]): `194` = {
    val __obj = js.Dynamic.literal(a = "Asia/Dubai", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`194`]
  }
  
  extension [Self <: `194`](x: Self) {
    
    inline def setA(value: AsiaSlashDubai): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[OM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: OM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
