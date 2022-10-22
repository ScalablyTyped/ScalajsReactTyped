package typingsJapgolly.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldField extends StObject {
  
  var field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field
}
object FieldField {
  
  inline def apply(field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): FieldField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldField]
  }
  
  extension [Self <: FieldField](x: Self) {
    
    inline def setField(value: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
