package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.IO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `352` extends StObject {
  
  var c: js.Array[IO]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`360`
}
object `352` {
  
  inline def apply(c: js.Array[IO]): `352` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 360)
    __obj.asInstanceOf[`352`]
  }
  
  extension [Self <: `352`](x: Self) {
    
    inline def setC(value: js.Array[IO]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: IO*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`360`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
