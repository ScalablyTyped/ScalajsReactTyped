package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PacificSlashPago_Pago
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `395` extends StObject {
  
  var a: PacificSlashPago_Pago
  
  var c: js.Array[UM]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `395` {
  
  inline def apply(c: js.Array[UM]): `395` = {
    val __obj = js.Dynamic.literal(a = "Pacific/Pago_Pago", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`395`]
  }
  
  extension [Self <: `395`](x: Self) {
    
    inline def setA(value: PacificSlashPago_Pago): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[UM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: UM*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
