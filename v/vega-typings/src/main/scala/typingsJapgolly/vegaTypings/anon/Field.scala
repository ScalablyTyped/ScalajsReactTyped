package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.BaseValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Field
  extends StObject
     with BaseValueRef[Any] {
  
  var field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field
}
object Field {
  
  inline def apply(field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Field = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  extension [Self <: Field](x: Self) {
    
    inline def setField(value: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
