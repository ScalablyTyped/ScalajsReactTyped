package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.EuropeSlashBelgrade
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ME
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `329` extends StObject {
  
  var a: EuropeSlashBelgrade
  
  var c: js.Array[ME]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `329` {
  
  inline def apply(c: js.Array[ME]): `329` = {
    val __obj = js.Dynamic.literal(a = "Europe/Belgrade", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`329`]
  }
  
  extension [Self <: `329`](x: Self) {
    
    inline def setA(value: EuropeSlashBelgrade): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[ME]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ME*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
