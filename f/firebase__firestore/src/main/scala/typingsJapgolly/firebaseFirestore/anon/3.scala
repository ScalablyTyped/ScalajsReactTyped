package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.NaN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var doubleValue: NaN | Double
}
object `3` {
  
  inline def apply(doubleValue: NaN | Double): `3` = {
    val __obj = js.Dynamic.literal(doubleValue = doubleValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setDoubleValue(value: NaN | Double): Self = StObject.set(x, "doubleValue", value.asInstanceOf[js.Any])
  }
}
