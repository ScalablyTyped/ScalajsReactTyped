package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashAbidjan
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.ML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CR extends StObject {
  
  var a: AfricaSlashAbidjan
  
  var c: js.Array[ML]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object CR {
  
  inline def apply(c: js.Array[ML]): CR = {
    val __obj = js.Dynamic.literal(a = "Africa/Abidjan", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[CR]
  }
  
  extension [Self <: CR](x: Self) {
    
    inline def setA(value: AfricaSlashAbidjan): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[ML]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: ML*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
