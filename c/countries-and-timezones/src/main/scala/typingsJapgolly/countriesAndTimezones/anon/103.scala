package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AmericaSlashToronto
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.CA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `103` extends StObject {
  
  var a: AmericaSlashToronto
  
  var c: js.Array[CA]
  
  var r: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`
}
object `103` {
  
  inline def apply(c: js.Array[CA]): `103` = {
    val __obj = js.Dynamic.literal(a = "America/Toronto", c = c.asInstanceOf[js.Any], r = 1)
    __obj.asInstanceOf[`103`]
  }
  
  extension [Self <: `103`](x: Self) {
    
    inline def setA(value: AmericaSlashToronto): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    inline def setC(value: js.Array[CA]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: CA*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setR(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`1`): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
