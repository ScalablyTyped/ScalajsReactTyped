package typingsJapgolly.vegaTypings.anon

import typingsJapgolly.vegaTypings.typesSpecEncodeMod.ScaledValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldScale
  extends StObject
     with ScaledValueRef[Any] {
  
  var field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field
  
  var scale: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field
}
object FieldScale {
  
  inline def apply(
    field: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field,
    scale: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field
  ): FieldScale = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldScale]
  }
  
  extension [Self <: FieldScale](x: Self) {
    
    inline def setField(value: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setScale(value: typingsJapgolly.vegaTypings.typesSpecEncodeMod.Field): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
