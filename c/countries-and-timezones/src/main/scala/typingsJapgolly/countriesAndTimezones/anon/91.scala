package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPuerto_Rico
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.BQ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `91` extends StObject {
  
  var a: AmericaSlashPuerto_Rico
  
  var c: js.Array[BQ]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `91` {
  
  inline def apply(c: js.Array[BQ]): `91` = {
    val __obj = js.Dynamic.literal(a = "America/Puerto_Rico", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`91`]
  }
  
  extension [Self <: `91`](x: Self) {
    
    inline def setA(value: AmericaSlashPuerto_Rico): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[BQ]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: BQ*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
