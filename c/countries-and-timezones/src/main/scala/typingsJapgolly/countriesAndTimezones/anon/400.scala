package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-660`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AS
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.UM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400` extends StObject {
  
  var c: js.Tuple2[AS, UM]
  
  var u: `-660`
}
object `400` {
  
  inline def apply(c: js.Tuple2[AS, UM]): `400` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -660)
    __obj.asInstanceOf[`400`]
  }
  
  extension [Self <: `400`](x: Self) {
    
    inline def setC(value: js.Tuple2[AS, UM]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-660`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
