package typingsJapgolly.countriesAndTimezones.anon

import typingsJapgolly.countriesAndTimezones.countriesAndTimezonesStrings.GL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `69` extends StObject {
  
  var c: js.Array[GL]
  
  var u: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`
}
object `69` {
  
  inline def apply(c: js.Array[GL]): `69` = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], u = 0)
    __obj.asInstanceOf[`69`]
  }
  
  extension [Self <: `69`](x: Self) {
    
    inline def setC(value: js.Array[GL]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCVarargs(value: GL*): Self = StObject.set(x, "c", js.Array(value*))
    
    inline def setU(value: typingsJapgolly.countriesAndTimezones.countriesAndTimezonesInts.`0`): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
  }
}
