package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`480`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.AU
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `241` extends StObject {
  
  var c: js.Array[AU]
  
  var u: `480`
}
object `241` {
  
  inline def apply(c: js.Array[AU]): `241` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 480)
    __obj.asInstanceOf[`241`]
  }
  
  extension [Self <: `241`](x: Self) {
    
    inline def setC(value: js.Array[AU]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: AU*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: `480`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
