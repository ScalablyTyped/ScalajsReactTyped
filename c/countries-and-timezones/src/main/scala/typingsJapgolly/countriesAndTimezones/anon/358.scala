package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MV
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `358` extends StObject {
  
  var c: js.Array[MV]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`300`
}
object `358` {
  
  inline def apply(c: js.Array[MV]): `358` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 300)
    __obj.asInstanceOf[`358`]
  }
  
  extension [Self <: `358`](x: Self) {
    
    inline def setC(value: js.Array[MV]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MV*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`300`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
