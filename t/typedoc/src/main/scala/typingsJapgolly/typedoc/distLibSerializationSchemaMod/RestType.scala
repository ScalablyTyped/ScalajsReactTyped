package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.RestType, 'type' | 'elementType'> */
trait RestType extends StObject {
  
  var elementType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "rest" */ String]
}
object RestType {
  
  inline def apply(
    elementType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "rest" */ String]
  ): RestType = {
    val __obj = js.Dynamic.literal(elementType = elementType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestType]
  }
  
  extension [Self <: RestType](x: Self) {
    
    inline def setElementType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "elementType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "rest" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
