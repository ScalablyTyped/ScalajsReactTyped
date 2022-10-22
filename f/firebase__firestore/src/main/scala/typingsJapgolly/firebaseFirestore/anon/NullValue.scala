package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.firebaseFirestoreStrings.NULL_VALUE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullValue extends StObject {
  
  var nullValue: NULL_VALUE
}
object NullValue {
  
  inline def apply(): NullValue = {
    val __obj = js.Dynamic.literal(nullValue = "NULL_VALUE")
    __obj.asInstanceOf[NullValue]
  }
  
  extension [Self <: NullValue](x: Self) {
    
    inline def setNullValue(value: NULL_VALUE): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
  }
}
