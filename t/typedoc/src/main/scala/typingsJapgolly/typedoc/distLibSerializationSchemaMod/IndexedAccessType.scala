package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.IndexedAccessType, 'type' | 'indexType' | 'objectType'> */
trait IndexedAccessType extends StObject {
  
  var indexType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var objectType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "indexedAccess" */ String]
}
object IndexedAccessType {
  
  inline def apply(
    indexType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    objectType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "indexedAccess" */ String]
  ): IndexedAccessType = {
    val __obj = js.Dynamic.literal(indexType = indexType.asInstanceOf[js.Any], objectType = objectType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexedAccessType]
  }
  
  extension [Self <: IndexedAccessType](x: Self) {
    
    inline def setIndexType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "indexType", value.asInstanceOf[js.Any])
    
    inline def setObjectType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "indexedAccess" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
