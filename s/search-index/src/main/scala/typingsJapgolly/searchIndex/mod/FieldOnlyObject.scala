package typingsJapgolly.searchIndex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOnlyObject
  extends StObject
     with _Token {
  
  var FIELD: Field
}
object FieldOnlyObject {
  
  inline def apply(FIELD: Field): FieldOnlyObject = {
    val __obj = js.Dynamic.literal(FIELD = FIELD.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOnlyObject]
  }
  
  extension [Self <: FieldOnlyObject](x: Self) {
    
    inline def setFIELD(value: Field): Self = StObject.set(x, "FIELD", value.asInstanceOf[js.Any])
    
    inline def setFIELDVarargs(value: String*): Self = StObject.set(x, "FIELD", js.Array(value*))
  }
}
