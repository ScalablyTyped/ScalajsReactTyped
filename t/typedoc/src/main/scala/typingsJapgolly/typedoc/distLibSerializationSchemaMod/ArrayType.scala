package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ArrayType, 'type' | 'elementType'> */
trait ArrayType extends StObject {
  
  var elementType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "array" */ String]
}
object ArrayType {
  
  inline def apply(
    elementType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "array" */ String]
  ): ArrayType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayType]
  }
  
  extension [Self <: ArrayType](x: Self) {
    
    inline def setElementType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "array" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
