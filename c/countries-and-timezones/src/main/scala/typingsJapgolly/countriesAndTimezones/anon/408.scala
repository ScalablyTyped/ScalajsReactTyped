package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-600`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.PF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `408` extends StObject {
  
  var c: js.Array[PF]
  
  var u: `-600`
}
object `408` {
  
  inline def apply(c: js.Array[PF]): `408` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = -600)
    __obj.asInstanceOf[`408`]
  }
  
  extension [Self <: `408`](x: Self) {
    
    inline def setC(value: js.Array[PF]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: PF*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `-600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
