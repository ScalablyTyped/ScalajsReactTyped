package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashNairobi
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `351` extends StObject {
  
  var a: AfricaSlashNairobi
  
  var c: js.Array[MG]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `351` {
  
  inline def apply(c: js.Array[MG]): `351` = {
    val __obj = js.Dynamic.literal(a = "Africa/Nairobi", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`351`]
  }
  
  extension [Self <: `351`](x: Self) {
    
    inline def setA(value: AfricaSlashNairobi): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[MG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
