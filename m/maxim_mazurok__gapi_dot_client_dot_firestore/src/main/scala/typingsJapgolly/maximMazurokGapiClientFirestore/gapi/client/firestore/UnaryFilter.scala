package typingsJapgolly.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnaryFilter extends StObject {
  
  /** The field to which to apply the operator. */
  var field: js.UndefOr[FieldReference] = js.undefined
  
  /** The unary operator to apply. */
  var op: js.UndefOr[String] = js.undefined
}
object UnaryFilter {
  
  inline def apply(): UnaryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnaryFilter]
  }
  
  extension [Self <: UnaryFilter](x: Self) {
    
    inline def setField(value: FieldReference): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
  }
}
