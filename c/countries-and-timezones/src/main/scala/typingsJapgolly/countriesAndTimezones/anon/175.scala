package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.MN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `175` extends StObject {
  
  var c: js.Array[MN]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`
}
object `175` {
  
  inline def apply(c: js.Array[MN]): `175` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 420)
    __obj.asInstanceOf[`175`]
  }
  
  extension [Self <: `175`](x: Self) {
    
    inline def setC(value: js.Array[MN]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: MN*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`420`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
