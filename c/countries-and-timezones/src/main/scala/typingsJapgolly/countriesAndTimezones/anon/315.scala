package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashLondon
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.JE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `315` extends StObject {
  
  var a: EuropeSlashLondon
  
  var c: js.Array[JE]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `315` {
  
  inline def apply(c: js.Array[JE]): `315` = {
    val __obj = js.Dynamic.literal(a = "Europe/London", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`315`]
  }
  
  extension [Self <: `315`](x: Self) {
    
    inline def setA(value: EuropeSlashLondon): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[JE]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: JE*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
