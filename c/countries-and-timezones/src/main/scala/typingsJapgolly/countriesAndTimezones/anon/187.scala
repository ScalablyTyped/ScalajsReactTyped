package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `187` extends StObject {
  
  var c: js.Array[MY]
  
  var u: `480`
}
object `187` {
  
  inline def apply(c: js.Array[MY]): `187` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`187`]
  }
  
  extension [Self <: `187`](x: Self) {
    
    inline def setC(value: js.Array[MY]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MY*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
