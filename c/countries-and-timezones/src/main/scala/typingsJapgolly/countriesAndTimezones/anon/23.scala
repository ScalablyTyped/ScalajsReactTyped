package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashMaputo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var a: AfricaSlashMaputo
  
  var c: js.Array[typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `23` {
  
  inline def apply(c: js.Array[typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD]): `23` = {
    val __obj = js.Dynamic.literal(a = "Africa/Maputo", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setA(value: AfricaSlashMaputo): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CD*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
