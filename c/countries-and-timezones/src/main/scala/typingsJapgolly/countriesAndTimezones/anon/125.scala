package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashPuerto_Rico
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.LC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `125` extends StObject {
  
  var a: AmericaSlashPuerto_Rico
  
  var c: js.Array[LC]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `125` {
  
  inline def apply(c: js.Array[LC]): `125` = {
    val __obj = js.Dynamic.literal(a = "America/Puerto_Rico", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`125`]
  }
  
  extension [Self <: `125`](x: Self) {
    
    inline def setA(value: AmericaSlashPuerto_Rico): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[LC]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: LC*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
