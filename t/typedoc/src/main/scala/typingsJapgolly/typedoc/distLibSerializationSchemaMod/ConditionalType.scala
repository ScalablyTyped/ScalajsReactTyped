package typingsJapgolly.typedoc.distLibSerializationSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.Type */
/* Inlined parent typedoc.typedoc/dist/lib/serialization/schema.S<typedoc.typedoc/dist/lib/models.ConditionalType, 'type' | 'checkType' | 'extendsType' | 'trueType' | 'falseType'> */
trait ConditionalType extends StObject {
  
  var checkType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var extendsType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var falseType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var trueType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]
  
  var `type`: ToSerialized[/* "conditional" */ String]
}
object ConditionalType {
  
  inline def apply(
    checkType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    extendsType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    falseType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    trueType: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType],
    `type`: ToSerialized[/* "conditional" */ String]
  ): ConditionalType = {
    val __obj = js.Dynamic.literal(checkType = checkType.asInstanceOf[js.Any], extendsType = extendsType.asInstanceOf[js.Any], falseType = falseType.asInstanceOf[js.Any], trueType = trueType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalType]
  }
  
  extension [Self <: ConditionalType](x: Self) {
    
    inline def setCheckType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setExtendsType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setTrueType(value: ToSerialized[typingsJapgolly.typedoc.distLibModelsTypesMod.SomeType]): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ToSerialized[/* "conditional" */ String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
