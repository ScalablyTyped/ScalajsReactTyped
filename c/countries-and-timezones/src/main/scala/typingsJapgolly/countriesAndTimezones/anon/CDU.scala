package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-540`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`-600`
import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDU extends StObject {
  
  var c: js.Array[US]
  
  var d: `-540`
  
  var u: `-600`
}
object CDU {
  
  inline def apply(c: js.Array[US]): CDU = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], d = -540, u = -600)
    __obj.asInstanceOf[CDU]
  }
  
  extension [Self <: CDU](x: Self) {
    
    inline def setC(value: js.Array[US]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: US*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setD(value: `-540`): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setU(value: `-600`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
