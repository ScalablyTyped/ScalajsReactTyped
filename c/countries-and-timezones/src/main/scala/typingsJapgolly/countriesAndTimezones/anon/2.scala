package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AfricaSlashLagos
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var a: AfricaSlashLagos
  
  var c: js.Array[CG]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `2` {
  
  inline def apply(c: js.Array[CG]): `2` = {
    val __obj = js.Dynamic.literal(a = "Africa/Lagos", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setA(value: AfricaSlashLagos): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[CG]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CG*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
